#!/usr/bin/env python3
"""Prints medians/spread for every result file found in a results directory (see run_all.sh)."""
import csv
import json
import re
import statistics
import sys
from pathlib import Path

VARIANTS = ["default", "res", "cmp"]


def percentile(values, p):
    values = sorted(values)
    k = (len(values) - 1) * p / 100
    f = int(k)
    c = min(f + 1, len(values) - 1)
    return values[f] + (values[c] - values[f]) * (k - f)


def stats(values):
    return f"median={statistics.median(values):.1f} min={min(values):.1f} max={max(values):.1f} p90={percentile(values, 90):.1f}"


def per_variant(rows, columns, title):
    print(f"\n### {title}")
    for variant in VARIANTS:
        selected = [r for r in rows if r["variant"] == variant]
        parts = [f"{variant:8} n={len(selected):<3}"]
        for column in columns:
            values = [float(r[column]) for r in selected if r.get(column) not in ("", None)]
            if values:
                parts.append(f"{column}: {stats(values)}")
        print("  " + " | ".join(parts))


def micro(path):
    print("\n### Microbenchmarks (ns)")
    for b in json.loads(path.read_text())["benchmarks"]:
        m = b["metrics"]["timeNs"]
        name = b["className"].split(".")[-1] + "." + b["name"]
        print(f"  {name:70} median={m['median']:>12,.0f} min={m['minimum']:>12,.0f} max={m['maximum']:>12,.0f}")


def macro(path):
    print("\n### Macrobenchmarks")
    for b in json.loads(path.read_text())["benchmarks"]:
        for key, m in b["metrics"].items():
            print(f"  {b['name']:40} {key:28} n={len(m['runs']):<3} {stats(m['runs'])}")
        for key, m in b.get("sampledMetrics", {}).items():
            print(f"  {b['name']:40} {key:28} P50={m['P50']:.2f} P90={m['P90']:.2f} P99={m['P99']:.2f}")


def main(results_dir):
    for path in sorted(results_dir.rglob("*"), key=lambda p: (p.name != "device.txt", str(p))):
        if path.name == "device.txt":
            print(f"\n## {path.parent.name}: {path.read_text().strip()}")
        elif path.name == "micro.json":
            micro(path)
        elif path.name == "macro.json":
            macro(path)
        elif path.name == "startup.csv":
            per_variant(list(csv.DictReader(path.open())), ["TotalTime_ms", "TotalPSS_kB"], f"Cold start am start -W ({path.parent.name})")
        elif path.name == "probe.txt":
            rows = [
                {"variant": m[1], "first400_us": m[2], "next2_us": m[3]}
                for m in (re.search(r"variant=(\w+) first400_us=(\d+) next2_us=(\d+)", line) for line in path.open())
                if m
            ]
            per_variant(rows, ["first400_us", "next2_us"], f"First font resolution in a fresh process, µs ({path.parent.name})")
        elif path.name == "scroll.csv":
            per_variant(list(csv.DictReader(path.open())), ["janky_pct", "p50", "p90", "p99"], f"Scroll gfxinfo ({path.parent.name})")
        elif path.name == "apk.txt":
            print(f"\n### APK ({path.parent.name})\n" + path.read_text().rstrip())


if __name__ == "__main__":
    main(Path(sys.argv[1] if len(sys.argv) > 1 else "results").resolve())

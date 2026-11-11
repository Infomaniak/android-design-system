#!/usr/bin/env bash
# Runs the whole benchmark suite on the connected device and prints a summary.
# Usage: run_all.sh [--quick]   (--quick: fewer runs, no Macrobenchmark)
source "$(dirname "$0")/common.sh"
require_device

RUNS=15
SCROLL_RUNS=8
QUICK=0
[[ "${1:-}" == "--quick" ]] && { RUNS=5; SCROLL_RUNS=3; QUICK=1; }

[[ -f "$BENCH_DIR/app/src/main/res/font/infomaniak_sans.ttf" ]] || "$(dirname "$0")/fetch_fonts.sh"

OUT="$BENCH_DIR/results/$(date +%Y-%m-%d_%H-%M-%S)"
mkdir -p "$OUT"
device_info | tee "$OUT/device.txt"

"$(dirname "$0")/run_micro.sh" "$OUT/micro"
[[ "$QUICK" == "0" ]] && "$(dirname "$0")/run_macro.sh" "$OUT/macro"

# Default packaging (fonts deflate-compressed in the APK), then fonts stored uncompressed.
for mode in compressed uncompressed; do
    dir="$OUT/$mode"
    mkdir -p "$dir"
    NO_COMPRESS_FONTS=$([[ "$mode" == "uncompressed" ]] && echo 1 || echo 0) install_app
    apk="$BENCH_DIR/app/build/outputs/apk/benchmark/app-benchmark.apk"
    { echo "size_bytes=$(wc -c < "$apk" | tr -d ' ')"; unzip -v "$apk" | grep '\.ttf'; } > "$dir/apk.txt"
    "$(dirname "$0")/run_probe.sh" "$dir" "$RUNS"
    "$(dirname "$0")/run_startup.sh" "$dir" "$RUNS"
    [[ "$mode" == "compressed" ]] && "$(dirname "$0")/run_scroll.sh" "$dir" "$SCROLL_RUNS"
done

python3 "$(dirname "$0")/summarize.py" "$OUT" | tee "$OUT/SUMMARY.txt"
echo -e "\nResults saved in $OUT"

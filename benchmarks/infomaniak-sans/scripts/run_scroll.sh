#!/usr/bin/env bash
# Scroll frame timing through dumpsys gfxinfo (more reliable than FrameTimingMetric on emulators).
# Usage: run_scroll.sh <output_dir> [runs]
source "$(dirname "$0")/common.sh"
OUT="${1:?output dir}"
RUNS="${2:-8}"
require_device
mkdir -p "$OUT"

size=$($ADB shell wm size | awk -F': ' '/size/ { print $2 }' | tail -1 | tr -d '\r')
width=${size%x*}
height=${size#*x}
x=$((width / 2))
top=$((height / 6))
bottom=$((height * 4 / 5))

csv="$OUT/scroll.csv"
raw="$OUT/scroll_raw.txt"
echo "run,variant,frames,janky,janky_pct,p50,p90,p95,p99" > "$csv"
: > "$raw"
percentile() { echo "$1" | awk -v k="$2" '$0 ~ "^"k { gsub("ms", "", $NF); print $NF; exit }'; }
for i in $(seq 1 "$RUNS"); do
    for v in "${VARIANTS[@]}"; do
        $ADB shell am force-stop "$APP_PKG"
        sleep 1
        $ADB shell am start -W -S -n "$APP_PKG/.MainActivity" --es font "$v" >/dev/null
        sleep 2
        $ADB shell dumpsys gfxinfo "$APP_PKG" reset >/dev/null
        for _ in 1 2 3 4 5 6; do $ADB shell input swipe "$x" "$bottom" "$x" "$top" 120; sleep 0.8; done
        for _ in 1 2; do $ADB shell input swipe "$x" "$top" "$x" "$bottom" 120; sleep 0.8; done
        g=$($ADB shell dumpsys gfxinfo "$APP_PKG" | tr -d '\r')
        { echo "=== run $i $v"; echo "$g" | sed -n '1,20p'; } >> "$raw"
        frames=$(echo "$g" | awk -F': ' '/Total frames rendered/ { print $2; exit }')
        janky=$(echo "$g" | awk '/Janky frames:/ && !/legacy/ { print $3, $4; exit }' | tr -d '()%')
        echo "$i,$v,$frames,${janky% *},${janky#* },$(percentile "$g" '50th percentile'),$(percentile "$g" '90th percentile'),$(percentile "$g" '95th percentile'),$(percentile "$g" '99th percentile')" | tee -a "$csv"
    done
done

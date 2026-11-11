#!/usr/bin/env bash
# Cold startup (am start -W -S) and memory (TOTAL PSS), variants interleaved to spread noise evenly.
# Usage: run_startup.sh <output_dir> [runs]
source "$(dirname "$0")/common.sh"
OUT="${1:?output dir}"
RUNS="${2:-15}"
require_device
mkdir -p "$OUT"

csv="$OUT/startup.csv"
echo "run,variant,TotalTime_ms,WaitTime_ms,TotalPSS_kB" > "$csv"
for i in $(seq 1 "$RUNS"); do
    for v in "${VARIANTS[@]}"; do
        $ADB shell am force-stop "$APP_PKG"
        sleep 1
        r=$($ADB shell am start -W -S -n "$APP_PKG/.MainActivity" --es font "$v")
        total=$(echo "$r" | awk '/TotalTime/ { print $2 }' | tr -d '\r')
        wait=$(echo "$r" | awk '/WaitTime/ { print $2 }' | tr -d '\r')
        sleep 3
        pss=$($ADB shell dumpsys meminfo "$APP_PKG" | awk '/TOTAL PSS:/ { print $3; exit }')
        echo "$i,$v,$total,$wait,$pss" | tee -a "$csv"
    done
done

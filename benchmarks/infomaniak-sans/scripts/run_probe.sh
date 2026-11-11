#!/usr/bin/env bash
# First font resolution in a fresh process (weight 400, then 500 + 700), logged by the app itself.
# Usage: run_probe.sh <output_dir> [runs]
source "$(dirname "$0")/common.sh"
OUT="${1:?output dir}"
RUNS="${2:-15}"
require_device
mkdir -p "$OUT"

log="$OUT/probe.txt"
: > "$log"
for i in $(seq 1 "$RUNS"); do
    for v in "${VARIANTS[@]}"; do
        $ADB shell am force-stop "$APP_PKG"
        $ADB logcat -c
        sleep 0.5
        $ADB shell am start -W -S -n "$APP_PKG/.MainActivity" --es font "$v" --ez probe true >/dev/null
        sleep 1
        $ADB logcat -d -s FontBench:I | grep probe | tail -1 | tee -a "$log"
    done
done

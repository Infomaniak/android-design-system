#!/usr/bin/env bash
# Microbenchmarks: text measurement and font loading (default vs res/font vs CMP asset font).
# Usage: run_micro.sh <output_dir>
source "$(dirname "$0")/common.sh"
OUT="${1:?output dir}"
SUPPRESS="${MICRO_SUPPRESS_ERRORS:-EMULATOR}"
require_device
mkdir -p "$OUT"

gradle :microbench:assembleAndroidTest
$ADB install -r -t "$BENCH_DIR/microbench/build/outputs/apk/androidTest/release/microbench-release-androidTest.apk" >/dev/null
$ADB shell cmd package compile -m speed -f "$MICRO_PKG" >/dev/null

DEVICE_DIR="/storage/emulated/0/Android/media/$MICRO_PKG"
$ADB shell rm -rf "$DEVICE_DIR" >/dev/null 2>&1 || true
$ADB shell am instrument -w \
    -e androidx.benchmark.suppressErrors "$SUPPRESS" \
    "$MICRO_PKG/androidx.benchmark.junit4.AndroidBenchmarkRunner" | tee "$OUT/micro_instrument.txt"

json=$($ADB shell ls "$DEVICE_DIR" | tr -d '\r' | grep 'benchmarkData.json$' | head -1)
$ADB pull "$DEVICE_DIR/$json" "$OUT/micro.json" >/dev/null
echo "Microbenchmark results: $OUT/micro.json"

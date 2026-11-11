#!/usr/bin/env bash
# Macrobenchmark: cold startup (StartupTimingMetric) and scroll (FrameTimingMetric) for each variant.
# On emulators FrameTimingMetric finds no frames, so only startup tests run there (use run_scroll.sh instead).
# Usage: run_macro.sh <output_dir>
source "$(dirname "$0")/common.sh"
OUT="${1:?output dir}"
require_device
mkdir -p "$OUT"

args=(-Pandroid.testInstrumentationRunnerArguments.androidx.benchmark.suppressErrors="${MACRO_SUPPRESS_ERRORS:-EMULATOR,LOW-BATTERY}")
if [[ "$($ADB shell getprop ro.kernel.qemu | tr -d '\r')" == "1" ]]; then
    args+=(-Pandroid.testInstrumentationRunnerArguments.tests_regex=startup)
fi

rm -rf "$BENCH_DIR/macro/build/outputs/connected_android_test_additional_output"
gradle :macro:connectedBenchmarkAndroidTest "${args[@]}" || echo "Some Macrobenchmark tests failed, see macro/build/reports." >&2
find "$BENCH_DIR/macro/build/outputs" -name '*benchmarkData.json' -exec cp {} "$OUT/macro.json" \;
echo "Macrobenchmark results: $OUT/macro.json"

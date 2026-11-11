#!/usr/bin/env bash
# Shared helpers. Source this file from the other scripts.
set -euo pipefail

BENCH_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
GRADLEW="$BENCH_DIR/../../gradlew"
APP_PKG="bench.font"
MICRO_PKG="bench.micro.test"
VARIANTS=(default res cmp)

export ANDROID_HOME="${ANDROID_HOME:-${ANDROID_SDK_ROOT:-$HOME/Library/Android/sdk}}"
if command -v adb >/dev/null 2>&1; then
    ADB="adb"
else
    ADB="$ANDROID_HOME/platform-tools/adb"
fi
[[ -n "${ANDROID_SERIAL:-}" ]] && ADB="$ADB -s $ANDROID_SERIAL"

require_device() {
    local count
    count=$($ADB devices | awk 'NR > 1 && $2 == "device"' | wc -l | tr -d ' ')
    if [[ "$count" -eq 0 ]]; then
        echo "No device connected. Start an emulator or plug a device (adb devices)." >&2
        exit 1
    elif [[ "$count" -gt 1 && -z "${ANDROID_SERIAL:-}" ]]; then
        echo "Several devices connected. Select one with ANDROID_SERIAL=<serial>." >&2
        exit 1
    fi
}

gradle() { (cd "$BENCH_DIR" && "$GRADLEW" --quiet "$@"); }

# Builds and installs the app (fonts compressed in the APK unless NO_COMPRESS_FONTS=1), AOT-compiled.
install_app() {
    local extra=()
    [[ "${NO_COMPRESS_FONTS:-0}" == "1" ]] && extra=(-PnoCompressFonts)
    gradle :app:assembleBenchmark "${extra[@]+"${extra[@]}"}"
    $ADB install -r "$BENCH_DIR/app/build/outputs/apk/benchmark/app-benchmark.apk" >/dev/null
    $ADB shell cmd package compile -m speed -f "$APP_PKG" >/dev/null
}

device_info() {
    echo "model=$($ADB shell getprop ro.product.model | tr -d '\r')" \
        "sdk=$($ADB shell getprop ro.build.version.sdk | tr -d '\r')" \
        "build=$($ADB shell getprop ro.build.id | tr -d '\r')" \
        "abi=$($ADB shell getprop ro.product.cpu.abi | tr -d '\r')" \
        "emulator=$($ADB shell getprop ro.kernel.qemu | tr -d '\r')"
}

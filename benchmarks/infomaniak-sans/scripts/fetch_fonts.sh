#!/usr/bin/env bash
# Downloads Infomaniak Sans from Infomaniak/design-system into the bench modules.
# FONT_REF selects the design-system commit/branch/tag (defaults to the commit used for the reference results).
set -euo pipefail

BENCH_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
FONT_REF="${FONT_REF:-634de3bce734290c077e66b20f7248c21d7ea7d8}"
BASE_URL="https://raw.githubusercontent.com/Infomaniak/design-system/$FONT_REF/packages/assets/fonts/fonts/infomaniak-sans"

tmp=$(mktemp -d)
trap 'rm -rf "$tmp"' EXIT
curl -fsSL "$BASE_URL/infomaniak-sans.variable.normal.%5Bopsz,wght%5D.ttf" -o "$tmp/infomaniak_sans.ttf"
curl -fsSL "$BASE_URL/infomaniak-sans.variable.italic.%5Bopsz,wght%5D.ttf" -o "$tmp/infomaniak_sans_italic.ttf"

for dir in app/src/main/res/font cmpres/src/commonMain/composeResources/font; do
    mkdir -p "$BENCH_DIR/$dir"
    cp "$tmp"/*.ttf "$BENCH_DIR/$dir/"
done
mkdir -p "$BENCH_DIR/microbench/src/main/res/font"
cp "$tmp/infomaniak_sans.ttf" "$BENCH_DIR/microbench/src/main/res/font/"

echo "Fonts downloaded from Infomaniak/design-system@$FONT_REF"

# Infomaniak Sans benchmark

Measures whether rendering text with the variable font **Infomaniak Sans** is slower than the system font (Roboto) in
Jetpack Compose on Android.

Three variants are compared everywhere:

| Variant   | Font loading                                                                                         |
|-----------|------------------------------------------------------------------------------------------------------|
| `default` | `FontFamily.Default` (system Roboto, preloaded by Android)                                           |
| `res`     | `res/font` + `androidx.compose.ui.text.font.Font(R.font.…, variationSettings = …)` (Android only)    |
| `cmp`     | `composeResources/font` + `org.jetbrains.compose.resources.Font(Res.font.…)` (Kotlin Multiplatform) |

This is a standalone Gradle project: it is not included in the root build and is not published.

## Requirements

- JDK 17+ (`JAVA_HOME`)
- Android SDK (`ANDROID_HOME`, defaults to `~/Library/Android/sdk`)
- One device or emulator connected (API 28+). Use `ANDROID_SERIAL=<serial>` if several are connected. Start emulators
  with a hardware GPU (`emulator -avd <name> -gpu host`): the software renderer roughly triples startup times.
- `python3` and `curl`

## Run

```bash
cd benchmarks/infomaniak-sans
./scripts/fetch_fonts.sh        # Downloads the fonts from Infomaniak/design-system
./scripts/run_all.sh            # Full suite (~30-40 min on an emulator)
./scripts/run_all.sh --quick    # Fewer runs, no Macrobenchmark (~10 min)
```

Results are saved in `results/<date>/` with a `SUMMARY.txt`. `python3 scripts/summarize.py results/<date>` prints it again.

The fonts are pinned to the design-system commit used for the reference results. Use another version with
`FONT_REF=<commit|branch|tag> ./scripts/fetch_fonts.sh`.

Each measurement can also be run alone, for example `./scripts/run_startup.sh results/manual 20`:

| Script            | Measures                                                                                                 |
|-------------------|----------------------------------------------------------------------------------------------------------|
| `run_micro.sh`    | Microbenchmarks: `TextMeasurer` layout (no cache), font resolution, raw platform font loads             |
| `run_macro.sh`    | Macrobenchmark: cold startup (`StartupTimingMetric`) and scroll (`FrameTimingMetric`)                    |
| `run_probe.sh`    | First font resolution in a fresh process, logged by the app (the real one-time cost)                     |
| `run_startup.sh`  | Cold start `am start -W -S` and `TOTAL PSS`, variants interleaved                                        |
| `run_scroll.sh`   | Scroll frame timing through `dumpsys gfxinfo`                                                            |

Scripts that install the app (`run_all.sh`) build it twice: once with the default packaging (`.ttf` deflate-compressed in
the APK) and once with `androidResources { noCompress += "ttf" }` (`-PnoCompressFonts`).

## Reference results

Emulator API 36.1 arm64 (Play image, 2 GB RAM) on an Apple M1 Max host, `benchmark` build type (release, not
debuggable, no R8, no Baseline Profile), AOT-compiled. Medians.

| Measurement                                          | `default`   | `res`         | `cmp`         |
|------------------------------------------------------|-------------|---------------|---------------|
| `TextMeasurer` layout, 500 chars                     | 99–101 µs   | 100–102 µs    | 100–105 µs    |
| First font resolution in a fresh process, compressed | 0.25 ms     | ~11.5 ms      | ~20 ms        |
| First font resolution in a fresh process, `noCompress` | 0.23 ms   | ~4.7 ms       | ~3.7 ms       |
| Cold start `am start -W`, compressed                 | 191 ms      | 195 ms        | 210 ms        |
| Cold start `am start -W`, `noCompress`               | 180 ms      | 187 ms        | 187 ms        |
| Scroll: janky frames / p90 / p99                     | 1.5 % / 19 / 21 ms | 1.7 % / 19 / 21 ms | 1.7 % / 19 / 21.5 ms |
| TOTAL PSS after start                                | 59.3 MB     | +0.9 MB       | +2.8 MB       |

Once loaded, the font costs the same as Roboto. The only cost is the first load in each process, which is mostly the
decompression of the `.ttf` from the APK. The CMP path reads the file once per declared weight.

## Limits

- Emulators are much faster than mid-range phones at I/O and decompression: run on real devices to get absolute numbers.
- Differences under ~10 ms in startup measurements are within the noise. Compare interleaved runs (`run_startup.sh`,
  `run_probe.sh`) rather than Macrobenchmark blocks. Close other heavy processes (Gradle builds, IDE indexing) while
  measuring: they skew emulator results a lot.
- `FrameTimingMetric` reports 0 frames on emulators, so `run_macro.sh` only runs the startup tests there: use
  `run_scroll.sh` instead.
- The microbenchmark APK is AOT-compiled by hand and run with `am instrument` instead of the benchmark Gradle plugin.
  Only the `EMULATOR` error is suppressed by default (`MICRO_SUPPRESS_ERRORS` to change it).
- Not measured: iOS, Desktop, Android < 8.0, Android "Bold text", the `opsz` axis and glyph fallback (emoji, CJK, Arabic).

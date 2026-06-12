# Android Design System

This project contains a Kotlin script that parses a Figma token export and generates Material 3 Kotlin source files.

---

## How it works

The script reads `token-source/android_specific_tokens.json` (a Figma token export) and produces:

| Output                                           | Location                                            |
|--------------------------------------------------|-----------------------------------------------------|
| Shared color primitives object                   | `PrimitiveTokens/…/ColorPrimitives.kt`              |
| `ExtendedColors` data class definition           | `Foundation/…/ExtendedColors.kt`                    |
| Per-product color scheme instances (×6 modes)    | `Theme<Product>/…/<Product><Mode>ColorScheme.kt`    |
| Per-product extended colors instances (×6 modes) | `Theme<Product>/…/<Product><Mode>ExtendedColors.kt` |

The script auto-detects the repo root by walking up to the nearest `settings.gradle.kts`, so it can be run from any subdirectory.

---

## Running the script

**From a terminal, anywhere inside the repo:**

```bash
kotlin scripts/generateAndroidSpecificTokens.main.kts
```

**From Android Studio:**  
Open `scripts/generateAndroidSpecificTokens.main.kts`, then click the ▶ run button in the gutter.

---

## Configuration

All configuration lives at the top of `scripts/generateAndroidSpecificTokens.main.kts`.

### Adding a new product

Every time a new product is supported inside the JSON and needs to be generated, add an entry to `productConfigs`:

```kotlin
ProductConfig(
    product = "Mail", // must match the mode name in the JSON "Product" collection
    packageName = "com.infomaniak.designsystem.mail",
    outputDir = repoRoot.resolve("ThemeMail/src/main/kotlin/com/infomaniak/designsystem/mail"),
)
```

### Adding a new token group

Although it should not serve very often, this can be done by adding an entry to `groupConfigs`:

```kotlin
GroupConfig(
    jsonGroupName = "My Group", // must match the group name inside each Theme mode in the JSON
    instanceSuffix = "MyTokens", // e.g. CalendarLightMyTokens
    subPackage = "mytokens", // sub-folder/sub-package inside the product's output dir
    excluded = emptySet(),
    kind = GroupKind.GeneratedDataClass(
        name = "MyTokens",
        packageName = "com.infomaniak.designsystem.core.tokens",
        outputDir = repoRoot.resolve("Foundation/src/main/kotlin/com/infomaniak/designsystem/core/tokens"),
    ),
)
```

### Excluding roles

Add role names to `excludedRoles` (global) or to a specific group's `excluded` set to omit them from generation.

### Changing the token source file

Replace `token-source/android_specific_tokens.json` with the new export — no script change needed.

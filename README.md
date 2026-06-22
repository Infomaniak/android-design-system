# Android Design System

## Structure

The library exposes two module types for consumption:

- **Foundation** — Core theme infrastructure with token definitions and `EsdsTheme.Values` composition
- **Theme*** — Theme implementations (e.g. `ThemeMail`, `ThemeCalendar`) that provide themed `EsdsTheme.Values` instances that can
  be consumed through composition local by providing it through `LocalEsdsTheme`

## Material tokens

The README for the material tokens generator script can be in [`scripts/README.md`](scripts/README.md).

These colors must be consumed to support material functionalities such as accessibility settings for contrasts or user's system
colors.

## Post-generation setup

Tokens are generated through PRs automatically opened on this repo, but those PRs are incomplete and can't be consumed as-is.

The generated code only produces internal instances for the classes defined in
the [tokens](Foundation/src/main/kotlin/com/infomaniak/designsystem/core/tokens) folder.

Each theme module also needs a **public `EsdsTheme.Values` instance** that groups those internal tokens together. One instance
must be created manually per exposed theme (light, dark, etc.).

The different dimensions for light/dark/etc. should be the following and will be used according to the user's accessibility
settings:

* Light
* LightMediumContrast
* LightHighContrast
* Dark
* DarkMediumContrast
* DarkHighContrast

### Example

`MailLightTheme` should look like:

```kotlin
val MailLightTheme: EsdsTheme.Values = EsdsTheme.Values(
    border = MailLightBorderTokens,
    color = MailLightColorTokens,
    font = MailLightFontTokens,
    icon = MailLightIconTokens,
    spacing = MailLightSpacingTokens,
    radius = MailLightRadiusTokens,
    text = MailLightTextTokens,
    typography = MailLightTypographyTokens,
    materialColorScheme = LightScheme,
)
```

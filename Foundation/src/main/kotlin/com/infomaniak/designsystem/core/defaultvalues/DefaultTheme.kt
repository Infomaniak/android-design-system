package com.infomaniak.designsystem.core.defaultvalues

import com.infomaniak.designsystem.core.defaultvalues.material.LightScheme
import com.infomaniak.designsystem.core.theme.EsdsTheme

val DefaultTheme: EsdsTheme.Values = EsdsTheme.Values(
    border = DefaultBorderTokens,
    font = DefaultFontTokens,
    icon = DefaultIconTokens,
    spacing = DefaultSpacingTokens,
    radius = DefaultRadiusTokens,
    text = DefaultTextTokens,
    typography = DefaultTypographyTokens,
    materialColorScheme = LightScheme,
)

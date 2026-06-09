/*
    Manually written
*/

package com.infomaniak.designsystem.core.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.infomaniak.designsystem.core.defaultvalues.DefaultTheme
import com.infomaniak.designsystem.core.tokens.BorderTokens
import com.infomaniak.designsystem.core.tokens.ColorTokens
import com.infomaniak.designsystem.core.tokens.FontTokens
import com.infomaniak.designsystem.core.tokens.IconTokens
import com.infomaniak.designsystem.core.tokens.RadiusTokens
import com.infomaniak.designsystem.core.tokens.SpacingTokens
import com.infomaniak.designsystem.core.tokens.TextTokens
import com.infomaniak.designsystem.core.tokens.TypographyTokens

/**
 * Contains functions to access the current theme values provided at the call site's position in the
 * hierarchy.
 */
object EsdsTheme {
    val border: BorderTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.border

    val icon: IconTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.icon

    val spacing: SpacingTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.spacing

    val radius: RadiusTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.radius

    val typography: TypographyTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.typography

    val LocalEsdsTheme: ProvidableCompositionLocal<Values> = staticCompositionLocalOf {
        Values()
    }

    @Immutable
    class Values(
        val border: BorderTokens = DefaultTheme.border,
        private val color: ColorTokens = DefaultTheme.color,
        private val font: FontTokens = DefaultTheme.font,
        val icon: IconTokens = DefaultTheme.icon,
        val spacing: SpacingTokens = DefaultTheme.spacing,
        val radius: RadiusTokens = DefaultTheme.radius,
        private val text: TextTokens = DefaultTheme.text,
        val typography: TypographyTokens = DefaultTheme.typography,
        val materialColorScheme: ColorScheme = DefaultTheme.materialColorScheme,
    )
}

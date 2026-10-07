/*
    Manually written
*/

package com.infomaniak.designsystem.core.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.infomaniak.designsystem.core.defaultvalues.DefaultTheme
import com.infomaniak.designsystem.core.tokens.ExtendedColorScheme
import com.infomaniak.designsystem.core.tokens.IconTokens
import com.infomaniak.designsystem.core.tokens.OpacityTokens
import com.infomaniak.designsystem.core.tokens.RadiusTokens
import com.infomaniak.designsystem.core.tokens.SpacingTokens

/**
 * Contains functions to access the current theme values provided at the call site's position in the
 * hierarchy.
 */
object EsdsTheme {
    val MaterialTheme.extendedColorScheme: ExtendedColorScheme
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.extendedColorScheme

    val icon: IconTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.icon

    val spacing: SpacingTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.spacing

    val radius: RadiusTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.radius

    val opacity: OpacityTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.opacity

    val LocalEsdsTheme: ProvidableCompositionLocal<Values> = staticCompositionLocalOf {
        Values()
    }

    @Immutable
    class Values(
        val materialColorScheme: ColorScheme = DefaultTheme.materialColorScheme,
        val extendedColorScheme: ExtendedColorScheme = DefaultTheme.extendedColorScheme,
        val icon: IconTokens = DefaultTheme.icon,
        val spacing: SpacingTokens = DefaultTheme.spacing,
        val radius: RadiusTokens = DefaultTheme.radius,
        val opacity: OpacityTokens = DefaultTheme.opacity,
    )
}

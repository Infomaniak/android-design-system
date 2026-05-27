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
import com.infomaniak.designsystem.core.defaultvalues.DefaultColors
import com.infomaniak.designsystem.core.defaultvalues.DefaultRadius
import com.infomaniak.designsystem.core.defaultvalues.DefaultTheme
import com.infomaniak.designsystem.core.tokens.ColorTokens
import com.infomaniak.designsystem.core.tokens.RadiusTokens

/**
 * Contains functions to access the current theme values provided at the call site's position in the
 * hierarchy.
 */
object EsdsTheme {
    val color: ColorTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.color

    val radius: RadiusTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.spacing

    // val border: BorderTokens
    //     @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.border

    // val spacing: SpacingTokens
    //     @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.spacing

    val LocalEsdsTheme: ProvidableCompositionLocal<Values> = staticCompositionLocalOf {
        Values()
    }

    @Immutable
    class Values(
        val color: ColorTokens = DefaultColors,
        val spacing: RadiusTokens = DefaultRadius,
        // val border: BorderTokens = BorderTokens(),
        // val spacing: SpacingTokens = SpacingTokens(),
        // val icon: IconTokens = IconTokens(),
        val materialColorScheme: ColorScheme = DefaultTheme.materialColorScheme,
    )
}

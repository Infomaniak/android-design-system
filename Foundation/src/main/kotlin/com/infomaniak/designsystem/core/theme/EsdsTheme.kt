/*
  Manually written
*/

package com.infomaniak.designsystem.core.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
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

    val LocalEsdsTheme: ProvidableCompositionLocal<Values> = staticCompositionLocalOf {
        Values()
    }

    @Immutable
    class Values(
        val color: ColorTokens = ColorTokens(),
        val spacing: RadiusTokens = RadiusTokens(),
    )
}

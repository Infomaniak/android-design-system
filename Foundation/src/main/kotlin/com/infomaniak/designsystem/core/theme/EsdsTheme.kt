/*
  Manually written
*/

package com.infomaniak.designsystem.core.theme

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.infomaniak.designsystem.core.tokens.ColorTokens
import com.infomaniak.designsystem.core.tokens.RadiusTokens

object EsdsTheme {
    val color: ColorTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.color

    val radius: RadiusTokens
        @Composable @ReadOnlyComposable get() = LocalEsdsTheme.current.spacing

    val LocalEsdsTheme get() = _localExtendedMaterialTheme

    @Immutable
    class Values(
        val color: ColorTokens = ColorTokens(), // TODO
        val spacing: RadiusTokens = RadiusTokens(), // TODO
    )
}

@SuppressLint("CompositionLocalNaming")
private val _localExtendedMaterialTheme: ProvidableCompositionLocal<EsdsTheme.Values> = staticCompositionLocalOf {
    EsdsTheme.Values()
}

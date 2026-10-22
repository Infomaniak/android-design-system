package com.infomaniak.designsystem.icons.symbols

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.vector.ImageVector

val LocalEsdsIconSize: ProvidableCompositionLocal<Symbol.Size> = compositionLocalOf { Symbol.Size.Medium }

sealed interface Symbol {
    val ExtraSmall: ImageVector
    val Small: ImageVector
    val Medium: ImageVector
    val Large: ImageVector
    val ExtraLarge: ImageVector

    val current: ImageVector
        @Composable
        @ReadOnlyComposable
        get() = LocalEsdsIconSize.current.toImageVector(this)

    enum class Size(val toImageVector: (Symbol) -> ImageVector) {
        ExtraSmall(Symbol::ExtraSmall),
        Small(Symbol::Small),
        Medium(Symbol::Medium),
        Large(Symbol::Large),
        ExtraLarge(Symbol::ExtraLarge),
    }
}

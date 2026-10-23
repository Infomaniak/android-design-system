package com.infomaniak.designsystem.catalog.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import com.infomaniak.designsystem.core.theme.EsdsTheme.LocalEsdsTheme

/** Applies the theme chosen in the [ThemeScreen], updating instantly whenever it changes. */
@Composable
internal fun CatalogTheme(content: @Composable () -> Unit) {
    val darkMode by rememberDarkMode()
    val appTheme by rememberAppTheme()
    val contrast by rememberContrast()
    val theme = resolveTheme(darkMode, appTheme, contrast)

    SystemBarsAppearance(isDark = theme.isDark)
    CompositionLocalProvider(LocalEsdsTheme provides theme.values) {
        MaterialTheme(colorScheme = theme.values.materialColorScheme, content = content)
    }
}

/** Makes the content drawn by the system over the app (e.g. the clock) readable on its background. */
@Composable
internal expect fun SystemBarsAppearance(isDark: Boolean)

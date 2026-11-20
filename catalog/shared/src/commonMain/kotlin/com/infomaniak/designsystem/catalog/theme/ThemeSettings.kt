package com.infomaniak.designsystem.catalog.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.infomaniak.designsystem.calendar.CalendarDarkHighContrastTheme
import com.infomaniak.designsystem.calendar.CalendarDarkMediumContrastTheme
import com.infomaniak.designsystem.calendar.CalendarDarkTheme
import com.infomaniak.designsystem.calendar.CalendarLightHighContrastTheme
import com.infomaniak.designsystem.calendar.CalendarLightMediumContrastTheme
import com.infomaniak.designsystem.calendar.CalendarLightTheme
import com.infomaniak.designsystem.catalog.settings.rememberEnumPreference
import com.infomaniak.designsystem.core.defaultvalues.DefaultTheme
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.Moon
import com.infomaniak.designsystem.icons.symbols.SmartphoneTablet
import com.infomaniak.designsystem.icons.symbols.Sun
import com.infomaniak.designsystem.icons.symbols.Symbol

internal enum class DarkMode(val label: String, val icon: Symbol) {
    System("System", EsdsIcons.SmartphoneTablet),
    Light("Light", EsdsIcons.Sun),
    Dark("Dark", EsdsIcons.Moon),
}

/** [level] goes from 0 (normal) to 1 (high), as defined by Material. */
internal enum class Contrast(val label: String, val level: Double) {
    Normal("Normal", 0.0),
    Medium("Medium", 0.5),
    High("High", 1.0),
}

/** A theme the catalog can be displayed with. To add one, add an entry here and its colors in [values]. */
internal enum class AppTheme(val label: String, val supportsDark: Boolean, val supportsContrast: Boolean) {
    // The Infomaniak tokens don't define dark or contrast variants yet.
    Infomaniak("Infomaniak", supportsDark = false, supportsContrast = false),
    Calendar("Calendar", supportsDark = true, supportsContrast = true),
    MaterialYou("Material You", supportsDark = true, supportsContrast = true),
    ;

    val isAvailable: Boolean get() = this != MaterialYou || isMaterialYouAvailable
}

/** Whether colors can be generated from the user's wallpaper. */
internal expect val isMaterialYouAvailable: Boolean

/** Colors generated from the user's wallpaper, or null if [isMaterialYouAvailable] is false. */
@Composable
internal expect fun materialYouColorScheme(isDark: Boolean, contrast: Contrast): ColorScheme?

@Composable
internal fun rememberDarkMode(): MutableState<DarkMode> = rememberEnumPreference("theme_dark_mode", DarkMode.System, DarkMode.entries)

@Composable
internal fun rememberAppTheme(): MutableState<AppTheme> = rememberEnumPreference("theme_app", AppTheme.Infomaniak, AppTheme.entries)

@Composable
internal fun rememberContrast(): MutableState<Contrast> = rememberEnumPreference("theme_contrast", Contrast.Normal, Contrast.entries)

/** What is actually displayed for the chosen settings, once the variants [AppTheme] doesn't support are left out. */
internal class ResolvedTheme(val values: EsdsTheme.Values, val isDark: Boolean)

@Composable
internal fun resolveTheme(darkMode: DarkMode, appTheme: AppTheme, contrast: Contrast): ResolvedTheme {
    val theme = appTheme.takeIf { it.isAvailable } ?: AppTheme.Infomaniak
    val isDark = theme.supportsDark && when (darkMode) {
        DarkMode.System -> isSystemInDarkTheme()
        DarkMode.Light -> false
        DarkMode.Dark -> true
    }
    val supportedContrast = if (theme.supportsContrast) contrast else Contrast.Normal

    return ResolvedTheme(values = theme.values(isDark, supportedContrast), isDark = isDark)
}

@Composable
private fun AppTheme.values(isDark: Boolean, contrast: Contrast): EsdsTheme.Values = when (this) {
    AppTheme.Infomaniak -> DefaultTheme
    AppTheme.Calendar -> when (contrast) {
        Contrast.Normal -> if (isDark) CalendarDarkTheme else CalendarLightTheme
        Contrast.Medium -> if (isDark) CalendarDarkMediumContrastTheme else CalendarLightMediumContrastTheme
        Contrast.High -> if (isDark) CalendarDarkHighContrastTheme else CalendarLightHighContrastTheme
    }
    AppTheme.MaterialYou -> {
        // Status and dataviz colors aren't brand specific, so they're borrowed from a theme defining all their variants.
        val base = AppTheme.Calendar.values(isDark, contrast)
        EsdsTheme.Values(
            materialColorScheme = materialYouColorScheme(isDark, contrast) ?: base.materialColorScheme,
            extendedColorScheme = base.extendedColorScheme,
        )
    }
}

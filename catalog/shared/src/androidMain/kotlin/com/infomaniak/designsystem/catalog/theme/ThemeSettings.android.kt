package com.infomaniak.designsystem.catalog.theme

import android.os.Build.VERSION.SDK_INT
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.materialkolor.hct.Hct
import com.materialkolor.scheme.DynamicScheme
import com.materialkolor.scheme.SchemeTonalSpot

// Wallpaper colors were introduced in Android 12.
internal actual val isMaterialYouAvailable: Boolean = SDK_INT >= 31

@Composable
internal actual fun materialYouColorScheme(isDark: Boolean, contrast: Contrast): ColorScheme? {
    if (SDK_INT < 31) return null
    val context = LocalContext.current

    return remember(context, isDark, contrast) {
        when (contrast) {
            // Exactly what the system generated, which already follows the system contrast setting on Android 14+.
            Contrast.Normal -> if (isDark) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
            // The system only exposes its own contrast, so the scheme is generated again from the wallpaper's color.
            else -> {
                val seed = Hct.fromInt(context.getColor(android.R.color.system_accent1_500))
                SchemeTonalSpot(seed, isDark, contrast.level).toColorScheme(isDark)
            }
        }
    }
}

private fun DynamicScheme.toColorScheme(isDark: Boolean): ColorScheme {
    val scheme = if (isDark) darkColorScheme() else lightColorScheme()
    return scheme.copy(
        primary = Color(primary),
        onPrimary = Color(onPrimary),
        primaryContainer = Color(primaryContainer),
        onPrimaryContainer = Color(onPrimaryContainer),
        inversePrimary = Color(inversePrimary),
        secondary = Color(secondary),
        onSecondary = Color(onSecondary),
        secondaryContainer = Color(secondaryContainer),
        onSecondaryContainer = Color(onSecondaryContainer),
        tertiary = Color(tertiary),
        onTertiary = Color(onTertiary),
        tertiaryContainer = Color(tertiaryContainer),
        onTertiaryContainer = Color(onTertiaryContainer),
        background = Color(background),
        onBackground = Color(onBackground),
        surface = Color(surface),
        onSurface = Color(onSurface),
        surfaceVariant = Color(surfaceVariant),
        onSurfaceVariant = Color(onSurfaceVariant),
        surfaceTint = Color(surfaceTint),
        inverseSurface = Color(inverseSurface),
        inverseOnSurface = Color(inverseOnSurface),
        error = Color(error),
        onError = Color(onError),
        errorContainer = Color(errorContainer),
        onErrorContainer = Color(onErrorContainer),
        outline = Color(outline),
        outlineVariant = Color(outlineVariant),
        scrim = Color(scrim),
        surfaceBright = Color(surfaceBright),
        surfaceDim = Color(surfaceDim),
        surfaceContainer = Color(surfaceContainer),
        surfaceContainerHigh = Color(surfaceContainerHigh),
        surfaceContainerHighest = Color(surfaceContainerHighest),
        surfaceContainerLow = Color(surfaceContainerLow),
        surfaceContainerLowest = Color(surfaceContainerLowest),
    )
}

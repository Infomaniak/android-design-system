package com.infomaniak.designsystem.catalog.theme

import android.app.Activity
import android.content.ContextWrapper
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
internal actual fun SystemBarsAppearance(isDark: Boolean) {
    val view = LocalView.current
    if (view.isInEditMode) return

    SideEffect {
        var context = view.context
        while (context !is Activity && context is ContextWrapper) context = context.baseContext
        val window = (context as? Activity)?.window ?: return@SideEffect
        WindowCompat.getInsetsController(window, view).apply {
            isAppearanceLightStatusBars = !isDark
            isAppearanceLightNavigationBars = !isDark
        }
    }
}

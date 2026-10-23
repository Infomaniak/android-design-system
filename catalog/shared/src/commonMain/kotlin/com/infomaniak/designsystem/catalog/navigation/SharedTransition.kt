package com.infomaniak.designsystem.catalog.navigation

import androidx.compose.animation.SharedTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation3.ui.LocalNavAnimatedContentScope

// Nullable so screens still render outside of the navigation (e.g. in @Preview).
internal val LocalSharedTransitionScope = staticCompositionLocalOf<SharedTransitionScope?> { null }

@Composable
internal fun Modifier.sharedElement(key: Any): Modifier {
    val sharedTransitionScope = LocalSharedTransitionScope.current ?: return this
    val animatedContentScope = LocalNavAnimatedContentScope.current

    return with(sharedTransitionScope) {
        this@sharedElement.sharedElement(
            sharedContentState = rememberSharedContentState(key),
            animatedVisibilityScope = animatedContentScope,
        )
    }
}

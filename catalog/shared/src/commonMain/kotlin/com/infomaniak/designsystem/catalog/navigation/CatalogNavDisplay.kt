package com.infomaniak.designsystem.catalog.navigation

import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.infomaniak.designsystem.catalog.icons.IconDetailScreen
import com.infomaniak.designsystem.catalog.icons.IconsScreen
import com.infomaniak.designsystem.catalog.icons.simpleName

@Composable
internal fun CatalogNavDisplay() {
    val backStack = rememberNavBackStack(CatalogSavedStateConfiguration, CatalogNavKey.AllIcons)
    val goBack: () -> Unit = { backStack.removeLastOrNull() }

    SharedTransitionLayout {
        CompositionLocalProvider(LocalSharedTransitionScope provides this) {
            NavDisplay(
                backStack = backStack,
                onBack = goBack,
                entryProvider = entryProvider {
                    entry<CatalogNavKey.AllIcons> {
                        IconsScreen(onIconClick = { icon -> backStack.add(CatalogNavKey.IconDetail(icon.simpleName)) })
                    }
                    entry<CatalogNavKey.IconDetail> { key ->
                        IconDetailScreen(iconName = key.iconName, onBack = goBack)
                    }
                },
            )
        }
    }
}

package com.infomaniak.designsystem.catalog.navigation

import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import com.infomaniak.designsystem.catalog.theme.ThemeNavKey
import com.infomaniak.designsystem.catalog.theme.ThemeScreen
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

// Required to save/restore the back stack on non-Android targets, where NavKey subtypes can't be resolved by reflection.
private val CatalogSavedStateConfiguration = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(ThemeNavKey::class, ThemeNavKey.serializer())
            CatalogSections.forEach { section -> with(section) { registerNavKeys() } }
        }
    }
}

@Composable
internal fun CatalogNavDisplay() {
    val backStack = rememberNavBackStack(CatalogSavedStateConfiguration, CatalogSections.first().startKey)
    val goBack: () -> Unit = { backStack.removeLastOrNull() }

    Scaffold(
        contentWindowInsets = WindowInsets(0),
        bottomBar = {
            if (CatalogSections.size > 1) {
                val currentSection = CatalogSections.firstOrNull { it.startKey == backStack.firstOrNull() }
                NavigationBar {
                    CatalogSections.forEach { section ->
                        NavigationBarItem(
                            selected = section == currentSection,
                            onClick = {
                                backStack.add(section.startKey)
                                backStack.subList(0, backStack.lastIndex).clear()
                            },
                            icon = { Icon(section.icon.current, contentDescription = null) },
                            label = { Text(section.title) },
                        )
                    }
                }
            }
        },
    ) { innerPadding ->
        SharedTransitionLayout(modifier = Modifier.padding(innerPadding).consumeWindowInsets(innerPadding)) {
            CompositionLocalProvider(LocalSharedTransitionScope provides this) {
                NavDisplay(
                    backStack = backStack,
                    onBack = goBack,
                    entryProvider = entryProvider {
                        CatalogSections.forEach { section -> with(section) { entries(backStack) } }
                        // Destinations shared by every section.
                        entry<ThemeNavKey> { ThemeScreen(onBack = goBack) }
                    },
                )
            }
        }
    }
}

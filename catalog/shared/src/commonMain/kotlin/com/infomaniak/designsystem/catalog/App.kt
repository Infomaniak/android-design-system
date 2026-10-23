package com.infomaniak.designsystem.catalog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.catalog.navigation.CatalogNavDisplay
import com.infomaniak.designsystem.catalog.settings.LocalCatalogDataStore
import com.infomaniak.designsystem.catalog.settings.rememberCatalogDataStore
import com.infomaniak.designsystem.catalog.settings.rememberPreferencesLoaded
import com.infomaniak.designsystem.catalog.theme.CatalogTheme

@Composable
fun App() {
    CompositionLocalProvider(LocalCatalogDataStore provides rememberCatalogDataStore()) {
        // Only takes a few milliseconds, and avoids starting with the wrong theme.
        if (!rememberPreferencesLoaded()) return@CompositionLocalProvider
        CatalogTheme {
            CatalogNavDisplay()
        }
    }
}

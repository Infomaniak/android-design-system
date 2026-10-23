package com.infomaniak.designsystem.catalog

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.catalog.navigation.CatalogNavDisplay
import com.infomaniak.designsystem.catalog.settings.LocalCatalogDataStore
import com.infomaniak.designsystem.catalog.settings.rememberCatalogDataStore

@Composable
fun App() {
    CompositionLocalProvider(LocalCatalogDataStore provides rememberCatalogDataStore()) {
        DesignSystemTheme {
            CatalogNavDisplay()
        }
    }
}

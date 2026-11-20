package com.infomaniak.designsystem.catalog.settings

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
internal actual fun catalogPreferencesPath(): String =
    LocalContext.current.filesDir.resolve(CatalogPreferencesFileName).absolutePath

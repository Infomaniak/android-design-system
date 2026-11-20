package com.infomaniak.designsystem.catalog.settings

import androidx.compose.runtime.Composable
import java.io.File

@Composable
internal actual fun catalogPreferencesPath(): String =
    File(System.getProperty("user.home"), ".infomaniak-design-system-catalog/$CatalogPreferencesFileName").absolutePath

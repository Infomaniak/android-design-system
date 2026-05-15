package com.infomaniak.generateddstokens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.core.theme.EsdsTheme.LocalEsdsTheme
import com.infomaniak.designsystem.drive.DriveDarkTheme
import com.infomaniak.designsystem.drive.DriveLightTheme


@Composable
fun AppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val esdsTheme = if (isDark) DriveDarkTheme else DriveLightTheme

    // EsdsTheme.color
    MaterialTheme.colorScheme

    // // TODO
    // EsdsTheme(
    //     isDark = esdsTheme
    // )
    //
    // EuriaTheme(
    //     isDark = esdsTheme
    // )
    CompositionLocalProvider(
        value = LocalEsdsTheme provides esdsTheme,
        content = content,
    )
}

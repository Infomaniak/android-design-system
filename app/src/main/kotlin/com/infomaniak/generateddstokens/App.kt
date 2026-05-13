package com.infomaniak.generateddstokens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.drive.DriveDarkTheme
import com.infomaniak.designsystem.drive.DriveLightTheme


@Composable
fun AppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val esdsTheme = if (isDark) DriveDarkTheme else DriveLightTheme

    EsdsTheme.color

    // TODO
    EsdsTheme(
        isDark = esdsTheme
    )

    EuriaTheme(
        isDark = esdsTheme
    )
    // CompositionLocalProvider(
    //     _localMaterialTheme provides esdsTheme,
    // ) {
    //
    // }
}

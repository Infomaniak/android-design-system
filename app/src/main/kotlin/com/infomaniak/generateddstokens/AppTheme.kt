package com.infomaniak.generateddstokens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.core.defaultvalues.DefaultTheme
import com.infomaniak.designsystem.core.theme.EsdsTheme.LocalEsdsTheme

@Composable
fun AppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val esdsTheme = DefaultTheme

    CompositionLocalProvider(
        value = LocalEsdsTheme provides esdsTheme,
    ) {
        MaterialTheme(
            colorScheme = esdsTheme.materialColorScheme,
            content = content,
        )
    }
    content()
}

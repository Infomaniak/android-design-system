package com.infomaniak.generateddstokens

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.infomaniak.designsystem.core.theme.EsdsTheme.LocalEsdsTheme
import com.infomaniak.designsystem.mail.MailDarkTheme
import com.infomaniak.designsystem.mail.MailLightTheme
import com.infomaniak.designsystem.swisstransfer.SwisstransferDarkTheme
import com.infomaniak.designsystem.swisstransfer.SwisstransferLightTheme

@Composable
fun AppTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val esdsTheme = if (isDark) SwisstransferDarkTheme else SwisstransferLightTheme

    CompositionLocalProvider(
        value = LocalEsdsTheme provides esdsTheme,
    ) {
        MaterialTheme(
            colorScheme = esdsTheme.materialColorScheme,
            content = content,
        )
    }
}

@Composable
fun MailTheme(
    isDark: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val esdsTheme = if (isDark) MailDarkTheme else MailLightTheme

    CompositionLocalProvider(
        value = LocalEsdsTheme provides esdsTheme,
    ) {
        MaterialTheme(
            colorScheme = esdsTheme.materialColorScheme,
            content = content,
        )
    }
}

package com.infomaniak.designsystem.catalog.icons

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.catalog.DesignSystemTheme
import com.infomaniak.designsystem.catalog.clipboard.rememberCopyToClipboard
import com.infomaniak.designsystem.catalog.navigation.sharedElement
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.imagevector.medium.ArrowLeft

private val DetailIconSize = 160.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun IconDetailScreen(iconName: String, onBack: () -> Unit) {
    val icon = remember(iconName) { findMediumIcon(iconName) }
    if (icon == null) {
        // The icon may have been removed since the back stack was saved.
        LaunchedEffect(Unit) { onBack() }
        return
    }

    val snackbarHostState = remember { SnackbarHostState() }
    val copyToClipboard = rememberCopyToClipboard(snackbarHostState)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(icon.simpleName) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(EsdsIcons.Medium.ArrowLeft, contentDescription = "Back")
                    }
                },
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(EsdsTheme.spacing.lg),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xl),
        ) {
            Surface(shape = EsdsTheme.radius.xl, color = MaterialTheme.colorScheme.surfaceContainer) {
                Icon(
                    imageVector = icon,
                    contentDescription = icon.simpleName,
                    modifier = Modifier
                        .padding(EsdsTheme.spacing.xl)
                        .sharedElement(key = icon.sharedElementKey)
                        .size(DetailIconSize),
                )
            }

            IconData(icon = icon, onCopy = copyToClipboard)
        }
    }
}

@Composable
private fun IconData(icon: ImageVector, onCopy: (String) -> Unit) {
    val rows = listOf(
        "Name" to icon.simpleName,
        "Reference" to "EsdsIcons.Medium.${icon.simpleName}",
        "Import" to "com.infomaniak.designsystem.icons.imagevector.medium.${icon.simpleName}",
        "Default size" to "${icon.defaultWidth.value.format()} × ${icon.defaultHeight.value.format()} dp",
        "Viewport" to "${icon.viewportWidth.format()} × ${icon.viewportHeight.format()}",
    )

    Surface(shape = EsdsTheme.radius.lg, color = MaterialTheme.colorScheme.surfaceContainerLow) {
        Column {
            rows.forEachIndexed { index, (label, value) ->
                if (index > 0) HorizontalDivider()
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(onClickLabel = "Copy $label") { onCopy(value) }
                        .padding(horizontal = EsdsTheme.spacing.lg, vertical = EsdsTheme.spacing.md),
                ) {
                    Text(
                        text = label,
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Text(text = value, style = MaterialTheme.typography.bodyMedium, fontFamily = FontFamily.Monospace)
                }
            }
        }
    }
}

private fun Float.format(): String = if (this % 1f == 0f) toInt().toString() else toString()

@Preview
@Composable
private fun IconDetailScreenPreview() {
    DesignSystemTheme {
        IconDetailScreen(iconName = "Bell", onBack = {})
    }
}

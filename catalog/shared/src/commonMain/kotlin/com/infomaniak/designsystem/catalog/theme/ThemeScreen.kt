package com.infomaniak.designsystem.catalog.theme

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.ArrowLeft
import com.infomaniak.designsystem.icons.symbols.Check
import kotlinx.serialization.Serializable
import androidx.navigation3.runtime.NavKey

/** Can be pushed on the back stack from any section, see `CatalogNavDisplay`. */
@Serializable
internal data object ThemeNavKey : NavKey

private val MaxContentWidth = 560.dp
private val SwatchSize = 32.dp
private const val DisabledAlpha = 0.38f

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ThemeScreen(onBack: () -> Unit) {
    var darkMode by rememberDarkMode()
    var appTheme by rememberAppTheme()
    var contrast by rememberContrast()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Theme") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(EsdsIcons.ArrowLeft.current, contentDescription = "Back")
                    }
                },
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(horizontal = EsdsTheme.spacing.lg, vertical = EsdsTheme.spacing.md),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                modifier = Modifier.widthIn(max = MaxContentWidth),
                verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xl),
            ) {
                ThemeOptions(
                    title = "Appearance",
                    options = DarkMode.entries,
                    selected = darkMode,
                    onSelect = { darkMode = it },
                    label = { it.label },
                    isEnabled = { appTheme.supportsDark },
                    note = "${appTheme.label} only has a light theme for now.".takeUnless { appTheme.supportsDark },
                    leadingContent = { Icon(it.icon.current, contentDescription = null) },
                )
                ThemeOptions(
                    title = "App theme",
                    options = AppTheme.entries,
                    selected = appTheme,
                    onSelect = { appTheme = it },
                    label = { it.label },
                    isEnabled = { it.isAvailable },
                    note = "Material You requires Android 12 or later.".takeUnless { AppTheme.MaterialYou.isAvailable },
                    leadingContent = { ThemeSwatch(resolveTheme(darkMode, it, contrast), isEnabled = it.isAvailable) },
                )
                ThemeOptions(
                    title = "Contrast",
                    options = Contrast.entries,
                    selected = contrast,
                    onSelect = { contrast = it },
                    label = { it.label },
                    isEnabled = { appTheme.supportsContrast },
                    note = "${appTheme.label} has no contrast variants for now.".takeUnless { appTheme.supportsContrast },
                )
            }
        }
    }
}

/** Choices applied as soon as they're selected, so their effect can be seen right away. */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun <T> ThemeOptions(
    title: String,
    options: List<T>,
    selected: T,
    onSelect: (T) -> Unit,
    label: (T) -> String,
    isEnabled: (T) -> Boolean,
    note: String?,
    leadingContent: (@Composable (T) -> Unit)? = null,
) {
    Column(verticalArrangement = Arrangement.spacedBy(ListItemDefaults.SegmentedGap)) {
        Text(
            text = title,
            modifier = Modifier.padding(horizontal = EsdsTheme.spacing.lg).padding(bottom = EsdsTheme.spacing.sm),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary,
        )
        options.forEachIndexed { index, option ->
            val isSelected = option == selected
            SegmentedListItem(
                selected = isSelected,
                onClick = { onSelect(option) },
                shapes = ListItemDefaults.segmentedShapes(index = index, count = options.size),
                enabled = isEnabled(option),
                colors = ListItemDefaults.segmentedColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
                    // Keeps the rows grouped together even when they can't be selected.
                    disabledContainerColor = MaterialTheme.colorScheme.surfaceContainerLow.copy(alpha = DisabledAlpha),
                ),
                leadingContent = leadingContent?.let { { it(option) } },
                trailingContent = if (isSelected) {
                    { Icon(EsdsIcons.Check.current, contentDescription = null) }
                } else {
                    null
                },
            ) {
                Text(label(option))
            }
        }
        if (note != null) {
            Text(
                text = note,
                modifier = Modifier.fillMaxWidth().padding(horizontal = EsdsTheme.spacing.lg, vertical = EsdsTheme.spacing.sm),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }
}

/** Preview of the main colors of [theme]. */
@Composable
private fun ThemeSwatch(theme: ResolvedTheme, isEnabled: Boolean) {
    val colors = theme.values.materialColorScheme
    val outline = MaterialTheme.colorScheme.outlineVariant

    Canvas(modifier = Modifier.size(SwatchSize).alpha(if (isEnabled) 1f else DisabledAlpha)) {
        drawArc(colors.primary, startAngle = 90f, sweepAngle = 180f, useCenter = true)
        drawArc(colors.primaryContainer, startAngle = 270f, sweepAngle = 180f, useCenter = true)
        drawCircle(colors.surface, radius = size.minDimension / 5)
        drawArc(
            color = outline,
            startAngle = 0f,
            sweepAngle = 360f,
            useCenter = false,
            topLeft = Offset(0.5f, 0.5f),
            size = Size(size.width - 1f, size.height - 1f),
            style = Stroke(width = 1f),
        )
    }
}

@Preview
@Composable
private fun ThemeScreenPreview() {
    CatalogTheme {
        ThemeScreen(onBack = {})
    }
}

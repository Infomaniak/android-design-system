package com.infomaniak.designsystem.catalog.icons

import androidx.compose.animation.Crossfade
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FabPosition
import androidx.compose.material3.HorizontalFloatingToolbar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedListItem
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.ToggleButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.datastore.preferences.core.stringPreferencesKey
import com.infomaniak.designsystem.catalog.DesignSystemTheme
import com.infomaniak.designsystem.catalog.clipboard.rememberCopyToClipboard
import com.infomaniak.designsystem.catalog.navigation.sharedElement
import com.infomaniak.designsystem.catalog.settings.rememberPreference
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.ArrowLeft
import com.infomaniak.designsystem.icons.symbols.DotsNine
import com.infomaniak.designsystem.icons.symbols.GridThreeTwo
import com.infomaniak.designsystem.icons.symbols.SquaresStacked
import com.infomaniak.designsystem.icons.symbols.Symbol

private val PreviewSize = 240.dp
private val ToolbarClearance = 72.dp
private val GridModeKey = stringPreferencesKey("icon_detail_grid_mode")

private enum class IconGridMode(val label: String, val icon: Symbol, val cellCount: (ImageVector) -> Int) {
    /** One cell per unit of the 24×24 artboard the icons are designed on, whatever their size. */
    Design("Design grid", EsdsIcons.GridThreeTwo, { it.viewportWidth.toInt() }),

    /** One cell per dp of the selected size, e.g. 16×16 for ExtraSmall. */
    Pixels("Pixel grid", EsdsIcons.DotsNine, { it.sizeInDp }),
}
private val LargestIconSize = 40.dp
private val MaxContentWidth = 560.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun IconDetailScreen(iconName: String, onBack: () -> Unit) {
    val icon = remember(iconName) { findIcon(iconName) }
    if (icon == null) {
        // The icon may have been removed since the back stack was saved.
        LaunchedEffect(Unit) { onBack() }
        return
    }

    var selectedSize by rememberSaveable { mutableStateOf(Symbol.Size.Medium) }
    var gridModeName by rememberPreference(GridModeKey, IconGridMode.Design.name)
    val gridMode = IconGridMode.entries.firstOrNull { it.name == gridModeName } ?: IconGridMode.Design
    val selectedVector = selectedSize.toImageVector(icon.symbol)

    val snackbarHostState = remember { SnackbarHostState() }
    val copyToClipboard = rememberCopyToClipboard(snackbarHostState)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(icon.name) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(EsdsIcons.ArrowLeft.current, contentDescription = "Back")
                    }
                },
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) },
        // Floating at the bottom, within reach of the thumb, and pushed up by snackbars.
        floatingActionButton = {
            IconDetailToolbar(gridMode = gridMode, onGridModeChange = { gridModeName = it.name })
        },
        floatingActionButtonPosition = FabPosition.Center,
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(innerPadding)
                .padding(EsdsTheme.spacing.lg)
                .padding(bottom = ToolbarClearance),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xl),
        ) {
            IconPreview(icon = selectedVector, gridMode = gridMode, modifier = Modifier.sharedElement(key = icon.sharedElementKey))

            Column(
                modifier = Modifier.widthIn(max = MaxContentWidth),
                verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.lg),
            ) {
                SizeSelector(
                    symbol = icon.symbol,
                    selectedSize = selectedSize,
                    onSizeSelect = { selectedSize = it },
                )
                IconData(
                    rows = listOf(
                        "Name" to icon.name,
                        "Code" to "EsdsIcons.${icon.name}.${selectedSize.name}",
                        "Size" to "${selectedVector.sizeInDp} dp",
                    ),
                    onCopy = copyToClipboard,
                )
            }
        }
    }
}

/** Big rendering of [icon] drawn over the grid of [gridMode]. */
@Composable
private fun IconPreview(icon: ImageVector, gridMode: IconGridMode, modifier: Modifier = Modifier) {
    val gridColor = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.6f)

    Box(
        modifier = modifier
            .clip(EsdsTheme.radius.xl)
            .background(MaterialTheme.colorScheme.surfaceContainer)
            .padding(EsdsTheme.spacing.lg)
            .size(PreviewSize)
            .drawBehind { drawGrid(cells = gridMode.cellCount(icon), color = gridColor) },
    ) {
        Crossfade(targetState = icon) { vector ->
            Icon(
                imageVector = vector,
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                tint = MaterialTheme.colorScheme.primary,
            )
        }
    }
}

private fun DrawScope.drawGrid(cells: Int, color: Color) {
    val step = size.width / cells
    for (i in 0..cells) {
        val position = i * step
        drawLine(color, Offset(position, 0f), Offset(position, size.height), strokeWidth = 1f)
        drawLine(color, Offset(0f, position), Offset(size.width, position), strokeWidth = 1f)
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun IconDetailToolbar(gridMode: IconGridMode, onGridModeChange: (IconGridMode) -> Unit) {
    HorizontalFloatingToolbar(expanded = true) {
        IconGridMode.entries.forEach { mode ->
            ToggleButton(
                checked = mode == gridMode,
                onCheckedChange = { onGridModeChange(mode) },
                modifier = Modifier.semantics { role = Role.RadioButton },
                icon = { Icon(mode.icon.Small, contentDescription = null) },
            ) {
                Text(mode.label)
            }
        }
    }
}

/** Every size of [symbol], rendered at its actual size. */
@Composable
private fun SizeSelector(symbol: Symbol, selectedSize: Symbol.Size, onSizeSelect: (Symbol.Size) -> Unit) {
    Row(horizontalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.sm)) {
        Symbol.Size.entries.forEach { size ->
            val vector = size.toImageVector(symbol)
            val isSelected = size == selectedSize
            val containerColor by animateColorAsState(
                if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surfaceContainerLow,
            )
            val contentColor by animateColorAsState(
                if (isSelected) MaterialTheme.colorScheme.onPrimaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
            )

            Surface(
                selected = isSelected,
                onClick = { onSizeSelect(size) },
                modifier = Modifier.weight(1f),
                shape = EsdsTheme.radius.lg,
                color = containerColor,
                contentColor = contentColor,
            ) {
                Column(
                    modifier = Modifier.padding(vertical = EsdsTheme.spacing.md),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
                ) {
                    Box(modifier = Modifier.size(LargestIconSize), contentAlignment = Alignment.Center) {
                        Icon(vector, contentDescription = null, modifier = Modifier.size(vector.defaultWidth))
                    }
                    Text(text = size.shortName, style = MaterialTheme.typography.labelLarge)
                    Text(text = "${vector.sizeInDp}", style = MaterialTheme.typography.labelSmall)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun IconData(rows: List<Pair<String, String>>, onCopy: (String) -> Unit) {
    Column(verticalArrangement = Arrangement.spacedBy(ListItemDefaults.SegmentedGap)) {
        rows.forEachIndexed { index, (label, value) ->
            SegmentedListItem(
                onClick = { onCopy(value) },
                shapes = ListItemDefaults.segmentedShapes(index = index, count = rows.size),
                colors = ListItemDefaults.segmentedColors(containerColor = MaterialTheme.colorScheme.surfaceContainerLow),
                overlineContent = { Text(label) },
                trailingContent = { Icon(EsdsIcons.SquaresStacked.Small, contentDescription = "Copy $label") },
            ) {
                Text(text = value, fontFamily = FontFamily.Monospace)
            }
        }
    }
}

// Icons are square, so their width is their size.
private val ImageVector.sizeInDp: Int get() = defaultWidth.value.toInt()

private val Symbol.Size.shortName: String
    get() = when (this) {
        Symbol.Size.ExtraSmall -> "XS"
        Symbol.Size.Small -> "S"
        Symbol.Size.Medium -> "M"
        Symbol.Size.Large -> "L"
        Symbol.Size.ExtraLarge -> "XL"
    }

@Preview
@Composable
private fun IconDetailScreenPreview() {
    DesignSystemTheme {
        IconDetailScreen(iconName = "Bell", onBack = {})
    }
}

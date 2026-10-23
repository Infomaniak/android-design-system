package com.infomaniak.designsystem.catalog.icons

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FloatingToolbarDefaults
import androidx.compose.material3.HorizontalFloatingToolbar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
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
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigationevent.NavigationEventInfo
import androidx.navigationevent.compose.NavigationBackHandler
import androidx.navigationevent.compose.rememberNavigationEventState
import com.infomaniak.designsystem.catalog.clipboard.rememberCopyToClipboard
import com.infomaniak.designsystem.catalog.navigation.sharedElement
import com.infomaniak.designsystem.catalog.theme.CatalogTheme
import com.infomaniak.designsystem.catalog.toolbar.ToolbarClearance
import com.infomaniak.designsystem.catalog.toolbar.ToolbarItem
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.EsdsIcons
import com.infomaniak.designsystem.icons.symbols.Cross
import com.infomaniak.designsystem.icons.symbols.MagnifyingGlass

private val MaxSearchWidth = 560.dp
private val ClearButtonSize = 48.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun IconsScreen(onIconClick: (CatalogIcon) -> Unit) {
    val snackbarHostState = remember { SnackbarHostState() }
    val copyToClipboard = rememberCopyToClipboard(snackbarHostState)
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val gridState = rememberLazyGridState()

    var isSearching by rememberSaveable { mutableStateOf(false) }
    var query by rememberSaveable { mutableStateOf("") }
    val icons = remember(query) { AllIcons.filter { it.name.contains(query.trim(), ignoreCase = true) } }

    LaunchedEffect(query) { gridState.scrollToItem(0) }
    NavigationBackHandler(
        state = rememberNavigationEventState(NavigationEventInfo.None),
        isBackEnabled = isSearching,
        onBackCompleted = {
            isSearching = false
            query = ""
        },
    )

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = { Text("Icons (${icons.size})") },
                scrollBehavior = scrollBehavior,
            )
        },
        // Snackbars show up above the floating toolbar instead of covering it.
        snackbarHost = { SnackbarHost(snackbarHostState, modifier = Modifier.padding(bottom = ToolbarClearance)) },
    ) { innerPadding ->
        val spacing = EsdsTheme.spacing.md
        val layoutDirection = LocalLayoutDirection.current

        Box(modifier = Modifier.fillMaxSize()) {
            LazyVerticalGrid(
                columns = GridCells.Adaptive(minSize = 88.dp),
                state = gridState,
                contentPadding = PaddingValues(
                    start = innerPadding.calculateStartPadding(layoutDirection) + spacing,
                    top = innerPadding.calculateTopPadding() + spacing,
                    end = innerPadding.calculateEndPadding(layoutDirection) + spacing,
                    bottom = innerPadding.calculateBottomPadding() + spacing + ToolbarClearance,
                ),
                verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
                horizontalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
            ) {
                items(icons, key = { it.name }) { icon ->
                    IconCell(
                        icon = icon,
                        onClick = { onIconClick(icon) },
                        onLongClick = { copyToClipboard(icon.name) },
                    )
                }
            }
            if (icons.isEmpty()) {
                Text(
                    text = "No icon matches \u201C${query.trim()}\u201D",
                    modifier = Modifier.align(Alignment.Center).padding(EsdsTheme.spacing.xl),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                )
            }
            // Floating at the bottom, within reach of the thumb, and pushed up by the keyboard.
            IconSearchToolbar(
                isSearching = isSearching,
                onSearchingChange = { isSearching = it },
                query = query,
                onQueryChange = { query = it },
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Bottom))
                    .padding(bottom = FloatingToolbarDefaults.ScreenOffset),
            )
        }
    }
}

/** A search button that expands into a search field. */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
private fun IconSearchToolbar(
    isSearching: Boolean,
    onSearchingChange: (Boolean) -> Unit,
    query: String,
    onQueryChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    HorizontalFloatingToolbar(
        expanded = true,
        modifier = modifier
            .padding(horizontal = EsdsTheme.spacing.lg)
            .widthIn(max = MaxSearchWidth),
    ) {
        AnimatedContent(
            targetState = isSearching,
            // The old content quickly fades out before the new one fades in, so they never overlap.
            transitionSpec = {
                fadeIn(tween(durationMillis = 220, delayMillis = 90)) togetherWith
                    fadeOut(tween(durationMillis = 90)) using SizeTransform(clip = false)
            },
            contentAlignment = Alignment.Center,
        ) { searching ->
            if (searching) {
                SearchField(
                    query = query,
                    onQueryChange = onQueryChange,
                    onClose = { onSearchingChange(false) },
                )
            } else {
                ToolbarItem(
                    icon = EsdsIcons.MagnifyingGlass,
                    label = "Search",
                    onClick = { onSearchingChange(true) },
                    role = Role.Button,
                )
            }
        }
    }
}

@Composable
private fun SearchField(query: String, onQueryChange: (String) -> Unit, onClose: () -> Unit) {
    val focusRequester = remember { FocusRequester() }
    val keyboardController = LocalSoftwareKeyboardController.current
    val textStyle = MaterialTheme.typography.bodyLarge

    LaunchedEffect(Unit) { focusRequester.requestFocus() }

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = EsdsIcons.MagnifyingGlass.Medium,
            contentDescription = null,
            modifier = Modifier.padding(start = EsdsTheme.spacing.md),
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        BasicTextField(
            value = query,
            onValueChange = onQueryChange,
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = EsdsTheme.spacing.md)
                .focusRequester(focusRequester),
            textStyle = textStyle.copy(color = MaterialTheme.colorScheme.onSurface),
            singleLine = true,
            cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.None, imeAction = ImeAction.Search),
            keyboardActions = KeyboardActions(onSearch = { keyboardController?.hide() }),
            decorationBox = { innerTextField ->
                Box {
                    if (query.isEmpty()) {
                        Text("Search icons", style = textStyle, color = MaterialTheme.colorScheme.onSurfaceVariant)
                    }
                    innerTextField()
                }
            },
        )
        // Clears the search, or closes it once there's nothing left to clear. Not an IconButton, as the toolbar
        // would otherwise grow to balance the button's minimum touch target alignment lines.
        Box(
            modifier = Modifier
                .size(ClearButtonSize)
                .clip(CircleShape)
                .clickable(
                    onClickLabel = if (query.isEmpty()) "Close search" else "Clear search",
                    role = Role.Button,
                    onClick = { if (query.isEmpty()) onClose() else onQueryChange("") },
                ),
            contentAlignment = Alignment.Center,
        ) {
            Icon(
                imageVector = EsdsIcons.Cross.Medium,
                contentDescription = if (query.isEmpty()) "Close search" else "Clear search",
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun IconCell(icon: CatalogIcon, onClick: () -> Unit, onLongClick: () -> Unit) {
    val haptics = LocalHapticFeedback.current

    Column(
        modifier = Modifier
            .clip(EsdsTheme.radius.md)
            .combinedClickable(
                onClick = onClick,
                onLongClickLabel = "Copy name",
                onLongClick = {
                    haptics.performHapticFeedback(HapticFeedbackType.LongPress)
                    onLongClick()
                },
            )
            .padding(horizontal = EsdsTheme.spacing.xs, vertical = EsdsTheme.spacing.md),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.sm),
    ) {
        Icon(
            imageVector = icon.symbol.Medium,
            contentDescription = null,
            modifier = Modifier
                .sharedElement(key = icon.sharedElementKey)
                .size(EsdsTheme.icon.sizeMd),
        )
        Text(
            text = icon.name,
            style = MaterialTheme.typography.labelSmall,
            textAlign = TextAlign.Center,
            minLines = 2,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
        )
    }
}

@Preview
@Composable
private fun IconsScreenPreview() {
    CatalogTheme {
        IconsScreen(onIconClick = {})
    }
}

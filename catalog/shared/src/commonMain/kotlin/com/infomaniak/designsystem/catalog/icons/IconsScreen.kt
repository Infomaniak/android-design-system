package com.infomaniak.designsystem.catalog.icons

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.catalog.clipboard.rememberCopyToClipboard
import com.infomaniak.designsystem.catalog.navigation.sharedElement
import com.infomaniak.designsystem.catalog.theme.CatalogTheme
import com.infomaniak.designsystem.core.theme.EsdsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun IconsScreen(onIconClick: (CatalogIcon) -> Unit) {
    val snackbarHostState = remember { SnackbarHostState() }
    val copyToClipboard = rememberCopyToClipboard(snackbarHostState)
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = { Text("Icons (${AllIcons.size})") },
                scrollBehavior = scrollBehavior,
            )
        },
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) { innerPadding ->
        val spacing = EsdsTheme.spacing.md
        val layoutDirection = LocalLayoutDirection.current

        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 88.dp),
            contentPadding = PaddingValues(
                start = innerPadding.calculateStartPadding(layoutDirection) + spacing,
                top = innerPadding.calculateTopPadding() + spacing,
                end = innerPadding.calculateEndPadding(layoutDirection) + spacing,
                bottom = innerPadding.calculateBottomPadding() + spacing,
            ),
            verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
            horizontalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
        ) {
            items(AllIcons, key = { it.name }) { icon ->
                IconCell(
                    icon = icon,
                    onClick = { onIconClick(icon) },
                    onLongClick = { copyToClipboard(icon.name) },
                )
            }
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

package com.infomaniak.designsystem.catalog.toolbar

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FloatingToolbarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.infomaniak.designsystem.core.theme.EsdsTheme
import com.infomaniak.designsystem.icons.symbols.Symbol

/** Space taken by a floating toolbar at the bottom of the screen, to keep content and snackbars clear of it. */
@OptIn(ExperimentalMaterial3ExpressiveApi::class)
internal val ToolbarClearance = FloatingToolbarDefaults.ContainerSize + FloatingToolbarDefaults.ScreenOffset * 2

/** Separates groups of [ToolbarItem]s. */
@Composable
internal fun ToolbarDivider() {
    VerticalDivider(modifier = Modifier.height(32.dp).padding(horizontal = EsdsTheme.spacing.xs))
}

/** Compact action with its [label] under its [icon], highlighted like a navigation bar item when [isSelected]. */
@Composable
internal fun ToolbarItem(icon: Symbol, label: String, onClick: () -> Unit, role: Role, isSelected: Boolean = false) {
    val interactionSource = remember { MutableInteractionSource() }
    val indicatorColor by animateColorAsState(
        if (isSelected) MaterialTheme.colorScheme.secondaryContainer else MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0f),
    )
    val iconColor by animateColorAsState(
        if (isSelected) MaterialTheme.colorScheme.onSecondaryContainer else MaterialTheme.colorScheme.onSurfaceVariant,
    )

    Column(
        modifier = Modifier
            .selectable(selected = isSelected, onClick = onClick, role = role, interactionSource = interactionSource, indication = null)
            .padding(horizontal = EsdsTheme.spacing.xs),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.xs),
    ) {
        // Like in a navigation bar, only the indicator reacts to touches.
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .background(indicatorColor)
                .indication(interactionSource, ripple())
                .padding(horizontal = EsdsTheme.spacing.lg, vertical = EsdsTheme.spacing.xs),
        ) {
            Icon(icon.Medium, contentDescription = null, tint = iconColor)
        }
        Text(
            text = label,
            style = MaterialTheme.typography.labelMedium,
            color = if (isSelected) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurfaceVariant,
        )
    }
}

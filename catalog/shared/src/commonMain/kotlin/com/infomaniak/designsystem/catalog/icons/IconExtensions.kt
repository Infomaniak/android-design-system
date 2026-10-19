package com.infomaniak.designsystem.catalog.icons

import androidx.compose.ui.graphics.vector.ImageVector

/** `Bell` for an icon named `Medium.Bell`. */
internal val ImageVector.simpleName: String get() = name.substringAfterLast('.')

internal val ImageVector.sharedElementKey: String get() = "icon-$name"

internal fun findMediumIcon(simpleName: String): ImageVector? = AllMediumIcons.firstOrNull { it.simpleName == simpleName }

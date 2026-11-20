package com.infomaniak.designsystem.catalog.clipboard

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.ClipEntry
import androidx.compose.ui.platform.LocalClipboard
import kotlinx.coroutines.launch

internal expect fun plainTextClipEntry(text: String): ClipEntry

/** Whether the system already confirms copies to the user, making our own confirmation redundant. */
internal expect val systemConfirmsCopy: Boolean

/** Returns a callback that copies the given text to the clipboard and confirms it with a snackbar, unless the system already does. */
@Composable
internal fun rememberCopyToClipboard(snackbarHostState: SnackbarHostState): (String) -> Unit {
    val clipboard = LocalClipboard.current
    val scope = rememberCoroutineScope()

    return remember(clipboard, snackbarHostState, scope) {
        { text ->
            scope.launch {
                clipboard.setClipEntry(plainTextClipEntry(text))
                if (systemConfirmsCopy) return@launch
                snackbarHostState.currentSnackbarData?.dismiss()
                snackbarHostState.showSnackbar("Copied “$text”")
            }
        }
    }
}

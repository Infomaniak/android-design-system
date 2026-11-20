package com.infomaniak.designsystem.catalog.clipboard

import android.content.ClipData
import android.os.Build.VERSION.SDK_INT
import androidx.compose.ui.platform.ClipEntry

internal actual fun plainTextClipEntry(text: String): ClipEntry = ClipEntry(ClipData.newPlainText(text, text))

// Android 13+ shows its own clipboard overlay whenever something is copied.
internal actual val systemConfirmsCopy: Boolean = SDK_INT >= 33

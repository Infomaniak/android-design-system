package com.infomaniak.designsystem.catalog

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Design System Sandbox",
    ) {
        App()
    }
}

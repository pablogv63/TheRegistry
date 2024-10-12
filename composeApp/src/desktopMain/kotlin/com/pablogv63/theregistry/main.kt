package com.pablogv63.theregistry

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.pablogv63.theregistry.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "The Registry"
        ) {
            App()
        }
    }
}
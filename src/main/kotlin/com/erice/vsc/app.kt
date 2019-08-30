package com.erice.vsc

import javafx.application.Application
import tornadofx.App
import tornadofx.importStylesheet


/**
 * Created by Eric Engelhart on 8/29/19
 */
class VSCApp : App() {
    override val primaryView = workspace::class

    init {
        importStylesheet(DefaultTheme::class)
    }

}
fun main() {
    Application.launch(VSCApp::class.java)
}
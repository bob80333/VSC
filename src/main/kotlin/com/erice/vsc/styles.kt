package com.erice.vsc

import javafx.scene.paint.Color
import tornadofx.Stylesheet
import tornadofx.cssclass
import tornadofx.px


/**
 * Created by Eric Engelhart on 8/29/19
 */

class DefaultTheme: Stylesheet() {
    companion object {
        val wrapper by cssclass()
        val consola by cssclass()
    }

    init {
        root {
            prefHeight = 600.px
            prefWidth = 800.px
        }
        textArea and consola {
            baseColor= Color.BLACK
            fontFamily = "Consolas"
            textFill = Color.LIGHTGRAY
        }
    }
}
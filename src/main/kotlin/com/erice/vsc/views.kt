package com.erice.vsc

import tornadofx.View
import tornadofx.borderpane
import tornadofx.canvas
import tornadofx.pane


/**
 * Created by Eric Engelhart on 8/29/19
 */

class NodePane: View() {
    val nodesController: NodesController by inject()
    override val root = pane{
        nodesController.canvas = canvas{

        }
    }

}

class MainWindow: View() {
    val mainWindowController: MainWindowController by inject()
    override val root = borderpane {

    }
}
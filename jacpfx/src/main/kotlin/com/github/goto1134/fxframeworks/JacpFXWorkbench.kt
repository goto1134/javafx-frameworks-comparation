package com.github.goto1134.fxframeworks

import javafx.event.Event
import javafx.scene.Node
import javafx.stage.Stage
import javafx.stage.StageStyle
import org.jacpfx.api.annotations.workbench.Workbench
import org.jacpfx.api.componentLayout.WorkbenchLayout
import org.jacpfx.api.message.Message
import org.jacpfx.rcp.componentLayout.FXComponentLayout
import org.jacpfx.rcp.workbench.FXWorkbench

/**
 *
 * @author Andrew Yefanov.
 * @since 14.08.2017.
 */
@Workbench(id = "id1", name = "workbench", perspectives = arrayOf(JacpConfig.PERSPECTIVE))
class JacpFXWorkbench : FXWorkbench {
    override fun handleInitialLayout(action: Message<Event, Any>, layout: WorkbenchLayout<Node>, stage: Stage) {
        layout.setWorkbenchXYSize(500, 200)
        layout.setStyle(StageStyle.DECORATED)
    }

    override fun postHandle(layout: FXComponentLayout) {
    }
}
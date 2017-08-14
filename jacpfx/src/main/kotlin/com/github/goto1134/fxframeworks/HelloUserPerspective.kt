package com.github.goto1134.fxframeworks

import javafx.event.ActionEvent
import javafx.event.Event
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.TextField
import org.jacpfx.api.annotations.perspective.Perspective
import org.jacpfx.api.message.Message
import org.jacpfx.rcp.componentLayout.PerspectiveLayout
import org.jacpfx.rcp.perspective.FXPerspective
import org.springframework.beans.factory.annotation.Autowired

/**
 *
 * @author Andrew Yefanov.
 * @since 14.08.2017.
 */
@Perspective(id = JacpConfig.PERSPECTIVE, name = "helloUserPerspective", viewLocation = "/jacp.fxml", components = arrayOf())
class HelloUserPerspective : FXPerspective {
    override fun handlePerspective(message: Message<Event, Any>?, perspectiveLayout: PerspectiveLayout?) {
    }

    @FXML fun sayHello(event: ActionEvent) {
        helloLabel.text = helloUserServiceImpl.getHelloStringForUser(User(nameTextField.text, surnameTextField.text))
    }

    @Autowired lateinit var helloUserServiceImpl: HelloUserServiceImpl
    @FXML lateinit var nameTextField: TextField
    @FXML lateinit var surnameTextField: TextField
    @FXML lateinit var helloLabel: Label
}
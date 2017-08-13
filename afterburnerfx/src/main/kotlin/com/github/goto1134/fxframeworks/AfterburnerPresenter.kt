package com.github.goto1134.fxframeworks

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.TextField
import java.net.URL
import java.util.*
import javax.inject.Inject

/**
 * Created by Andrew
 * on 13.08.2017.
 */
class AfterburnerPresenter() : Initializable {
    override fun initialize(location: URL?, resources: ResourceBundle?) {
        sayHelloButton.setOnAction { helloLabel.text = service.getHelloStringForUser(User(nameTextField.text, surnameTextField.text)) }
    }


    @Inject lateinit var service: HelloUserServiceImpl
    @FXML lateinit var nameTextField: TextField
    @FXML lateinit var surnameTextField: TextField
    @FXML lateinit var helloLabel: Label
    @FXML lateinit var sayHelloButton: Button
}
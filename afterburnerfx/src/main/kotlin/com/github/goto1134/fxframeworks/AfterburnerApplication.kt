package com.github.goto1134.fxframeworks

import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


fun main(args: Array<String>) {
    Application.launch(AfterburnerApplication::class.java, *args)
}

/**
 * Created by Andrew
 * on 13.08.2017.
 */
class AfterburnerApplication : Application() {


    override fun init() {
        super.init()
        context = AnnotationConfigApplicationContext("com.github.goto1134.fxframeworks")
    }

    override fun start(stage: Stage) {
        val view: AfterburnerView = AfterburnerView({ name -> context.getBean(name) })
        val scene: Scene = Scene(view.view)
        stage.scene = scene
        stage.show()
    }

    lateinit var context: ApplicationContext

}
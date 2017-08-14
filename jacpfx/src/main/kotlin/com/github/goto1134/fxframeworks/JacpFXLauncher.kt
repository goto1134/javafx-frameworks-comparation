package com.github.goto1134.fxframeworks

import javafx.application.Application
import javafx.stage.Stage
import org.jacpfx.spring.launcher.AFXSpringJavaConfigLauncher

fun main(args: Array<String>) {
    Application.launch(JacpFXLauncher::class.java, *args)
}

class JacpFXLauncher : AFXSpringJavaConfigLauncher() {
    override fun getWorkbenchClass() = JacpFXWorkbench::class.java

    override fun postInit(stage: Stage?) {
    }

    override fun getBasePackages() = arrayOf("com.github.goto1134.fxframeworks")

    override fun getConfigClasses() = arrayOf(JacpConfig::class.java)

}
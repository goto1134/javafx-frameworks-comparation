package com.github.goto1134.fxframeworks

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 *
 * @author Andrew Yefanov.
 * @since 14.08.2017.
 */
@Configuration
@ComponentScan
open class JacpConfig {
    companion object {
        const val PERSPECTIVE = "firstPerspective"
    }
}
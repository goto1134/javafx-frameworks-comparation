package com.github.goto1134.fxframeworks

import org.springframework.stereotype.Service

/**
 * Created by Andrew
 * on 13.08.2017.
 */
@Service
open class HelloUserServiceImpl : HelloUserService {
    override fun getHelloStringForUser(user: User): String {
        return "Hello, ${user.fullName()}"
    }
}
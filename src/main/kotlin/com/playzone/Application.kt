package com.playzone

import com.playzone.dao.DatabaseFactory
import com.playzone.di.configureDi
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.playzone.plugins.configureRouting
import com.playzone.plugins.configureSecurity
import com.playzone.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    DatabaseFactory.init()
    configureSerialization()
    configureDi()
    configureSecurity()
    configureRouting()
}

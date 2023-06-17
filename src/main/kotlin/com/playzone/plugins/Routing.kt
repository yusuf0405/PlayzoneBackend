package com.playzone.plugins

import com.playzone.route.authRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        authRouting()
    }
}

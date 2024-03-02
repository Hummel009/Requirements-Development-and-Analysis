package com.github.hummel.rda

import com.github.hummel.rda.microservice.configureRouting
import com.github.hummel.rda.microservice.configureTemplating
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
	embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
	configureRouting()
	configureTemplating()
}
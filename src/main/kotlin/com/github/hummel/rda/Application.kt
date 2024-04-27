package com.github.hummel.rda

import com.github.hummel.rda.microservice.configureRouting
import freemarker.cache.ClassTemplateLoader
import freemarker.core.HTMLOutputFormat
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.freemarker.FreeMarker
import io.ktor.server.netty.*

fun main() {
	embeddedServer(Netty, port = 8080, module = Application::module).start(wait = true)
}

fun Application.module() {
	install(FreeMarker) {
		templateLoader = ClassTemplateLoader(this::class.java.classLoader, "dynamic")
		outputFormat = HTMLOutputFormat.INSTANCE
	}
	configureRouting()
}
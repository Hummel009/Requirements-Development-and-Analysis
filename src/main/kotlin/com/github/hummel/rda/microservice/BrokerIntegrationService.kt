package com.github.hummel.rda.microservice

import com.github.hummel.rda.microservice.sender.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
	routing {
		staticResources("/static", "static")
		get("/") {
			call.respondRedirect("/api")
		}
		get("/api") {
			call.respond(FreeMarkerContent("index.ftl", null))
		}
		get("/api/buttonClicked") {
			val buttonClicked = call.request.queryParameters["button"]

			try {
				buttonClicked?.let {
					when (it) {
						"airline" -> launchAirlineManagementService()
						"userman" -> launchUserManagementService()
						"booking" -> launchBookingService()
						"payment" -> launchPaymentService()
						"flights" -> launchFlightManagementService()
						"notific" -> launchNotificationService()
						"reports" -> launchReportAnalyticsService()

						else -> {
							call.respond(HttpStatusCode.BadRequest, "Неизвестная кнопка")
						}
					}
				}
			} catch (e: Exception) {
				e.printStackTrace()
			}

			call.respondRedirect("/api")
		}
	}
}
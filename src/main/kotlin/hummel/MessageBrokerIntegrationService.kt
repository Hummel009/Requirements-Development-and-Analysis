package hummel

import hummel.microservice.*
import hummel.microservice.sender.*
import java.nio.charset.StandardCharsets
import java.util.*

val commands: Map<String, () -> Unit> = mapOf(
	"airline" to ::launchAirlineManagementService,
	"user" to ::launchUserManagementService,
	"report" to ::launchReportAnalyticsService,
	"booking" to ::launchBookingService,
	"notif" to ::launchNotificationService,
	"payment" to ::launchPaymentService,
	"flight" to ::launchFlightManagementService,
	"commands" to ::showCommands
)

fun main() {
	Scanner(System.`in`, StandardCharsets.UTF_8).use {
		while (true) {
			val command = it.nextLine()
			commands[command]?.invoke()
		}
	}
}

private fun showCommands() {
	commands.forEach { println(it.key) }
}
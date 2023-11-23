package hummel

import hummel.microservice.launchNotificationService
import hummel.microservice.launchReportAnalyticsService
import hummel.microservice.sender.*

fun main() {
	Launcher.init()
	while (true) {
		print("Enter the command: ")
		val command = readln()

		if ("exit" == command) {
			break
		}

		Launcher.functions[command]?.invoke() ?: println("Unknown command!")
	}
}

object Launcher {
	val functions: MutableMap<String, () -> Unit> = HashMap()

	fun init() {
		functions.clear()
		functions["airline"] = ::launchAirlineManagementService
		functions["user"] = ::launchUserManagementService
		functions["booking"] = ::launchBookingService
		functions["payment"] = ::launchPaymentService
		functions["flight"] = ::launchFlightManagementService
		functions["notif"] = ::launchNotificationService
		functions["report"] = ::launchReportAnalyticsService
		functions["commands"] = ::showCommands
	}

	private fun showCommands() {
		functions.forEach { println(it.key) }
	}
}
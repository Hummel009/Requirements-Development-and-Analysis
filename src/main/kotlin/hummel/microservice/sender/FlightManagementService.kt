package hummel.microservice.sender

import hummel.addSampleValue
import hummel.basic.Sender
import hummel.password
import hummel.url
import hummel.user
import java.sql.DriverManager

fun launchFlightManagementService() {
	try {
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "flights", 1)
		}
		Sender("FlightManagementService", "FlightManagementService", System.out)
	} catch (e: Exception) {
		Sender("Error", "FlightManagementService", System.err)
	}
}
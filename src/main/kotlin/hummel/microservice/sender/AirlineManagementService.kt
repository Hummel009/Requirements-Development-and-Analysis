package hummel.microservice.sender

import hummel.addSampleValue
import hummel.basic.Sender
import hummel.password
import hummel.url
import hummel.user
import java.sql.DriverManager

fun launchAirlineManagementService() {
	try {
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "airlines", 1)
		}
		Sender("AirlineManagement", "AirlineManagement", System.out)
	} catch (e: Exception) {
		Sender("Error", "AirlineManagement", System.err)
	}
}
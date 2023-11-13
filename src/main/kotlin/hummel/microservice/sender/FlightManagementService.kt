package hummel.microservice.sender

import hummel.basic.Sender

fun launchFlightManagementService() {
	Sender("FlightManagementService", "FlightManagementService")
	Sender("Error", "FlightManagementService")
}
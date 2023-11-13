package hummel.microservice.sender

import hummel.basic.Sender

fun launchAirlineManagementService() {
	Sender("AirlineManagement", "AirlineManagement")
	Sender("Error", "AirlineManagement")
}
package hummel.microservice

import hummel.basic.Receiver

fun launchNotificationService() {
	Receiver("AirlineManagement", System.err)
	Receiver("BookingService", System.err)
	Receiver("FlightManagementService", System.err)
	Receiver("PaymentService", System.err)
	Receiver("UserManagementService", System.err)
}
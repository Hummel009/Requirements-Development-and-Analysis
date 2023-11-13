package hummel.microservice

import hummel.basic.Receiver

fun launchNotificationService() {
	Receiver("AirlineManagement", System.out)
	Receiver("BookingService", System.out)
	Receiver("FlightManagementService", System.out)
	Receiver("PaymentService", System.out)
	Receiver("UserManagementService", System.out)
}
package hummel.microservice

import hummel.basic.Receiver

fun launchNotificationService() {
	Receiver("AirlineManagement", System.out).launch()
	Receiver("BookingService", System.out).launch()
	Receiver("FlightManagementService", System.out).launch()
	Receiver("PaymentService", System.out).launch()
	Receiver("UserManagementService", System.out).launch()
}
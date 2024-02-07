package com.github.hummel.rda.microservice

import com.github.hummel.rda.basic.Receiver

fun launchNotificationService() {
	Receiver("AirlineManagement", System.out).launch()
	Receiver("BookingService", System.out).launch()
	Receiver("FlightManagementService", System.out).launch()
	Receiver("PaymentService", System.out).launch()
	Receiver("UserManagementService", System.out).launch()
}
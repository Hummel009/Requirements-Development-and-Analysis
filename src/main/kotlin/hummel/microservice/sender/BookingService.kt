package hummel.microservice.sender

import hummel.basic.Sender

fun launchBookingService() {
	Sender("BookingService", "BookingService")
	Sender("Error", "BookingService")
}
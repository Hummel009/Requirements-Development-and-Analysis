package hummel.microservice.sender

import hummel.addSampleValue
import hummel.basic.Sender
import hummel.password
import hummel.url
import hummel.user
import java.sql.DriverManager

fun launchBookingService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "bookings", 1)
		}
		Sender("BookingService", "BookingService", System.out)
	} catch (e: Exception) {
		Sender("Error", "BookingService", System.err)
	}
}
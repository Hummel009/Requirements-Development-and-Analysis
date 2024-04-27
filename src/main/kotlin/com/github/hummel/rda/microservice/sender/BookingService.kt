package com.github.hummel.rda.microservice.sender

import com.github.hummel.rda.addSampleValue
import com.github.hummel.rda.basic.Sender
import com.github.hummel.rda.password
import com.github.hummel.rda.url
import com.github.hummel.rda.user
import java.sql.DriverManager

fun launchBookingService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "bookings", 1)
		}
		Sender("BookingService", "BookingService", System.out)
	} catch (_: Exception) {
		Sender("Error", "BookingService", System.err)
	}.launch()
}
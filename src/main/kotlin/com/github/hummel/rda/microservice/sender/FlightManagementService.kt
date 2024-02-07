package com.github.hummel.rda.microservice.sender

import com.github.hummel.rda.addSampleValue
import com.github.hummel.rda.basic.Sender
import com.github.hummel.rda.password
import com.github.hummel.rda.url
import com.github.hummel.rda.user
import java.sql.DriverManager

fun launchFlightManagementService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "flights", 1)
		}
		Sender("FlightManagementService", "FlightManagementService", System.out)
	} catch (e: Exception) {
		Sender("Error", "FlightManagementService", System.err)
	}.launch()
}
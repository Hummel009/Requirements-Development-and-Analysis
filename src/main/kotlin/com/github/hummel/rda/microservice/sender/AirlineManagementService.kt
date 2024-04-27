package com.github.hummel.rda.microservice.sender

import com.github.hummel.rda.addSampleValue
import com.github.hummel.rda.basic.Sender
import com.github.hummel.rda.password
import com.github.hummel.rda.url
import com.github.hummel.rda.user
import java.sql.DriverManager

fun launchAirlineManagementService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "airlines", 1)
		}
		Sender("AirlineManagement", "AirlineManagement", System.out)
	} catch (_: Exception) {
		Sender("Error", "AirlineManagement", System.err)
	}.launch()
}
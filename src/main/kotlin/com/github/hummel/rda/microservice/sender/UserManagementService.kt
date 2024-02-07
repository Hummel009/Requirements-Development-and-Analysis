package com.github.hummel.rda.microservice.sender

import com.github.hummel.rda.addSampleValue
import com.github.hummel.rda.basic.Sender
import com.github.hummel.rda.password
import com.github.hummel.rda.url
import com.github.hummel.rda.user
import java.sql.DriverManager

fun launchUserManagementService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "users", 1)
		}
		Sender("UserManagementService", "UserManagementService", System.out)
	} catch (e: Exception) {
		Sender("Error", "UserManagementService", System.err)
	}.launch()
}
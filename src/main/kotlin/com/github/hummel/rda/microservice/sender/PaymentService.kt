package com.github.hummel.rda.microservice.sender

import com.github.hummel.rda.addSampleValue
import com.github.hummel.rda.basic.Sender
import com.github.hummel.rda.password
import com.github.hummel.rda.url
import com.github.hummel.rda.user
import java.sql.DriverManager

fun launchPaymentService() {
	try {
		Class.forName("com.mysql.jdbc.Driver")
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "payments", 1)
		}
		Sender("PaymentService", "PaymentService", System.out)
	} catch (e: Exception) {
		Sender("Error", "PaymentService", System.err)
	}.launch()
}
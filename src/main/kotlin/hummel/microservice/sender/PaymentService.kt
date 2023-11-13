package hummel.microservice.sender

import hummel.addSampleValue
import hummel.basic.Sender
import hummel.password
import hummel.url
import hummel.user
import java.sql.DriverManager

fun launchPaymentService() {
	try {
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(
				it,
				"payments",
				1,
				Sender("PaymentService", "PaymentService", System.out),
				Sender("Error", "PaymentService", System.err)
			)
		}
	} catch (e: Exception) {
		Sender("Error", "PaymentService", System.err)
	}
}
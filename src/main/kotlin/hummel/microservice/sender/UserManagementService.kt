package hummel.microservice.sender

import hummel.addSampleValue
import hummel.basic.Sender
import hummel.password
import hummel.url
import hummel.user
import java.sql.DriverManager

fun launchUserManagementService() {
	try {
		DriverManager.getConnection(url, user, password).use {
			addSampleValue(it, "users", 1)
		}
		Sender("UserManagementService", "UserManagementService", System.out)
	} catch (e: Exception) {
		Sender("Error", "UserManagementService", System.err)
	}
}
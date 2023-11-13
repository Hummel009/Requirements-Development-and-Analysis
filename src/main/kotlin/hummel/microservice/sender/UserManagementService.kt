package hummel.microservice.sender

import hummel.basic.Sender

fun launchUserManagementService() {
	Sender("UserManagementService", "UserManagementService")
	Sender("Error", "UserManagementService")
}
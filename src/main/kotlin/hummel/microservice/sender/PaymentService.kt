package hummel.microservice.sender

import hummel.basic.Sender

fun launchPaymentService() {
	Sender("PaymentService", "PaymentService")
	Sender("Error", "PaymentService")
}
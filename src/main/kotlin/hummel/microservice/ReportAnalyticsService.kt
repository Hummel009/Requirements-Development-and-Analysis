package hummel.microservice

import hummel.basic.Receiver

fun launchReportAnalyticsService() {
	Receiver("Error", System.err)
}
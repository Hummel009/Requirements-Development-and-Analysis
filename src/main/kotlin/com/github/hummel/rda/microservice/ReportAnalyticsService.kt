package com.github.hummel.rda.microservice

import com.github.hummel.rda.basic.Receiver

fun launchReportAnalyticsService() {
	Receiver("Error", System.err).launch()
}
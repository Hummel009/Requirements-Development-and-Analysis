package com.github.hummel.rda.basic

import com.rabbitmq.client.ConnectionFactory
import java.io.PrintStream
import java.nio.charset.StandardCharsets

class Sender(private val queueName: String, private val content: String, private val stream: PrintStream) {
	fun launch() {
		val factory = ConnectionFactory()
		factory.host = "localhost"
		factory.newConnection().use { connection ->
			connection.createChannel().use { channel ->
				channel.queueDeclare(queueName, false, false, false, null)
				channel.basicPublish("", queueName, null, content.toByteArray(StandardCharsets.UTF_8))
				stream.println(" [x] Sent '$content'")
			}
		}
	}
}
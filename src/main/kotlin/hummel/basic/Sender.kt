package hummel.basic

import com.rabbitmq.client.ConnectionFactory
import java.nio.charset.StandardCharsets

class Sender(queueName: String, content: String) {
	init {
		val factory = ConnectionFactory()
		factory.host = "localhost"
		factory.newConnection().use { connection ->
			connection.createChannel().use { channel ->
				channel.queueDeclare(queueName, false, false, false, null)
				channel.basicPublish("", queueName, null, content.toByteArray(StandardCharsets.UTF_8))
				println(" [x] Sent '$content'")
			}
		}
	}
}
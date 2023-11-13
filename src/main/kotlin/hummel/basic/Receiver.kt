package hummel.basic

import com.rabbitmq.client.ConnectionFactory
import com.rabbitmq.client.DeliverCallback
import com.rabbitmq.client.Delivery
import java.io.PrintStream
import java.nio.charset.StandardCharsets

class Receiver(queueName: String, stream: PrintStream) {
	init {
		val factory = ConnectionFactory()
		factory.host = "localhost"
		val connection = factory.newConnection()
		val channel = connection.createChannel()
		channel.queueDeclare(queueName, false, false, false, null)
		stream.println(" [*] Waiting for messages.")
		val deliverCallback = DeliverCallback { _: String?, delivery: Delivery ->
			val message = String(delivery.body, StandardCharsets.UTF_8)
			stream.println(" [x] Received '$message'")
		}
		channel.basicConsume(queueName, true, deliverCallback) { _: String? -> }
	}
}
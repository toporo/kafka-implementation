package toporo.com.kafkaproducer.services

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.Producer
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import toporo.com.kafkaproducer.entities.Message
import java.util.*

@Service
class KafkaService {

    @Value("\${kafka.connection.string}")
    val connectionString: String? = null

    fun createProducer(): Producer<String, String> {
        val props = Properties()
        props["bootstrap.servers"] = connectionString
        props["key.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"
        props["value.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"

        return KafkaProducer(props)
    }

    fun sendMessage(message : Message): String {

        var producer = createProducer()

        var record = ProducerRecord(message.topic, "Message", message.message)
        producer.send(record)

        return "message success"
    }
}
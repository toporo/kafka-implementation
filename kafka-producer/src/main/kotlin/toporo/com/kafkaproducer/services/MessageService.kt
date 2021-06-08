package toporo.com.kafkaproducer.services

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.Producer
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.stereotype.Service
import toporo.com.kafkaproducer.entities.Message
import java.util.*

@Service
class MessageService {
    open fun SendNewMessage(mesage : Message) : String {

        var producer = createProducer()

        var record = ProducerRecord(mesage.topic, "Message", mesage.message)
        producer.send(record)

        return "Send message!"
    }

    fun createProducer(): Producer<String, String> {
        val props = Properties()
        props["bootstrap.servers"] = "localhost:9092"
        props["key.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"
        props["value.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"

        return KafkaProducer(props)
    }
}
package toporo.com.kafkaproducer.services

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.Producer
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class KafkaService {

    @Value("\${kafka.connection.string}")
    val connectionString: String? = null

    open fun createProducer(): Producer<String, String> {
        val props = Properties()
        props["bootstrap.servers"] = connectionString
        props["key.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"
        props["value.serializer"] = "org.apache.kafka.common.serialization.StringSerializer"

        return KafkaProducer(props)
    }
}
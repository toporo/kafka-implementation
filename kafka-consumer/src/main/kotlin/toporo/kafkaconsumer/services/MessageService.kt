package toporo.kafkaconsumer.services

import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class MessageService {
    private val logger = LoggerFactory.getLogger(javaClass)
    @KafkaListener(topics = ["NEW_ORDER_TOPIC"], groupId = "simple-kotlin-consumer")
    fun processMessage(message: String) {
        logger.info("got message: {}", message)
    }
}
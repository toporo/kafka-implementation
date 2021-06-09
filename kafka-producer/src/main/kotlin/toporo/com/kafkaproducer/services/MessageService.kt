package toporo.com.kafkaproducer.services
import org.apache.kafka.clients.producer.ProducerRecord
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import toporo.com.kafkaproducer.entities.Message
import java.util.*

@Service
class MessageService {

    @Autowired
    lateinit var kafkaService: KafkaService

    fun SendNewMessage(message : Message) : String {

        var response = kafkaService.sendMessage(message)

        return response
    }
}
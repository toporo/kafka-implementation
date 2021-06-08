package toporo.com.kafkaproducer.services

import org.springframework.stereotype.Service
import toporo.com.kafkaproducer.entities.Message

@Service
class MessageService {
    open fun SendNewMessage(mesage : Message) : String {

        return "Send message!"
    }
}
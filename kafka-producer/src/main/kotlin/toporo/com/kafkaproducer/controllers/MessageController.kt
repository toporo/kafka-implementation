package toporo.com.kafkaproducer.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import toporo.com.kafkaproducer.entities.Message
import toporo.com.kafkaproducer.services.MessageService

@RestController
@RequestMapping("messages")
class MessageController {

    @Autowired
    lateinit var messageService: MessageService

    @PostMapping
    fun insertMessage(@RequestBody message : Message) : String {
        return messageService.SendNewMessage(message)
    }
}
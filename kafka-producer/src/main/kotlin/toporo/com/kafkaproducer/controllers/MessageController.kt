package toporo.com.kafkaproducer.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("messages")
class MessageController {

    @PostMapping
    fun insertMessage(@RequestBody message : String) : String {
        return message
    }
}
package toporo.kafkaconsumer.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("messages")
class MessageController {

    @GetMapping
    fun list(): String {
        return "return"
    }
}
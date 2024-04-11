package de.hennroja.example.springkafka.controller

import de.hennroja.example.springkafka.service.DataProducerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class TriggerProducerController(val dataProducerService: DataProducerService) {

    @GetMapping("trigger")
    public fun triggerProducer(): String {
        dataProducerService.gen(20)
        return "Okay"
    }
}
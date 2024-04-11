package de.hennroja.example.springkafka.service

import de.hennroja.example.springkafka.model.LeasingOffer
import org.springframework.kafka.annotation.KafkaHandler
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.handler.annotation.Header
import org.springframework.stereotype.Service

@Service
@KafkaListener(topics = ["leasingCars"], clientIdPrefix = "car-offer-client", groupId = "car-offer-group", id = "id-car-offer-consumer", concurrency = "2")
class KafkaConsumers {

    @KafkaHandler
    fun processMessage1(content: LeasingOffer,
                        @Header(KafkaHeaders.GROUP_ID) groupId: String,
                        @Header(KafkaHeaders.RECEIVED_PARTITION) partition: Int) {
        println("Consumer gid: {$groupId} p:{$partition}: $content")
    }
}
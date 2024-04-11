package de.hennroja.example.springkafka.service

import de.hennroja.example.springkafka.model.LeasingOffer
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class DataProducerService(
        private val kafkaTemplate: KafkaTemplate<String, Any>) {

    val makes = listOf("VW", "Mercedes-Benz", "BMW", "Porsche")
    val model = listOf("Hammer", "Rocket", "Flash", "Bone", "Stone", "Woody")
    val variants = listOf("12l big block", "electric", "3l diesel")

    fun gen(numberOfCars: Int) {
        repeat(numberOfCars) { index ->
            val offer = LeasingOffer(makes.random(),
                    model.random(),
                    variants.random(),
                    Random.nextDouble(22000.0, 90000.0),
                    Random.nextDouble(90.0, 1000.0)
            )
            kafkaTemplate.send("leasingCars", index.toString(), offer)
        }

    }
}
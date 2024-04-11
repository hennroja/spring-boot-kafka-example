package de.hennroja.example.springkafka.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka


@EnableKafka
@Configuration
class KafkaConfiguration() {

    @Bean
    fun createKafkaTopicLeasingOffer(): NewTopic {
        return NewTopic("leasingCars", 3, 1)
    }

}
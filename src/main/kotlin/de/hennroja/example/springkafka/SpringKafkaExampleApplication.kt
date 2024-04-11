package de.hennroja.example.springkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKafkaExampleApplication

fun main(args: Array<String>) {
    runApplication<SpringKafkaExampleApplication>(*args)
}

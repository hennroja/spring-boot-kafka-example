# Spring Boot Kafka Example 2024

This repository contains a sample application that demonstrates how to integrate Apache Kafka with a Spring Boot application. The example showcases the configuration and usage of Kafka producers and consumers, along with the creation of Kafka topics.

## Features

- Kafka producer is automatically configured using `application.yaml`
- Kafka consumer configured manually in code
- Manual creation of a Kafka topic. See: `KafkaConfiguration` class
- Docker-based setup for Kafka, Zookeeper, and Kafdrop

## Prerequisites

- Java + Kotlin
- Docker and Docker Compose

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/hennroja/spring-boot-kafka-example-2024.git
   ```

2. Navigate to the project directory:

   ```bash
   cd spring-boot-kafka-example-2024
   ```

3. Start the Kafka environment using Docker Compose:

   ```bash
   docker-compose up -d
   ```

   This command will start the Kafka broker, Zookeeper, and Kafdrop instances.

4. Run the Spring Boot application:

   ```bash
   ./gradlew bootRun
   ```

   The application will start and connect to the Kafka broker.

5. Open a web browser and visit `http://localhost:8080/trigger` to generate and publish random messages to the Kafka topic.

6. To view the Kafka topics and messages, open Kafdrop in your web browser at `http://localhost:9000`.

## Configuration

- The Kafka producer is configured using the `application.yaml` file located in the `src/main/resources` directory. You can modify the producer settings in this file.

- The Kafka consumer is configured manually in the code. You can find the consumer configuration in the `KafkaConsumerConfig` class.

- The Kafka topic is created manually in the `KafkaConfiguration` class. You can modify the topic name and settings in this class.

## Docker Setup

The project includes a Docker Compose file (`docker-compose.yml`) that sets up the following components:

- Kafka Broker
- Zookeeper
- Kafdrop (Kafka web UI)

The Docker Compose file is configured to expose the necessary ports and set up the required dependencies between the components.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

Feel free to customize the README.md file further based on your specific project requirements and add any additional sections or information that you think would be helpful for users of your repository.

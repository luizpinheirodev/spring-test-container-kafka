package dev.backend.luiz.springtestcontainerkafka.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app.kafka.example")
class ReactiveKafkaAppProperties {
    lateinit var bootstrapServers: String
    lateinit var inputTopic: String
    lateinit var outputTopic: String
    lateinit var consumerGroupId: String
}
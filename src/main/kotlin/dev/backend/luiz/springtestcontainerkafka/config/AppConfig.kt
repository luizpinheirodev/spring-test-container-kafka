package dev.backend.luiz.springtestcontainerkafka.config

import dev.backend.luiz.springtestcontainerkafka.KafkaReactiveConsumer
import dev.backend.luiz.springtestcontainerkafka.KafkaReactiveProducer
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@EnableConfigurationProperties(ReactiveKafkaAppProperties::class)
@Configuration
class AppConfig {

    @Bean
    fun reactiveProducer(propertiesReactiveKafka: ReactiveKafkaAppProperties) =
        KafkaReactiveProducer<String, String>(propertiesReactiveKafka.bootstrapServers)

    @Bean
    fun reactiveConsumer(propertiesReactiveKafka: ReactiveKafkaAppProperties) =
        KafkaReactiveConsumer<String, String>(
            propertiesReactiveKafka.bootstrapServers,
            propertiesReactiveKafka.inputTopic,
            propertiesReactiveKafka.consumerGroupId
        )


}
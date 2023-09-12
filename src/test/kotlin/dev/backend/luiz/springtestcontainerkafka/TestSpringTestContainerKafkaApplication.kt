package dev.backend.luiz.springtestcontainerkafka

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestSpringTestContainerKafkaApplication

fun main(args: Array<String>) {
	fromApplication<SpringTestContainerKafkaApplication>().with(TestSpringTestContainerKafkaApplication::class).run(*args)
}

package eu.maksimov.spring.hazelcast.clustering

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HazelcastClusteringDemoApplication

fun main(args: Array<String>) {
	runApplication<HazelcastClusteringDemoApplication>(*args)
}

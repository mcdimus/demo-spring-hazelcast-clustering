package eu.maksimov.spring.hazelcast.clustering.model

import java.io.Serializable
import java.time.Instant
import java.util.UUID

data class Entity(val id: UUID = UUID.randomUUID(), val timestamp: Instant = Instant.now()): Serializable

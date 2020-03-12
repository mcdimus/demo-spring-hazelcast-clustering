package eu.maksimov.spring.hazelcast.clustering.service

import eu.maksimov.spring.hazelcast.clustering.model.Entity
import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class DemoService {

    @Cacheable("entity")
    fun getNewEntity() = Entity()

}

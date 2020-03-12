package eu.maksimov.spring.hazelcast.clustering.controller

import eu.maksimov.spring.hazelcast.clustering.service.DemoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
        val demoService: DemoService
) {

    @GetMapping("/entity")
    fun getNewEntity() = demoService.getNewEntity()

}

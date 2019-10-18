package io.ztech.cloud.webfluxdemo.controllers;

import io.ztech.cloud.webfluxdemo.domain.Brewery;
import io.ztech.cloud.webfluxdemo.services.BreweryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BreweryController {
    @Autowired
    private BreweryService breweryService;

    @GetMapping("/brewery/{id}")
    Mono<Brewery> getBrewery(@PathVariable String id) {
         return breweryService.find(id);
    }
}

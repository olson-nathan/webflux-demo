package io.ztech.cloud.webfluxdemo.controllers;

import io.ztech.cloud.webfluxdemo.domain.Beer;
import io.ztech.cloud.webfluxdemo.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BeerController {

    @Autowired
    private BeerService beerService;

    @GetMapping("/beers")
    public Flux<Beer> getBeers() {
        return beerService.allBeers().onErrorReturn(Beer.builder().build());
    }

    @GetMapping("/beer/{id}")
    public Mono<Beer> getBeer(@PathVariable String id) {
        return beerService.findById(id);
    }
}

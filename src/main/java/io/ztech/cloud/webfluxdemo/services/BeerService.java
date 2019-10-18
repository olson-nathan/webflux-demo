package io.ztech.cloud.webfluxdemo.services;

import io.ztech.cloud.webfluxdemo.domain.Beer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BeerService {
    Flux<Beer> allBeers();
    Flux<Beer> allBeers(int limit);
    Mono<Beer> findById(String id);
}

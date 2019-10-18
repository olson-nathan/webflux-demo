package io.ztech.cloud.webfluxdemo.services;

import io.ztech.cloud.webfluxdemo.domain.Brewery;
import reactor.core.publisher.Mono;

public interface BreweryService {
    Mono<Brewery> find(String id);
}

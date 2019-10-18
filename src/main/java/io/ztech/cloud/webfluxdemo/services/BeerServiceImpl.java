package io.ztech.cloud.webfluxdemo.services;

import io.ztech.cloud.webfluxdemo.domain.Beer;
import io.ztech.cloud.webfluxdemo.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service("beerService")
public class BeerServiceImpl implements BeerService {

    private static final int DEFAULT_LIMIT = 100;

    @Autowired
    private BeerRepository beerRepository;

    @Override
    public Flux<Beer> allBeers() {
        return allBeers(DEFAULT_LIMIT);
    }

    @Override
    public Flux<Beer> allBeers(int limit) {
//        return beerRepository.findAll(Sort.by(new Sort.Order(Sort.Direction.DESC, "abv")));
        return beerRepository.findAll();
    }

    @Override
    public Mono<Beer> findById(String id) {
        return beerRepository.findById(id);
    }
}

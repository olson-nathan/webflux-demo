package io.ztech.cloud.webfluxdemo.repositories;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

import io.ztech.cloud.webfluxdemo.domain.Beer;
import reactor.core.publisher.Flux;

@Repository("beerRepository")
public interface BeerRepository extends ReactiveSortingRepository<Beer, String> {
    @Override
    @Query("#{#n1ql.selectEntity} WHERE type = 'beer'")
    Flux<Beer> findAll();
}

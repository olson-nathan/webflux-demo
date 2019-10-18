package io.ztech.cloud.webfluxdemo.repositories;

import io.ztech.cloud.webfluxdemo.domain.Brewery;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository("breweryRepository")
public interface BreweryRepository extends ReactiveSortingRepository<Brewery, String> {
}

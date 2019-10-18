package io.ztech.cloud.webfluxdemo.services;

import io.ztech.cloud.webfluxdemo.domain.Brewery;
import io.ztech.cloud.webfluxdemo.repositories.BreweryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service("breweryService")
public class BreweryServiceImpl implements BreweryService {
    @Autowired
    private BreweryRepository breweryRepository;

    @Override
    public Mono<Brewery> find(String id) {
        return breweryRepository.findById(id);
    }
}

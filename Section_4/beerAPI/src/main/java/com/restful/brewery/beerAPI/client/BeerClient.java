package com.restful.brewery.beerAPI.client;

import com.restful.brewery.beerAPI.model.BeerDto;
import com.restful.brewery.beerAPI.model.BeerPagedList;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface BeerClient {
    Mono<BeerDto> getBeerById(UUID id, Boolean showInventoryOnHand);

    Mono<BeerPagedList> listBeers(Integer pageNumber, Integer pageSize, String beerName,
                                  String beerStyle, Boolean showInventoryOnhand);

    Mono<ResponseEntity<Void>> createBeer(BeerDto beerDto);

    Mono<ResponseEntity<Void>> updateBeer(UUID beerId,BeerDto beerDto);

    Mono<ResponseEntity<Void>> deleteBeerById(UUID id);

    Mono<BeerDto> getBeerByUPC(String upc);
}

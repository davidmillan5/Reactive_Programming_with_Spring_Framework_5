package com.spring.boot.reactive.brewery.services;

import com.spring.boot.reactive.brewery.web.model.BeerDto;
import com.spring.boot.reactive.brewery.web.model.BeerPagedList;
import com.spring.boot.reactive.brewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);

    void deleteBeerById(UUID beerId);
}

package com.spring.boot.reactive.brewery.web.mapper;

import com.spring.boot.reactive.brewery.domain.Beer;
import com.spring.boot.reactive.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}

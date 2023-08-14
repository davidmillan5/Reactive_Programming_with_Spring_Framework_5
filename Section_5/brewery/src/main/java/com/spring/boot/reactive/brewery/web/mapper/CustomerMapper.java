package com.spring.boot.reactive.brewery.web.mapper;

import com.spring.boot.reactive.brewery.domain.Customer;
import com.spring.boot.reactive.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
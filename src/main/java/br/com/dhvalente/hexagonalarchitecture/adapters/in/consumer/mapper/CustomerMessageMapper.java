package br.com.dhvalente.hexagonalarchitecture.adapters.in.consumer.mapper;

import br.com.dhvalente.hexagonalarchitecture.adapters.in.consumer.message.CustomerMessage;
import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
package br.com.dhvalente.hexagonalarchitecture.adapters.out.client.mapper;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.client.response.AddressResponse;
import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
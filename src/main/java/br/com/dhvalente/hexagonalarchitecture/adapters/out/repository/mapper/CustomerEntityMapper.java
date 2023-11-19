package br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.mapper;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.entity.CustomerEntity;
import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

}
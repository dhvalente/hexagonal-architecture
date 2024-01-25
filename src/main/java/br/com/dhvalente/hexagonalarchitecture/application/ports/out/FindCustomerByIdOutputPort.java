package br.com.dhvalente.hexagonalarchitecture.application.ports.out;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find (String id);
}

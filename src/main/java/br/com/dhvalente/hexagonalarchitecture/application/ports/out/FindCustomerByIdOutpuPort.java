package br.com.dhvalente.hexagonalarchitecture.application.ports.out;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutpuPort {

    Optional<Customer> find (String id);
}

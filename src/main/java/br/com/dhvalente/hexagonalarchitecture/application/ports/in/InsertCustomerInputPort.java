package br.com.dhvalente.hexagonalarchitecture.application.ports.in;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
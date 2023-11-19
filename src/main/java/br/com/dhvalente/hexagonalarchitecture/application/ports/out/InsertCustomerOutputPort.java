package br.com.dhvalente.hexagonalarchitecture.application.ports.out;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
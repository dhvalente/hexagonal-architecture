package br.com.dhvalente.hexagonalarchitecture.application.ports.in;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipcode);


}

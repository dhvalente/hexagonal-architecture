package br.com.dhvalente.hexagonalarchitecture.application.ports.in;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find (String id);
}

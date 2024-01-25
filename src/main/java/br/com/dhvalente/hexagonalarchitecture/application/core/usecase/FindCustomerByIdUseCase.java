package br.com.dhvalente.hexagonalarchitecture.application.core.usecase;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {
    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }
    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}

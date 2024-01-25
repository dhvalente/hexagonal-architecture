package br.com.dhvalente.hexagonalarchitecture.application.core.usecase;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutpuPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {
    private final FindCustomerByIdOutpuPort findCustomerByIdOutpuPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutpuPort findCustomerByIdOutpuPort) {
        this.findCustomerByIdOutpuPort = findCustomerByIdOutpuPort;
    }
    @Override
    public Customer find(String id){
        return findCustomerByIdOutpuPort.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}

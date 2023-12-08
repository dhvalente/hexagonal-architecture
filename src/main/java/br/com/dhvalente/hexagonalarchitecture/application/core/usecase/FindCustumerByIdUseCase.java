package br.com.dhvalente.hexagonalarchitecture.application.core.usecase;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutpuPort;
import org.springframework.beans.factory.annotation.Autowired;

public class FindCustumerByIdUseCase implements FindCustomerByIdInputPort {
    private final FindCustomerByIdOutpuPort findCustomerByIdOutpuPort;

    public FindCustumerByIdUseCase(FindCustomerByIdOutpuPort findCustomerByIdOutpuPort) {
        this.findCustomerByIdOutpuPort = findCustomerByIdOutpuPort;
    }
    @Override
    public Customer find(String id){
        return findCustomerByIdOutpuPort.find(id).orElseThrow(()-> new RuntimeException("Customer not found"));
    }
}

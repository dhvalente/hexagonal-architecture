package br.com.dhvalente.hexagonalarchitecture.application.core.usecase;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.FindCustomerByIdInputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.UpdateCustomerInputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase  implements  UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;
    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }
    @Override
    public void update (Customer customer, String zipcode){
        findCustomerByIdInputPort.find(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipcode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);

    }
}

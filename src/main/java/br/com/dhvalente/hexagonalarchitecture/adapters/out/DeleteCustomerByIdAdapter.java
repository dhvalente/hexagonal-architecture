package br.com.dhvalente.hexagonalarchitecture.adapters.out;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.CustomerRepository;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

}
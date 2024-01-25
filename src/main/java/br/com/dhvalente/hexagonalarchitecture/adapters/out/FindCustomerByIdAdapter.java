package br.com.dhvalente.hexagonalarchitecture.adapters.out;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.CustomerRepository;
import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}

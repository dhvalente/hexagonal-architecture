package br.com.dhvalente.hexagonalarchitecture.adapters.out;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.CustomerRepository;
import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Customer;
import br.com.dhvalente.hexagonalarchitecture.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}
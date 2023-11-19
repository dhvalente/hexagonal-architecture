package br.com.dhvalente.hexagonalarchitecture.adapters.out.repository;


import br.com.dhvalente.hexagonalarchitecture.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

}
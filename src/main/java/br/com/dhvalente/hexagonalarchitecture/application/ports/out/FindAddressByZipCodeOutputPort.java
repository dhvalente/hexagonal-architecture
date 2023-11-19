package br.com.dhvalente.hexagonalarchitecture.application.ports.out;

import br.com.dhvalente.hexagonalarchitecture.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);

}
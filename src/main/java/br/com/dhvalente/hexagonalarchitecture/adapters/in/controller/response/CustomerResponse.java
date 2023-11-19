package br.com.dhvalente.hexagonalarchitecture.adapters.in.controller.response;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private AddressResponse address;

    private String cpf;

    private Boolean isValidCpf;

}
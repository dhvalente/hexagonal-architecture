package br.com.dhvalente.hexagonalarchitecture.application.ports.out;

public interface SendCpfForValidationOutputPort {

    void send(String cpf);

}
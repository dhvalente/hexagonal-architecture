package br.com.dhvalente.hexagonalarchitecture.adapters.in.consumer;


import br.com.dhvalente.hexagonalarchitecture.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.dhvalente.hexagonalarchitecture.adapters.in.consumer.message.CustomerMessage;
import br.com.dhvalente.hexagonalarchitecture.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }

}
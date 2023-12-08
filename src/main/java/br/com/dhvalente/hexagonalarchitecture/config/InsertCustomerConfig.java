package br.com.dhvalente.hexagonalarchitecture.config;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.FindAddressByZipCodeAdapter;
import br.com.dhvalente.hexagonalarchitecture.adapters.out.InsertCustomerAdapter;
import br.com.dhvalente.hexagonalarchitecture.adapters.out.SendCpfForValidationAdapter;
import br.com.dhvalente.hexagonalarchitecture.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
package br.com.dhvalente.hexagonalarchitecture.config;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.FindAddressByZipCodeAdapter;
import br.com.dhvalente.hexagonalarchitecture.adapters.out.UpdateCustomerAdapter;
import br.com.dhvalente.hexagonalarchitecture.application.core.usecase.FindCustomerByIdUseCase;
import br.com.dhvalente.hexagonalarchitecture.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
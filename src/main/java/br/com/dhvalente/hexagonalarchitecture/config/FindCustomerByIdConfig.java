package br.com.dhvalente.hexagonalarchitecture.config;

import br.com.dhvalente.hexagonalarchitecture.adapters.out.FindCustomerByIdAdapter;
import br.com.dhvalente.hexagonalarchitecture.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
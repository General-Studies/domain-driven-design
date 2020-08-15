package com.jetherrodrigues.ticket.application.config;

import com.jetherrodrigues.ticket.domain.client.ClientRepository;
import com.jetherrodrigues.ticket.domain.client.ClientService;
import com.jetherrodrigues.ticket.domain.client.ClientServiceImpl;
import com.jetherrodrigues.ticket.resource.client.repository.ClientRepositoryImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public final class BeanConfig {

    @Bean
    public ClientRepository getClientRepository() {
        return new ClientRepositoryImpl();
    }

    @Bean
    public ClientService getClientService() {
        return new ClientServiceImpl(getClientRepository());
    }

}

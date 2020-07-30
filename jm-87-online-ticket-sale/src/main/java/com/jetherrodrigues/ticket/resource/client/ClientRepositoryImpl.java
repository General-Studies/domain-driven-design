package com.jetherrodrigues.ticket.resource.client;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import com.jetherrodrigues.ticket.domain.client.ClientRepository;
import com.jetherrodrigues.ticket.resource.client.entities.ClientJpaEntity;
import com.jetherrodrigues.ticket.resource.client.repository.ClientJpaRepository;

public final class ClientRepositoryImpl implements ClientRepository {
    private final ClientJpaRepository repository;

    public ClientRepositoryImpl(ClientJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(final Client client) {
        final ClientJpaEntity entity = ClientJpaEntity.from(client);
        repository.save(entity);
    }
}

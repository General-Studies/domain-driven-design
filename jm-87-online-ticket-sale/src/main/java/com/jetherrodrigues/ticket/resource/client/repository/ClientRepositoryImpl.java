package com.jetherrodrigues.ticket.resource.client.repository;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import com.jetherrodrigues.ticket.domain.client.ClientRepository;
import com.jetherrodrigues.ticket.resource.client.entities.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public final class ClientRepositoryImpl implements ClientRepository {

    @Autowired
    private ClientJpaRepository repository;

    @Transactional
    @Override
    public Client save(final Client client) {
        final ClientEntity entity = ClientEntity.from(client);
        return repository.save(entity).toClient();
    }

    @Override
    public Optional<Client> findBy(final String id) {
        return repository.findById(id).map(ClientEntity::toClient);
    }

    @Override
    public Set<Client> findAll() {
        return repository.findAll()
                .stream().map(ClientEntity::toClient).collect(Collectors.toSet());
    }
}

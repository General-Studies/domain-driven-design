package com.jetherrodrigues.ticket.domain.client;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import com.jetherrodrigues.ticket.domain.exceptions.NotFoundException;
import java.util.Optional;
import java.util.Set;
import static com.jetherrodrigues.ticket.domain.exceptions.messages.DomainExceptionMessages.CLIENT_NOT_FOUND;

public final class ClientServiceImpl implements ClientService {

    private final ClientRepository repository;

    public ClientServiceImpl(final ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public Client save(final Client client) {
        return repository.save(client);
    }

    @Override
    public Client getOne(final String id) {
        return findBy(id).orElseThrow(() -> new NotFoundException(String.format(CLIENT_NOT_FOUND.getMessage(), id)));
    }

    @Override
    public Optional<Client> findBy(final String id) {
        return repository.findBy(id);
    }

    @Override
    public Set<Client> findAll() {
        return repository.findAll();
    }
}

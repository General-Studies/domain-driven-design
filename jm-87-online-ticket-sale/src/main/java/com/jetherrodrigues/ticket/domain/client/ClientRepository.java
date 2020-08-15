package com.jetherrodrigues.ticket.domain.client;

import com.jetherrodrigues.ticket.domain.client.entities.Client;

import java.util.Optional;
import java.util.Set;

public interface ClientRepository {
    Client save(final Client client);
    Optional<Client> findBy(final String id);
    Set<Client> findAll();
}

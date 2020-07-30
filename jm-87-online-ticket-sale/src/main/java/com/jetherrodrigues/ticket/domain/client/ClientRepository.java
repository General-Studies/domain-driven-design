package com.jetherrodrigues.ticket.domain.client;

import com.jetherrodrigues.ticket.domain.client.entities.Client;

public interface ClientRepository {
    void save(final Client client);
}

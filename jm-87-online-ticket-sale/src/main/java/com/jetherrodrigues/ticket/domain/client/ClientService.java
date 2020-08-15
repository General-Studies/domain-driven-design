package com.jetherrodrigues.ticket.domain.client;

import com.jetherrodrigues.ticket.domain.client.entities.Client;

public interface ClientService extends ClientRepository {
    Client getOne(final String id);
}

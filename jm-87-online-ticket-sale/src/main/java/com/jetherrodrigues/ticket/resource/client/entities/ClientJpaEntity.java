package com.jetherrodrigues.ticket.resource.client.entities;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import io.azam.ulidj.ULID;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public final class ClientJpaEntity implements Serializable {
    @Id
    private final String id;

    public ClientJpaEntity() {
        this.id = ULID.random();
    }

    public String getId() {
        return id;
    }

    public static ClientJpaEntity from(final Client client) {
        return new ClientJpaEntity();
    }
}

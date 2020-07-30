package com.jetherrodrigues.ticket.resource.client.entities;

import io.azam.ulidj.ULID;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public final class Client implements Serializable {
    private final String id;

    public Client(String id) {
        this.id = ULID.random();
    }

    public String getId() {
        return id;
    }
}

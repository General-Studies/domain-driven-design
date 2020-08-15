package com.jetherrodrigues.ticket.application.web.response;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import org.springframework.lang.NonNull;

import java.io.Serializable;

public final class ClientResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String cpf;
    private String email;
    private String phone;
    private String address;

    public ClientResponse(){}

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public ClientResponse id(final String id) {
        this.id = id;
        return this;
    }

    public ClientResponse name(final String name) {
        this.name = name;
        return this;
    }

    public ClientResponse cpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public ClientResponse email(final String email) {
        this.email = email;
        return this;
    }

    public ClientResponse phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public ClientResponse address(final String address) {
        this.address = address;
        return this;
    }

    public static ClientResponse from(final @NonNull Client client) {
        return new ClientResponse()
                .id(client.getId())
                .name(client.getName())
                .cpf(client.getCpf())
                .email(client.getEmail())
                .phone(client.getSimpleFormattedPhone())
                .address(client.getSimpleFormattedAddress());
    }
}

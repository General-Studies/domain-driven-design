package com.jetherrodrigues.ticket.domain.client.entities;

import java.util.Objects;

public final class Client {
    private String id;
    private String name;
    private String cpf;
    private String email;
    private Phone phone;
    private Address address;

    public String getId() {
        return id;
    }

    public Client id(final String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client name(final String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Client cpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Client email(final String email) {
        this.email = email;
        return this;
    }

    public Phone getPhone() {
        return phone;
    }

    public Client phone(final Phone phone) {
        this.phone = phone;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Client address(final Address address) {
        this.address = address;
        return this;
    }

    public String getSimpleFormattedPhone() {
        return this.phone.toString();
    }

    public String getSimpleFormattedAddress() {
        return this.address.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(cpf, client.cpf) &&
                Objects.equals(email, client.email) &&
                Objects.equals(phone, client.phone) &&
                Objects.equals(address, client.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, phone, address);
    }
}

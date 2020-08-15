package com.jetherrodrigues.ticket.resource.client.entities;

import com.jetherrodrigues.ticket.domain.client.entities.Client;
import io.azam.ulidj.ULID;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public final class ClientEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    @Column
    private String name;
    @Column
    private String cpf;
    @Column
    private String email;
    @Embedded
    private PhoneEntity phoneEntity;
    @Embedded
    private AddressEntity addressEntity;

    public ClientEntity() {}

    private ClientEntity(final String name, final String cpf, final String email,
                         final PhoneEntity phoneEntity, final AddressEntity addressEntity) {
        this.id = ULID.random();
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phoneEntity = phoneEntity;
        this.addressEntity = addressEntity;
    }

    public static ClientEntity from(final Client client) {
        return new ClientEntity(
                client.getName(),
                client.getCpf(),
                client.getEmail(),
                PhoneEntity.of(client.getPhone()),
                AddressEntity.of(client.getAddress())
        );
    }

    public Client toClient() {
        return new Client()
                .id(this.id)
                .name(this.name)
                .cpf(this.cpf)
                .email(this.email)
                .phone(this.phoneEntity.toPhone())
                .address(this.addressEntity.toAddress());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PhoneEntity getPhoneEntity() {
        return phoneEntity;
    }

    public void setPhoneEntity(PhoneEntity phoneEntity) {
        this.phoneEntity = phoneEntity;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientEntity that = (ClientEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(cpf, that.cpf) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneEntity, that.phoneEntity) &&
                Objects.equals(addressEntity, that.addressEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cpf, email, phoneEntity, addressEntity);
    }
}

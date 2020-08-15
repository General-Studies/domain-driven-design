package com.jetherrodrigues.ticket.resource.client.entities;

import com.jetherrodrigues.ticket.domain.client.entities.Address;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public final class AddressEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String street;
    private int number;
    private String complement;
    private String state;
    private String city;
    private String neighborhood;
    private String zipCode;

    public AddressEntity(){}

    private AddressEntity(final String street, final int number, final String complement,
                          final String state, final String city, final String neighborhood,
                          final String zipCode) {
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.state = state;
        this.city = city;
        this.neighborhood = neighborhood;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public static AddressEntity of(final Address address) {
        return new AddressEntity(
                address.getStreet(),
                address.getNumber(),
                address.getComplement(),
                address.getState(),
                address.getCity(),
                address.getNeighborhood(),
                address.getZipCode()
        );
    }

    public Address toAddress() {
        return new Address()
                .street(this.street)
                .number(this.number)
                .complement(this.complement)
                .neighborhood(this.neighborhood)
                .state(this.state)
                .city(this.city)
                .zipCode(this.zipCode);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return number == that.number &&
                Objects.equals(street, that.street) &&
                Objects.equals(complement, that.complement) &&
                Objects.equals(state, that.state) &&
                Objects.equals(city, that.city) &&
                Objects.equals(neighborhood, that.neighborhood) &&
                Objects.equals(zipCode, that.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, complement, state, city, neighborhood, zipCode);
    }
}
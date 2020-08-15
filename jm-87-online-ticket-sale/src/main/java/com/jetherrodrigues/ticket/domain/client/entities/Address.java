package com.jetherrodrigues.ticket.domain.client.entities;

import java.util.Objects;

public final class Address {
    private String street;
    private int number;
    private String complement;
    private String state;
    private String city;
    private String neighborhood;
    private String zipCode;

    public String getStreet() {
        return street;
    }

    public Address street(final String street) {
        this.street = street;
        return this;
    }

    public int getNumber() {
        return number;
    }

    public Address number(final int number) {
        this.number = number;
        return this;
    }

    public String getComplement() {
        return complement;
    }

    public Address complement(final String complement) {
        this.complement = complement;
        return this;
    }

    public String getState() {
        return state;
    }

    public Address state(final String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address city(final String city) {
        this.city = city;
        return this;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public Address neighborhood(final String neighborhood) {
        this.neighborhood = neighborhood;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Address zipCode(final String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number &&
                Objects.equals(street, address.street) &&
                Objects.equals(complement, address.complement) &&
                Objects.equals(state, address.state) &&
                Objects.equals(city, address.city) &&
                Objects.equals(neighborhood, address.neighborhood) &&
                Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, complement, state, city, neighborhood, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", complement='" + complement + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

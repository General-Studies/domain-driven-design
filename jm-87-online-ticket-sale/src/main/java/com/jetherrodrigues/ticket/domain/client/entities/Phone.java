package com.jetherrodrigues.ticket.domain.client.entities;

import java.util.Objects;

public final class Phone {
    private String country;
    private String areaCode;
    private String phone;
    private String mobile;

    private Phone(final String country, final String areaCode, final String phone,
                  final String mobile) {
        this.country = country;
        this.areaCode = areaCode;
        this.phone = phone;
        this.mobile = mobile;
    }

    public static Phone of(final String country, final String areaCode,
                           final String phone, final String mobile) {
        return new Phone(country, areaCode, phone, mobile);
    }

    public String getCountry() {
        return country;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone1 = (Phone) o;
        return Objects.equals(country, phone1.country) &&
                Objects.equals(areaCode, phone1.areaCode) &&
                Objects.equals(phone, phone1.phone) &&
                Objects.equals(mobile, phone1.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, areaCode, phone, mobile);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "country='" + country + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

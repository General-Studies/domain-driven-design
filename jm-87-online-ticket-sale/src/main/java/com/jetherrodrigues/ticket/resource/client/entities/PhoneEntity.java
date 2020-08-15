package com.jetherrodrigues.ticket.resource.client.entities;

import com.jetherrodrigues.ticket.domain.client.entities.Phone;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public final class PhoneEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String country;
    private String areaCode;
    private String phone;
    private String mobile;

    public PhoneEntity(){}

    private PhoneEntity(final String country, final String areaCode, final String phone, final String mobile) {
        this.country = country;
        this.areaCode = areaCode;
        this.phone = phone;
        this.mobile = mobile;
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

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public static PhoneEntity of(final Phone phone) {
        return new PhoneEntity(phone.getCountry(), phone.getAreaCode(), phone.getPhone(), phone.getMobile());
    }

    public Phone toPhone() {
        return Phone.of(this.country, this.areaCode, this.phone, this.mobile);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntity that = (PhoneEntity) o;
        return Objects.equals(country, that.country) &&
                Objects.equals(areaCode, that.areaCode) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(mobile, that.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, areaCode, phone, mobile);
    }
}
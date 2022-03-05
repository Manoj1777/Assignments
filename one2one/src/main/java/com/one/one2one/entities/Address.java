
package com.one.one2one.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long AddressId;
    private String  Street, city, pin;
    public long getAddressId() {
        return AddressId;
    }
    public void setAddressId(long addressId)
   {
        AddressId = addressId;
    }
    public String getStreet() {
        return Street;
    }
    public void setStreet(String street) {
        Street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (AddressId ^ (AddressId >>> 32));
        result = prime * result + ((Street == null) ? 0 : Street.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((pin == null) ? 0 : pin.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (AddressId != other.AddressId)
            return false;
        if (Street == null) {
            if (other.Street != null)
                return false;
        } else if (!Street.equals(other.Street))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (pin == null) {
            if (other.pin != null)
                return false;
        } else if (!pin.equals(other.pin))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Address [AddressId=" + AddressId + ", Street=" + Street + ", city=" + city + ", pin=" + pin + "]";
    }
}

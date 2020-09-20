package net.idt.learning.foo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String street;
    private String house;

    public Address() {
        city = "Zhodino";
        street = "Sovetskaya";
        house = "99";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}

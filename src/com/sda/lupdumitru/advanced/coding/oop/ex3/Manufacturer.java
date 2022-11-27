package com.sda.lupdumitru.advanced.coding.oop.ex3;

import java.util.Objects;

/**
 * Create a Manufacturer class that will contain fields: name, year of establishment, country.
 * Include all necessary methods and constructor parameters. Implement the hashCode() and equals() methods.
 * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 * and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3). Include all necessary methods and constructor parameters.
 * Implement the hashcode() and equals() methods
 */

public class Manufacturer {
    private String name;
    private String country;
    private int yearOfEstablishment;

    public Manufacturer(String name, String country, int yearOfEstablishment) {
        this.name = name;
        this.country = country;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public void setYearOfEstablishment(int yearOfEstablishment) {
        this.yearOfEstablishment = yearOfEstablishment;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", yearOfEstablishment=" + yearOfEstablishment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return yearOfEstablishment == that.yearOfEstablishment && name.equals(that.name) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, yearOfEstablishment);
    }
}

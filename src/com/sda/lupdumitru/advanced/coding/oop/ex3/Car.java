package com.sda.lupdumitru.advanced.coding.oop.ex3;

import java.util.List;
import java.util.Objects;

/**
 *  * Create a Car class that will contain fields: name, model, price, year of manufacture, manufacturer list (Manufacturer),
 *  *p. Include all necessary methods and constructor parameters.
 *  * Implement the hashcode() and equals() methods
 */

public class Car {
    private String name;
    private String Model;
    private double price;
    private int yearOfManufacture;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacture, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        Model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", Model='" + Model + '\'' +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
            //    ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacture == car.yearOfManufacture && Objects.equals(name, car.name) && Objects.equals(Model, car.Model) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Model, price, yearOfManufacture, manufacturers, engineType);
    }
}

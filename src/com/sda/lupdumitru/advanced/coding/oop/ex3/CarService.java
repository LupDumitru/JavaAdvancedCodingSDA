package com.sda.lupdumitru.advanced.coding.oop.ex3;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create a CarService class that will contain a list of cars and implement the following methods:
 * 1. adding cars to the list,
 * 2. removing a car from the list,
 * 3. returning a list of all cars,
 * 4. returning cars with a V12 engine,
 * 5. returning cars produced before 1999,
 * 6. returning the most expensive car,
 * 7. returning the cheapest car,
 * 8. returning the car with at least 3 manufacturers,
 * 9. returning a list of all cars sorted according to the passed parameter: ascending / descending,
 * 10. checking if a specific car is on the list,
 * 11. returning a list of cars manufactured by a specific manufacturer,
 * 12. returning the list of cars manufactured by the manufacturer with the year of establishment <,>, <=,> =, =,! = from the given.
 */
public class CarService {
    private final Set<Car> cars = new HashSet<>(); // final nu inseamna ca nu poate fii populata , asta inseamna ca este obiect final

    public void addCar(Car car) {
        cars.add(car);               //1

    }

    public void addCars(List<Car> cars) {     //1
        this.cars.addAll(cars);

    }

    public void removeCar(Car car) {                //2
        cars.remove(car);
    }

    public List<Car> getAllCars() {


        return new ArrayList<>(cars);            //3 am folosit new ArrayList pentru a proteja continului lui cars (adica sa nu poate fii stearsa, etc)
    }

    public List<Car> getAllCarsWithV12Engine() {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getEngineType() == EngineType.V12) {           //4
                result.add(car);

            }
        }
        return result;
    }

    public List<Car> getAllCarsWithV12EngineWithStream() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)  //4to strean
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsManufacturedBefore1999() {

        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < 1999)  //5
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        Car mostExpensiveCar = null;
        for (Car car : cars) {
            if (mostExpensiveCar == null || car.getPrice() > mostExpensiveCar.getPrice()) {          //6
                mostExpensiveCar = car;

            }
        }
        return mostExpensiveCar;


    }

    public Car getMostExpensiveCarWithStream() {
        return cars.stream()
                .max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))       //6
                .get();
    }

    public Optional<Car> getCheapestCar() {
        return cars.stream()                                                     //7
                .min((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
    }

    public List<Car> getCArWithAtLeast3Manufactures() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)  //8
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarsSortedByPrice(boolean ascending) {

        return cars.stream()
                .sorted((c1, c2) -> {
                    if (ascending) {
                        return Double.compare(c1.getPrice(), c2.getPrice());    //9

                    }
                    return Double.compare(c2.getPrice(), c1.getPrice());
                })
                .collect(Collectors.toList());

    }

    public boolean containsCar(Car car) {       //10
        return cars.contains(car);

    }

    public List<Car> getCarsByManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))       //11
                .collect(Collectors.toList());
    }

    public List<Car> getCarsWhichContainsManufactureWithEstablishmentYear(String operator, int year) {
        return cars.stream()
                .filter(car -> {
                    switch (operator) {
                        case ">":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year);
                        case "<":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year);
                        case ">=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year);
                        case "<=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year);
                        case "=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() == year);
                        case "!=":
                            return car.getManufacturers().stream()
                                    .anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() != year);
                        default:
                            throw new IllegalStateException("Invalid operator " + operator);
                    }


                })
                .collect(Collectors.toList());
    }
    public List<String> getAllModels(){
        return cars.stream()
                .map(car->car.getModel()) // am un stream de modele aici .
                .distinct()           //reduce toate duplicatele
                .collect(Collectors.toList());
    }

}

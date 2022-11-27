package com.sda.lupdumitru.advanced.coding.oop.ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService=new CarService();
        Manufacturer manufacturer1=new Manufacturer("Audi","Germany",1970);
        Manufacturer manufacturer2=new Manufacturer("Audi","Romania",1998);
        Manufacturer manufacturer3=new Manufacturer("Audi","Franta",1978);
        Manufacturer manufacturer4=new Manufacturer("Dodge","U.S.A",1921);
        Manufacturer manufacturer5=new Manufacturer("Dodge","Franta",1979);
        Car car=new Car(
                "A4",
                "Break",
                20000,1998,
                List.of(manufacturer1,manufacturer2,manufacturer3),
                EngineType.V12
        );
        carService.addCar(car);
        Car car2=new Car(
                "Viper",
                "Sport",
                35000,
                2013,
                List.of(manufacturer4,manufacturer5),
                EngineType.V6
        );
        carService.addCar(car2);
        Car car3=new Car(
                "Challanger",
                "Sport",
                40000,
                2017,
                List.of(manufacturer4,manufacturer5),
                EngineType.V6
        );
        carService.addCar(car3);
        System.out.println("All cars in service ");
        System.out.println(carService.getAllCars());
        System.out.println("All cars whit V12 engine in service ");
        System.out.println(carService.getAllCarsWithV12Engine());
        System.out.println("All cars produce before 1999 ");
        System.out.println(carService.getAllCarsManufacturedBefore1999());
        System.out.println("Most expensive car in service");
        System.out.println(carService.getMostExpensiveCar());
        System.out.println("Cheapest car in service");
        System.out.println(carService.getCheapestCar());
        System.out.println(" Car whit 3 manufacturers in service");
        System.out.println(carService.getCArWithAtLeast3Manufactures());
        System.out.println("All cars sorted ascending by price");
        System.out.println(carService.getAllCarsSortedByPrice(true));
        System.out.println("All cars sorted descending by price");
        System.out.println(carService.getAllCarsSortedByPrice(false));
        Car car4=new Car(
                "A4",
                "Break",
                20000,1998,
                List.of(manufacturer1,manufacturer2,manufacturer3),
                EngineType.V12
        );
        System.out.println("Check if the car is in the service");
        System.out.println(carService.containsCar(car4));
        Manufacturer manufacturer6=new Manufacturer("Audi","Germany",1970);
        System.out.println("All cars by manufactured ");
        System.out.println(carService.getCarsByManufacturer(manufacturer6));
        System.out.println("All cars by manufacturer with year of establishment >");
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear(">",1999));
        System.out.println("All cars by manufacturer with year of establishment <");
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear("<",1999));
        System.out.println("All cars by manufacturer with year of establishment >=");
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear(">=",1999));
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear("abc",1999));
    }

}

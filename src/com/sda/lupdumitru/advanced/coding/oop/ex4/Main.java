package com.sda.lupdumitru.advanced.coding.oop.ex4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Price for Ferrari : " +Car.FERRARI.getPrice());
        System.out.println("Power for Ferrari : " +Car.FERRARI.getPower());
        System.out.println("Check if Ferrari is regular : " +Car.FERRARI.isRegular());
        System.out.println("Check if Ferrari is premium : " +Car.FERRARI.isPremium());
        System.out.println("Check if Ferrari is faster than BMW" + Car.FERRARI.isFasterThat(Car.BMW));

    }
}

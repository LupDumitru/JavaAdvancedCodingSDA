package com.sda.lupdumitru.advanced.coding.oop.ex5;

public abstract class Shape3D extends Shape implements Fillable{
    public abstract double calculateVolume();

    @Override
    public void fill(double water) {
        double volume=calculateVolume();
        if(volume>water){
            System.out.println("not pouring enough water");
        } else if (volume==water) {
            System.out.println("fill the figure with water to the brim");

        }else {
            System.out.println(" will pour too much water into the figure and overflow");
        }
    }
}

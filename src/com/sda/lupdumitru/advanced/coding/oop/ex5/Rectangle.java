package com.sda.lupdumitru.advanced.coding.oop.ex5;

public class Rectangle extends Shape {
    private double length;
    private  double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+width);
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

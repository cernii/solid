package com.solid;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return  radius;
    }

    @Override public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

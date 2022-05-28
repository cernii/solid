package com.solid;

public class Square implements Shape {

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override public double area() {
        return Math.pow(getLength(), 2);
    }
}

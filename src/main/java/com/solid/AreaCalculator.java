package com.solid;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {

    @Override public double sum(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }

}

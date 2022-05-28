package com.solid;

import java.util.List;

import static java.lang.String.format;

public class ShapesPrinter {

    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return format("{shapesSum: %s}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return format("shapes_sum,%s", areaCalculator.sum(shapes));
    }

}

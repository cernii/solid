package com.solid;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        Square square = new Square(10);
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);

        List<Shape> shapes = List.of(
                circle,
                cube,
                rectangle,
                square);

        log.info(printer.json(shapes));
        log.info(printer.csv(shapes));
    }

}

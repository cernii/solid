package com.solid;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CircleTests {

    @Test
    void givenRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = new Circle(1d).area();
        double expectedArea = 3.141592653589793;
        assertEquals(expectedArea, actualArea);
    }

    @Test
    void givenDoubleRadius_whenCalculateArea_thenReturnArea() {
        double actualArea = new Circle(2d).area();
        double expectedArea = 3.141592653589793 * 2 * 2;
        assertEquals(expectedArea, actualArea);
    }

}

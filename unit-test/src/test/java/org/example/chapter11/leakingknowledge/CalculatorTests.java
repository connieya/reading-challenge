package org.example.chapter11.leakingknowledge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    @DisplayName("알고리즘 구현 유출")
    public void adding_two_numbers() {
        int value1 = 1;
        int value2 = 3;
        int expected = value1 + value2; // <- 유출

        int actual = Calculator.add(value1, value2);

        assertEquals(expected, actual);
    }
}
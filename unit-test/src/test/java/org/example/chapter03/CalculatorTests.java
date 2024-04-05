package org.example.chapter03;

import org.example.chapter03.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
    void sumOfTwoNumbersOne() {
        // given
        double first = 10;
        double second = 20;
        Calculator calculator = new Calculator();

        // when
        double result = calculator.sum(first, second);

        // then
        assertEquals(30,result);
    }

}

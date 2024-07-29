package springbook.user.ch15.ch3_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.main.java.org.example.ch3_5.Calculator;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class CalcSumTest {

    @Test
    void sumOfNumbers() throws IOException {
        // given
        Calculator calculator = new Calculator();

        // when
        int sum = calculator.calcSum(getClass().getResource("numbers.txt").getPath());

        // then
        Assertions.assertEquals(sum,10);
    }

}

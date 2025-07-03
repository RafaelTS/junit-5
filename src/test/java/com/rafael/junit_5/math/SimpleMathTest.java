package com.rafael.junit_5.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {

    private double number = 9;
    private double firstNumber = 6.2D;
    private double secondNumber = 2D;

    SimpleMath simpleMath = new SimpleMath();

    @Test
    void testSum(){
        Double actual = simpleMath.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSubs(){
        Double actual = simpleMath.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testMults(){
        Double actual = simpleMath.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testDivision(){
        Double actual = simpleMath.division(firstNumber, secondNumber);
        double expected = 3.1D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void testMean(){
        Double actual = simpleMath.division(firstNumber, secondNumber);
        double expected = 3.1D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    void test(){
        Double actual = simpleMath.squareRoot(number);
        double expected = 3D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

}

package com.rafael.junit_5.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeteadTest {

    private double firstNumber = 6.2D;
    private double numberZero = 0D;
    SimpleMath simpleMath = new SimpleMath();

    @DisplayName("Test Division by 0")
    @RepeatedTest(3)
    void testDividedByZero() {
        // arrange
        var expectedMessage = "Impossible to divide by 0";

        // act
        ArithmeticException actual = Assertions.assertThrows(ArithmeticException.class, () -> {
            simpleMath.division(firstNumber, numberZero);
        }, () -> "Division by zero should throw an ArithmeticException");

        // assert
        Assertions.assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");

    }
}

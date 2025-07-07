package com.rafael.junit_5.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class SimpleMathTest {

    private double number = 9;
    private double firstNumber = 6.2D;
    private double secondNumber = 2D;
    private double numberZero = 0D;

    SimpleMath simpleMath = new SimpleMath();

    @Test
    @DisplayName("Test A + B = AB")
    void testSum(){
        Double actual = simpleMath.sum(firstNumber, secondNumber);
        double expected = 8.2D;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test A - B = C")
    void testSubs(){
        Double actual = simpleMath.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Test A * B = C")
    void testMults(){
        Double actual = simpleMath.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Divison A by B should return a/b")
    void testDivision(){
        Double actual = simpleMath.division(firstNumber, secondNumber);
        double expected = 3.1D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Divison A by B should return a/b")
    void testMean(){
        Double actual = simpleMath.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @Test
    @DisplayName("Should Return SquareRoot From 9")
    void test(){
        Double actual = simpleMath.squareRoot(number);
        double expected = 3D;

        Assertions.assertEquals(expected, actual);
        Assertions.assertNotNull(actual);
    }

    @DisplayName("Test Division by 0")
    @Test
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

    @DisplayName("Parameterized Example")
    @ParameterizedTest
    @MethodSource("testDivisionInputParameters")
    void testDivisionParameterized(double firstNumber, double secondNumber, double expected) {
        // arrange
        Double actual = simpleMath.division(firstNumber, secondNumber);

        // act // assert
        Assertions.assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!" );
    }

    public static Stream<Arguments> testDivisionInputParameters() {
        return Stream.of(
                Arguments.of(6.2D, 2D, 3.1D),
                Arguments.of(71D, 14D, 5.07D),
                Arguments.of(18.3D, 3.1D, 5.90D)
        );
    }

}

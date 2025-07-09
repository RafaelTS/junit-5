package com.rafael.junit_5.others;

import com.rafael.junit_5.math.SimpleMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;


public class ParametizedTest {
    SimpleMath simpleMath = new SimpleMath();

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

    @DisplayName("Parameterized Example With CSV Source")
    @ParameterizedTest
    @CsvSource({
            "6.2, 2, 3.1",
            "71, 14, 5.07",
            "18.3, 3.1, 5.90"
    })
    void testDivisionParameterizedWithCSVSource(double firstNumber, double secondNumber, double expected) {
        // arrange
        Double actual = simpleMath.division(firstNumber, secondNumber);

        // act // assert
        Assertions.assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!" );
    }

    @DisplayName("Parameterized Example With CSV File")
    @ParameterizedTest
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivisionParameterizedWithCSVFile(double firstNumber, double secondNumber, double expected) {
        // arrange
        Double actual = simpleMath.division(firstNumber, secondNumber);

        // act // assert
        Assertions.assertEquals(expected, actual, 2D, () -> firstNumber + "/" + secondNumber +
                " did not produce " + expected + "!" );
    }

    @ParameterizedTest
    @ValueSource(strings = {"Joseph", "Matheus", "Peter"})
    void testValueSource(String firstName) {
        System.out.println(firstName);
        Assertions.assertNotNull(firstName);
    }

}

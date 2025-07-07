package com.rafael.junit_5.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ArrayCompareTest {
    
    @Test
    void testCompareArray() {
        // arrange
        int[] array = {25,8,21,32,3};
        int[] expectedArray = {3,8,21,25,32};

        // act
        Arrays.sort(array);

        // assert
        Assertions.assertArrayEquals(array, expectedArray);
    }

    @DisplayName("Performance test example")
    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance() {
        // arrange
        int[] array = {25,8,21,32,3};
        for (int i = 0; i < 100000; i++) {
            array[0] = i;
            Arrays.sort(array);
        }
    }
}

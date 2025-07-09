package com.rafael.junit_5.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Success Should return a Person Object")
    @Test
    void testCreatPersonWhenSucessReturnPersonObject() {
        // arrange
        IPersonService service = new PersonService();
        // act
        // assert
    }
}

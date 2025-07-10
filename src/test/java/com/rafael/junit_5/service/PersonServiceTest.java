package com.rafael.junit_5.service;

import com.rafael.junit_5.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Success Should return a Person Object")
    @Test
    void testCreatPersonWhenSucessReturnPersonObject() {
        // arrange
        IPersonService service = new PersonService();

        Person person = new Person("Rafael", "Teixeira", "Street Teixeira, 100", "rafael@gmail.com");
        // act
        Person actual = service.createPerson(person);
        // assert

        assertNotNull(actual, () -> "createPerson should not have returned null!");
    }

    @DisplayName("When Create a Person Should Contains First Name in returned Person Object")
    @Test
    void testCreatPersonWhenSucessShoulContainsFirstNameInReturnedPersonObject() {
        // arrange
        IPersonService service = new PersonService();

        Person person = new Person("Rafael", "Teixeira", "Street Teixeira, 100", "rafael@gmail.com");
        // act
        Person actual = service.createPerson(person);
        // assert

        assertNotNull(actual, () -> "createPerson should not have returned null!");
        assertEquals(person.getFirtsName(), actual.getFirtsName(), () -> "createPerson should not have returned null!");
    }
}

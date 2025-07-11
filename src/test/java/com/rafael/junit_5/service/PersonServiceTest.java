package com.rafael.junit_5.service;

import com.rafael.junit_5.model.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    IPersonService service;
    Person person;

    @BeforeEach
    void setup() {
        service = new PersonService();
        person = new Person("Rafael", "Teixeira", "Street Teixeira, 100", "rafael@gmail.com");
    }

    @DisplayName("When Create a Person with Success Should return a Person Object")
    @Test
    void testCreatPersonWhenSucessReturnPersonObject() {
        // arrange
        // act
        Person actual = service.createPerson(person);
        // assert

        assertNotNull(actual, () -> "createPerson should not have returned null!");
    }

    @DisplayName("When Create a Person Should Contains First Name in returned Person Object")
    @Test
    void testCreatPersonWhenSucessShoulContainsFirstNameInReturnedPersonObject() {
        // arrange
        // act
        Person actual = service.createPerson(person);
        // assert

        assertNotNull(actual, () -> "createPerson should not have returned null!");
        assertEquals(person.getFirtsName(), actual.getFirtsName(), () -> "createPerson should not returned First Name null or different!");
        assertEquals(person.getLastName(), actual.getLastName(), () -> "createPerson should not returned Last Name null or different!");
        assertEquals(person.getAddress(), actual.getAddress(), () -> "createPerson should not returned address null or different!");
        assertEquals(person.getEmail(), actual.getEmail(), () -> "createPerson should not returned email different!");
    }

    @DisplayName("When Create a Person with null e-mail should throw Exception")
    @Test
    void testCreatPersonWithNullEmailShouldThrowException()  {
        // arrange
        person.setEmail(null);

        var expectedMessage = "The person email is null or empty";
        // act        // assert
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> service.createPerson(person),
                () -> "Empty email should return an exception");

        assertEquals(expectedMessage, exception.getMessage());

    }
}

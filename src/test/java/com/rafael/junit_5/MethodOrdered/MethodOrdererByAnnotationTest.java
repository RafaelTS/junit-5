package com.rafael.junit_5.MethodOrdered;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrdererByAnnotationTest {

    //Sometimes used in integration tests

    @Test
    @Order(1)
    void testD() {
        System.out.println("Runing test D");
    }

    @Test
    @Order(3)
    void testE() {
        System.out.println("Runing test E");
    }

    @Test
    @Order(2)
    void testF() {
        System.out.println("Runing test F");
    }
}

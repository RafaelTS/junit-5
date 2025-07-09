package com.rafael.junit_5.MethodOrdered;


import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(1)
@TestMethodOrder(MethodOrderer.Random.class)
public class RandomMethodOrderedTest {

    /*other kinds of Ordered:
    Name  is the patter;
    * */

    @Test
    void testA() {
        System.out.println("Runing test A");
    }

    @Test
    void testB() {
        System.out.println("Runing test b");
    }

    @Test
    void testC() {
        System.out.println("Runing test C");
    }

}

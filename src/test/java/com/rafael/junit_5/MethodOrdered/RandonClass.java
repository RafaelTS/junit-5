package com.rafael.junit_5.MethodOrdered;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RandonClass {

    @Test
    public void RandomTest() {
        System.out.println("This class is here just to set a order in class test");
    }
}

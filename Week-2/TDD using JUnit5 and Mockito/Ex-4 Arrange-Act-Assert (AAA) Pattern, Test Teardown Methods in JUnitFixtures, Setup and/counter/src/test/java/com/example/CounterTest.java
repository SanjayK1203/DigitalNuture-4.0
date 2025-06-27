package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CounterTest {

    private Counter counter;

    @Before
    public void setUp() {
        counter = new Counter(); 
        System.out.println("Setup: Counter initialized");
    }

    @After
    public void tearDown() {
        counter.reset(); 
        System.out.println("Teardown: Counter reset");
    }

    @Test
    public void testIncrement() {

        counter.increment();
        
        assertEquals(1, counter.getValue());
    }

    @Test
    public void testDecrement() {

        counter.increment(); // count = 1
        counter.decrement(); // count = 0

        assertEquals(0, counter.getValue());
    }

    @Test
    public void testMultipleIncrements() {

        counter.increment();
        counter.increment();
        counter.increment();
        
        assertEquals(3, counter.getValue());
    }
}
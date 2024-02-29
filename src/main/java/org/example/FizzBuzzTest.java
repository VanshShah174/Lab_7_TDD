package org.example;

import org.junit.jupiter.api.Test;

import static org.example.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertEquals("Fizz", fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz(9));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz(10));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz(30));
    }

    @Test
    public void testNumber() {
        assertEquals("1", fizzBuzz(1));
        assertEquals("7", fizzBuzz(7));
    }

}

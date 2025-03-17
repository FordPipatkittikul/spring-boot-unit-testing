package com.section2.TDD;

import com.section2.TDD.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    // If number is divisible by 3, return Fizz.
    // If number is divisible by 3, return Buzz.
    // If number is divisible by 3 and 5, return FizzBuzz.
    // If number is NOT divisible by 3 or 5, return the number.

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12, 18})
    @DisplayName("Is divisible by three")
    void testIsDivisibleByThree(int number){
        String expected = "Fizz";

        String actual = fizzBuzz.compute(number);

        assertEquals(expected, actual, "Should return Fizz");

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    @DisplayName("Is divisible by five")
    void testIsDivisibleByFive(int number){
        String expected = "Buzz";

        String actual = fizzBuzz.compute(number);

        assertEquals(expected, actual, "Should return Buzz");

    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    @DisplayName("Is divisible by three and five")
    void testIsDivisibleByThreeAndFive(int number){
        String expected = "FizzBuzz";

        String actual = fizzBuzz.compute(number);

        assertEquals(expected, actual, "Should return FizzBuzz");

    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 4})
    @DisplayName("Is not divisible by three or five")
    void testIsNotDivisibleByThreeOrFive(int number){
        String expected = "1";

        String actual = fizzBuzz.compute(1);

        assertEquals(expected, actual, "Should return 1");

    }
}

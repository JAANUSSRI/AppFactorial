package com.SoftwareEngineering.AppFactorial.service;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorialCalculatorRecursive {

    private final FactorialCalculator factorialCalculator;

    TestFactorialCalculatorRecursive(){
        factorialCalculator = new FactorialCalculatorRecursive();
    }

    @Test
    void testCalculateRecursive() {
        assertEquals(120, factorialCalculator.calculateRecursive(5));
        assertEquals(720, factorialCalculator.calculateRecursive(6));
        // Add more test cases as needed
    }

    @Test
    void testCalculateFactorials() {
        List<Integer> numbers = List.of(5, 6, 7);
        Map<String, Integer> mapFactorialResults = factorialCalculator.calculateFactorials(numbers);

        assertEquals(120, mapFactorialResults.get("5"));
        assertEquals(720, mapFactorialResults.get("6"));
        assertEquals(5040, mapFactorialResults.get("7"));
        // Add more test cases as needed
    }
}

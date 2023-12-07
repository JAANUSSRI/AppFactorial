package com.SoftwareEngineering.AppFactorial.service;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFactorialCalculatorIterative {

    private final FactorialCalculator factorialCalculator;

    TestFactorialCalculatorIterative() {
        factorialCalculator = new FactorialCalculatorIterative();
    }

    @Test
    void testCalculateIterative() {
        assertEquals(120, factorialCalculator.calculateIterative(5));
        assertEquals(720, factorialCalculator.calculateIterative(6));
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

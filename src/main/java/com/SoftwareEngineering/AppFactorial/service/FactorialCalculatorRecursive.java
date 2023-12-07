package com.SoftwareEngineering.AppFactorial.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FactorialCalculatorRecursive implements FactorialCalculator {
    @Override
    public int calculateIterative(int n) {
        return 0;
    }

    @Override
    public int calculateRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateRecursive(n - 1);
        }
    }

    @Override
    public Map<String, Integer> calculateFactorials(List<Integer> numbers) {
        Map<String, Integer> mapFactorialResults = new HashMap<>();
        for (Integer number : numbers) {
            mapFactorialResults.put(Integer.toString(number), calculateRecursive(number));
        }
        return mapFactorialResults;
    }
}
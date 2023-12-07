package com.SoftwareEngineering.AppFactorial.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FactorialCalculatorIterative implements FactorialCalculator {
    @Override
    public int calculateIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
/*
    @Override
    public int calculateRecursive(int n) {
        return 0;
    }

 */
    @Override
    public Map<String, Integer> calculateFactorials(List<Integer> numbers) {
        Map<String, Integer> mapFactorialResults = new HashMap<>();
        for (Integer number : numbers) {
            mapFactorialResults.put(Integer.toString(number), calculateIterative(number));
        }
        return mapFactorialResults;
    }
}
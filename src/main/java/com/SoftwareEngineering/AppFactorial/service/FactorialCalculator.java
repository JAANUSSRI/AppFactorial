package com.SoftwareEngineering.AppFactorial.service;

import java.util.List;
import java.util.Map;

public interface FactorialCalculator {
    int calculateIterative(int n);
    int calculateRecursive(int n);

    Map<String, Integer> calculateFactorials(List<Integer> numbers);
}

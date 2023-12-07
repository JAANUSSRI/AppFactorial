package com.SoftwareEngineering.AppFactorial.controller;

import com.SoftwareEngineering.AppFactorial.service.FactorialCalculatorIterative;
import com.SoftwareEngineering.AppFactorial.service.FactorialCalculatorRecursive;
import com.SoftwareEngineering.AppFactorial.service.HtmlTableFormatterImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FactorialController {
    @Autowired
    private HtmlTableFormatterImpl htmlTableFormatter;


    @GetMapping("/factorial")
    public String hello(@RequestParam(value = "numbers", defaultValue = "5,10") String numbers) {
        return performFactorialCalculateAndReturnHtmlOutput(numbers);
    }

    String performFactorialCalculateAndReturnHtmlOutput(String numbers){
        List<String> tableHeader = new ArrayList<>();
        tableHeader.add("Number");
        tableHeader.add("Iterative Factorial");
        tableHeader.add("Recursive Factorial");

        List<List<String>> tableBody = new ArrayList<>();
        FactorialCalculatorIterative IterativeCalculator = new FactorialCalculatorIterative();
        FactorialCalculatorRecursive RecursiveCalculator = new FactorialCalculatorRecursive();

        for (String number: numbers.split(",")){
            List<String> row = new ArrayList<>();
            int num = Integer.parseInt(number);

            row.add(Integer.toString(num));
            row.add(Integer.toString(IterativeCalculator.calculateIterative(num)));
            row.add(Integer.toString(RecursiveCalculator.calculateRecursive(num)));
            tableBody.add(row);
        }

        return htmlTableFormatter.getHtmlOutput("Factorial Calculation", tableHeader, tableBody);
    }
}

package com.SoftwareEngineering.AppFactorial.service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestHtmlTableFormatterImpl {

    @Test
    void testsimpleHtmlTableOutput(){
        List<String> header = new ArrayList<>();

        header.add("Number");
        header.add("Iterative Factorial");
        //header.add("Recursive Factorial");

        List<List<String>> body = new ArrayList<>();

        // Assuming you have results from factorial calculations
        FactorialCalculator factorialCalculator = new FactorialCalculatorIterative(); // or use Recursive implementation
        List<Integer> numbers = List.of(5, 6, 7);
        Map<String, Integer> factorialResults = factorialCalculator.calculateFactorials(numbers);

        for (int num : numbers) {
            List<String> row = new ArrayList<>();
            row.add(Integer.toString(num));
            row.add(Integer.toString(factorialResults.get(Integer.toString(num))));
            body.add(row);
        }

        HtmlTableFormatter htmlTableFormatter = new HtmlTableFormatterImpl();
        String htmlOutput = htmlTableFormatter.getHtmlOutput("Factorial Results",header, body);
        System.out.println(htmlOutput);

        assertTrue(htmlOutput.contains("<table "));
        assertTrue(htmlOutput.contains("<th>Iterative Factorial</th>"));
        assertTrue(htmlOutput.contains("<td>" + factorialResults.get("5") + "</td>"));
        assertTrue(htmlOutput.contains("</table>"));
    }
}
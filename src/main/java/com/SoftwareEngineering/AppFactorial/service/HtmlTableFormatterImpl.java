package com.SoftwareEngineering.AppFactorial.service;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HtmlTableFormatterImpl implements HtmlTableFormatter{
    @Override
    public String getHtmlOutput(String title, List<String> header, List<List<String>> body) {
        String htmlOutput = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table, th, td {\n" +
                "  border: 1px solid black;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body> <h2>" + title  + "</h2>";
        htmlOutput += "<table style=\"width:50%\">";
        //form header
        htmlOutput += "<tr>";
        for (String colHeader: header){
            htmlOutput += "<th>" + colHeader + "</th>";
        }
        htmlOutput += "</tr>";
        //form body
        for (List<String> row: body) {
            htmlOutput += "<tr>";
            for (String data : row) {
                htmlOutput += "<td>" + data + "</td>";
            }
            htmlOutput += "</tr>";
        }
        htmlOutput += "</table>";
        htmlOutput += "</body>\n" +
                "</html>";
        return htmlOutput;
    }
}

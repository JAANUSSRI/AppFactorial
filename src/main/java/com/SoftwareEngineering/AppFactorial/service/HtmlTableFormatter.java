package com.SoftwareEngineering.AppFactorial.service;

import java.util.List;

public interface HtmlTableFormatter {
    String getHtmlOutput(String title, List<String> header, List<List<String>> body);
}

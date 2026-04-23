package com.devshare.features.java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

/**
 * Java 11: First "modern Java" baseline after modular era.
 */
public class Java11Features {

    /**
     * Legacy way: Using old HttpURLConnection and manual string processing.
     */
    public void demonstrateLegacyWay() {
        // String blank check before Java 11
        String text = "   ";
        boolean isBlank = text == null || text.trim().isEmpty();
        System.out.println("Was blank (legacy): " + isBlank);
    }

    /**
     * Java 11 way: New HTTP Client, String methods, and Var in Lambdas.
     */
    public void demonstrateModernWay() throws Exception {
        // New String methods: isBlank, lines, strip
        String multiLine = "  Java \n 11 \n Features  ";
        var lines = multiLine.lines()
                .map(String::strip)
                .collect(Collectors.toList());
        System.out.println("Stripped lines: " + lines);

        // Standard HTTP Client (replacing HttpURLConnection)
        try (HttpClient client = HttpClient.newHttpClient()) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.google.com"))
                    .build();
            
            // var keyword
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("HTTP Status: " + response.statusCode());
        }

        // Var in lambda parameters (allows annotations)
        java.util.function.BinaryOperator<String> concat = (var s1, var s2) -> s1 + s2;
        System.out.println("Lambda with var: " + concat.apply("Java", "11"));
    }
}

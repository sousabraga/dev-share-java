package com.devshare.features.java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Java 8: The foundation of modern Java.
 */
public class Java8Features {

    /**
     * Legacy way: Manual loops, Calendar API, and null checks.
     */
    public void demonstrateLegacyWay() {
        List<String> names = Arrays.asList("Java", "Spring", "Maven");
        
        // Manual filtering and transformation
        for (String name : names) {
            if (name != null && name.startsWith("J")) {
                System.out.println(name.toUpperCase());
            }
        }

        // Old Date API (Simplified representation)
        // java.util.Date and java.util.Calendar were mutable and complex
        System.out.println("Legacy Date: " + new java.util.Date());
    }

    /**
     * Java 8 way: Lambdas, Streams, Optional, and New Date API.
     */
    public void demonstrateModernWay() {
        List<String> names = Arrays.asList("Java", "Spring", "Maven", null);

        // Streams & Lambdas & Optional
        List<String> filtered = names.stream()
                .filter(name -> Optional.ofNullable(name).isPresent())
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Modern Filtered: " + filtered);

        // New Date & Time API (java.time) - Immutable and Thread-safe
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Modern Date: " + now.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}

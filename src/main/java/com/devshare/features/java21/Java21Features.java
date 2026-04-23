package com.devshare.features.java21;

import java.util.LinkedHashSet;
import java.util.SequencedCollection;
import java.util.concurrent.Executors;

/**
 * Java 21: Huge leap in scalable concurrency and cleaner pattern matching.
 */
public class Java21Features {

    public record Point(int x, int y) {}

    /**
     * Legacy way: Platform threads and manual collection handling.
     */
    public void demonstrateLegacyWay() {
        // Hard to get last element from a Set
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("First");
        set.add("Last");
        String last = null;
        for (String s : set) { last = s; }
        System.out.println("Last element (legacy): " + last);
    }

    /**
     * Java 21 way: Virtual Threads, Sequenced Collections, and Record Patterns.
     */
    public void demonstrateModernWay() {
        // Sequenced Collections
        SequencedCollection<String> list = new java.util.ArrayList<>();
        list.addFirst("First");
        list.addLast("Last");
        System.out.println("Last element (modern): " + list.getLast());

        // Virtual Threads (Project Loom)
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            executor.submit(() -> System.out.println("Running on virtual thread: " + Thread.currentThread()));
        }

        // Pattern Matching for switch and Record Patterns
        Object obj = new Point(10, 20);
        String result = switch (obj) {
            case Point(int x, int y) -> "Point at " + x + ", " + y;
            case String s -> "String: " + s;
            default -> "Unknown";
        };
        System.out.println("Switch pattern: " + result);
    }
}

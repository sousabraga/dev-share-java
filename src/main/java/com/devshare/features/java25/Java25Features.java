package com.devshare.features.java25;

/**
 * Java 25: Focus on developer ergonomics and simplification.
 */
public class Java25Features {

    public static class Base {
        protected final String data;
        public Base(String data) {
            this.data = data;
        }
    }

    /**
     * Legacy way: super() must be the very first statement.
     */
    public static class LegacyChild extends Base {
        public LegacyChild(String input) {
            // Cannot perform complex validation or logging before super
            super(input == null ? "DEFAULT" : input.toUpperCase());
        }
    }

    /**
     * Java 25 way: Flexible Constructor Bodies and Module Imports.
     * Note: Module imports (import module java.base) are a compiler-level feature.
     */
    public static class ModernChild extends Base {
        public ModernChild(String input) {
            // New in Java 22 (Preview) / Java 25 (LTS candidate): Statements before super()
            if (input == null || input.isBlank()) {
                System.out.println("Warning: Input is empty, using default.");
                input = "MODERN_DEFAULT";
            }
            String processed = "DATA_" + input.toUpperCase();
            
            super(processed); // Now super can be called after initial logic
            
            System.out.println("Child initialized with: " + this.data);
        }
    }

    public void demonstrateModernWay() {
        new ModernChild("java 25");
        
        // Primitive Patterns (Pattern matching for primitives - JEP 455)
        Object obj = 42;
        if (obj instanceof int i) {
            System.out.println("It's an int: " + i);
        }
    }
}

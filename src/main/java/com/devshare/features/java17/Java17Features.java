package com.devshare.features.java17;

/**
 * Java 17: Enterprise standard with safer modeling and less boilerplate.
 */
public class Java17Features {

    // Sealed Classes - Restricted hierarchies
    public sealed interface Shape permits Circle, Square {}
    public static final record Circle(double radius) implements Shape {}
    public static final record Square(double side) implements Shape {}

    /**
     * Legacy way: Verbose POJOs and manual casting.
     */
    public void demonstrateLegacyWay(Object obj) {
        // Traditional instanceof and casting
        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println("String length (legacy): " + s.length());
        }
    }

    /**
     * Java 17 way: Records, Pattern Matching, and Sealed Types.
     */
    public void demonstrateModernWay(Object obj) {
        // Pattern Matching for instanceof (Standardized in 16, LTS in 17)
        if (obj instanceof String s) {
            System.out.println("String length (modern): " + s.length());
        }

        // Records (Standardized in 16, LTS in 17)
        Circle circle = new Circle(5.0);
        System.out.println("Record info: " + circle);
        
        // Sealed Classes usage
        Shape shape = new Square(10);
        System.out.println("Sealed shape: " + shape);
    }
}

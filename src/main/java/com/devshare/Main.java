package com.devshare;

import com.devshare.features.java8.Java8Features;
import com.devshare.features.java11.Java11Features;
import com.devshare.features.java17.Java17Features;
import com.devshare.features.java21.Java21Features;
import com.devshare.features.java25.Java25Features;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("🚀 JAVA LTS FEATURES EVOLUTION (8 TO 25)\n");

        System.out.println("--- Java 8 ---");
        Java8Features j8 = new Java8Features();
        j8.demonstrateModernWay();

        System.out.println("\n--- Java 11 ---");
        Java11Features j11 = new Java11Features();
        j11.demonstrateModernWay();

        System.out.println("\n--- Java 17 ---");
        Java17Features j17 = new Java17Features();
        j17.demonstrateModernWay("Hello Java 17");

        System.out.println("\n--- Java 21 ---");
        Java21Features j21 = new Java21Features();
        j21.demonstrateModernWay();

        System.out.println("\n--- Java 25 ---");
        Java25Features j25 = new Java25Features();
        j25.demonstrateModernWay();

        System.out.println("\n✅ All demonstrations completed successfully!");
    }
}

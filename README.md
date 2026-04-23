# Java LTS Features Evolution (8 to 25)

This is a simple Java project designed to synthesize and demonstrate the key features introduced in each **Java Long-Term Support (LTS)** version, from Java 8 to Java 25.

The project highlights the evolution of the Java language by providing side-by-side comparisons between "Legacy" approaches and "Modern" idiomatic implementations.

---

## 🤖 Created with AI
This project was developed through a collaborative process using **Google Gemini** and **OpenAI ChatGPT**, with the goal of providing a clear, concise, and educational overview of Java's modern history.

---

## 🚀 Key Features Covered

### ☕ Java 8 (LTS)
*   **Lambda Expressions:** Functional programming foundation.
*   **Stream API:** Declarative data processing.
*   **Optional<T>:** Better null safety.
*   **Date & Time API:** Thread-safe replacements for `Date` and `Calendar`.

### ☕ Java 11 (LTS)
*   **Standard HTTP Client:** Modern, asynchronous HTTP requests.
*   **Local-Variable Syntax for Lambda:** Using `var` in parameters.
*   **New String & File Methods:** `isBlank`, `strip`, `lines`, etc.

### ☕ Java 17 (LTS)
*   **Records:** Concise data classes to reduce boilerplate.
*   **Sealed Classes:** Restricted class hierarchies for better modeling.
*   **Pattern Matching for instanceof:** Safer and cleaner type checking.

### ☕ Java 21 (LTS)
*   **Virtual Threads (Project Loom):** High-throughput concurrency.
*   **Sequenced Collections:** Unified API for ordered collections.
*   **Record Patterns:** Deconstructing records in pattern matching.
*   **Switch Pattern Matching:** More powerful and readable switch statements.

### ☕ Java 25 (LTS)
*   **Flexible Constructor Bodies:** Executing logic before `super()` or `this()`.
*   **Primitive Patterns:** Pattern matching support for primitive types.
*   **Module Import Declarations:** Simplified import management.

---

## 📂 Project Structure

```text
src/main/java/com/devshare/features/
├── java8/   # Streams, Lambdas, Optional, Date API
├── java11/  # HttpClient, Var in Lambda, String methods
├── java17/  # Records, Sealed Classes, Pattern Matching
├── java21/  # Virtual Threads, Sequenced Collections, Switch Patterns
└── java25/  # Flexible Constructors, Primitive Patterns
```

## 🛠️ Requirements
*   **JDK 25** (or higher)
*   **Maven**

## 🏃 Running the Project
1. Clone the repository.
2. Ensure your `JAVA_HOME` points to JDK 25.
3. Run the following commands:
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.devshare.Main"
```

---
*Developed for educational purposes to showcase Java's continuous improvement.*

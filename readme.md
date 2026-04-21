# Basic Java Programs

This repository contains a collection of fundamental Java programs designed to illustrate core concepts of the Java programming language and Object-Oriented Programming (OOP). Each program serves as a practical example for beginners to understand various aspects of Java development.

## Table of Contents

- [Key Concepts Covered](#key-concepts-covered)
- [How to Run](#how-to-run)

## Key Concepts Covered

The examples in this folder demonstrate a range of topics, including:

### Object-Oriented Programming (OOP)
-   **Classes and Objects:**
    Classes are blueprints for creating objects, defining their properties (attributes) and behaviors (methods).
    Objects are instances of classes, representing real-world entities with specific data and functionality.
    (See: `Objects/StudentMain.java`)

-   **Constructors:**
    Constructors are special methods used to initialize new objects, ensuring they are in a valid state upon creation.
    They have the same name as the class and are called automatically when an object is instantiated.
    (See: `Objects/StudentMain.java`)

-   **Abstraction:**
    Abstraction focuses on showing only essential information and hiding complex implementation details from the user.
    In Java, it's achieved using abstract classes and interfaces, defining what an object does rather than how it does it.
    (See: `Interfaces/ExInterface.java` for an example of abstraction through interfaces)

-   **Interfaces:**
    Interfaces are contracts that define a set of methods a class must implement, enforcing specific behaviors.
    They achieve full abstraction and support multiple inheritance of type, allowing classes to implement multiple contracts.
    (See: `Interfaces/ExInterface.java`)

-   **Polymorphism (Run-time - Method Overriding):**
    Method overriding allows a subclass to provide a specific implementation for a method already defined in its superclass.
    The actual method executed is determined at runtime based on the object's type, enabling dynamic behavior.
    (See: `PolyMorphism/RunTimePoly.java`)

-   **`this` Keyword:**
    The `this` keyword refers to the current instance of the class, distinguishing instance variables from local variables.
    It's commonly used within constructors and methods to access the object's own members.
    (See: `Objects/StudentMain.java`)

### Basic Java Constructs
-   **Functions/Methods:**
    Functions (or methods in Java) are blocks of code that perform a specific task, promoting code reusability and organization.
    They can accept input parameters and return a value, encapsulating logic for modular programming.
    (See: `FunctionsMethods/AddFunction.java`, `FunctionsMethods/Calculator.java`)

-   **User Input:**
    User input involves reading data provided by the user from the console or other input streams.
    In Java, the `Scanner` class is commonly used to parse primitive types and strings from input.
    (See: `FunctionsMethods/AddFunction.java`, `FunctionsMethods/Calculator.java`, `BasicConcepts/InputProgram.java`)

-   **Control Flow:**
    Control flow statements dictate the order in which instructions are executed in a program.
    Examples include conditional statements (`if-else`, `switch`) and looping constructs (`for`, `while`, `do-while`).
    (See: `FunctionsMethods/Calculator.java`, `PatternPrograms/OITriangle.java`)

-   **Error Handling:**
    Error handling is the process of anticipating, detecting, and resolving errors (exceptions) that occur during program execution.
    Java uses `try-catch-finally` blocks to gracefully manage exceptions, preventing program crashes.
    (See: `FunctionsMethods/Calculator.java`)

-   **Garbage Collection:**
    Garbage Collection is Java's automatic memory management process that reclaims memory occupied by objects no longer in use.
    This eliminates the need for manual memory deallocation (like C++ deconstructors), reducing memory leaks and simplifying development.
    (See: `Objects/StudentMain.java`)

## Setting Up Your Development Environment

To effectively work with and run these Java programs, you'll need a Java Development Kit (JDK) and a suitable Integrated Development Environment (IDE) or code editor. Visual Studio Code (VS Code) with the Java Extension Pack is highly recommended.

### 1. Install Java Development Kit (JDK)

The JDK provides the necessary tools to compile and run Java applications. It's recommended to install the latest Long-Term Support (LTS) version.

*   **Download:**
    *   Visit the official Oracle JDK download page: Oracle JDK Downloads
    *   Alternatively, consider open-source distributions like Adoptium (Eclipse Temurin): Adoptium Downloads
*   **Installation:** Follow the installation instructions for your operating system.
*   **Set `JAVA_HOME` (Optional but Recommended):**
    *   Set an environment variable `JAVA_HOME` to the root directory of your JDK installation (e.g., `C:\Program Files\Java\jdk-17`).
    *   Add `%JAVA_HOME%\bin` (Windows) or `$JAVA_HOME/bin` (Linux/macOS) to your system's `PATH` environment variable. This allows you to run `java` and `javac` commands from any directory.
*   **Verify Installation:** Open a terminal or command prompt and run:
    ```bash
    java -version
    javac -version
    ```
    You should see output indicating the installed JDK version.

### 2. Install Visual Studio Code (VS Code)

VS Code is a popular, lightweight, and powerful code editor with excellent Java support.

*   **Download:** Visit the official VS Code website: Visual Studio Code
*   **Installation:** Follow the installation instructions for your operating system.
*   **Install Java Extension Pack:**
    *   Open VS Code.
    *   Go to the Extensions view (Ctrl+Shift+X or Cmd+Shift+X).
    *   Search for "Java Extension Pack" by Microsoft and install it. This pack includes essential extensions for Java development, such as Language Support for Java™ by Red Hat, Debugger for Java, Maven for Java, Project Manager for Java, and Test Runner for Java.

## How to Run

To compile and run any of these Java programs:

1.  **Navigate to the directory:** Open your terminal or command prompt and navigate to the specific folder containing the `.java` file (e.g., `cd BasicJavaPrograms/Objects`).
2.  **Compile:** Use the Java compiler to compile the `.java` file into bytecode. Ensure you are in the root of the `BasicJavaPrograms` directory or provide the full path from the root.
    ```bash
    # From the BasicJavaPrograms root directory
    javac path/to/YourProgramName.java
    # Example:
    # javac Objects/StudentMain.java
    ```
3.  **Run:** Execute the compiled program.
    ```bash
    # From the BasicJavaPrograms root directory
    java YourPackageName.YourProgramName
    # Example:
    # java BasicJavaPrograms.Objects.StudentMain
    ```
    
    Alternatively, if you are already in the specific sub-folder (e.g., `BasicJavaPrograms/Objects`):
    ```bash
    # From the specific sub-folder
    javac YourProgramName.java
    java YourProgramName
    # Example for StudentMain.java:
    # cd BasicJavaPrograms/Objects
    # javac StudentMain.java
    # java StudentMain
    ```

Replace `path/to/YourProgramName.java`, `YourPackageName.YourProgramName`, and `YourProgramName` with the actual relative path, fully qualified class name, and class name respectively. For example, to run `InputProgram.java` after moving it to `BasicConcepts`:
    ```bash
    # From BasicJavaPrograms root
    javac BasicConcepts/InputProgram.java
    java BasicJavaPrograms.BasicConcepts.InputProgram
    
    # Or, from the BasicConcepts folder
    cd BasicConcepts
    javac InputProgram.java
    java InputProgram
    ```
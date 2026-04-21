<div align="center">

![Core Java & OOPS](Core%20Java%20%26%20OOPS.png)

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/VS%20Code-0078D4?style=for-the-badge&logo=visual%20studio%20code&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)

**A comprehensive collection of fundamental Java programs showcasing core concepts and Object-Oriented Programming principles**

</div>

---

## 📖 Quick Navigation

| 🎯 Section | 📝 Description |
|-----------|--------------|
| [📋 Overview](#-overview) | Repository purpose and scope |
| [🔑 Key Concepts](#-key-concepts-covered) | OOP and Java fundamentals |
| [⚙️ Environment Setup](#-setting-up-your-development-environment) | Installation & configuration |
| [▶️ Execution Guide](#-how-to-run) | Compilation & running programs |
| [📁 Directory Structure](#-directory-structure) | Project organization |

---

## 🎯 Overview

This repository contains a **curated collection** of fundamental Java programs meticulously designed to illustrate core concepts of the Java programming language and Object-Oriented Programming (OOP). Each program serves as a **practical, hands-on example** for beginners to understand various aspects of Java development. Whether you're just starting your Java journey or reinforcing fundamental concepts, these programs provide clear, well-documented implementations with real-world applicability.

---

## 🔑 Key Concepts Covered

This comprehensive collection demonstrates a **wide range of topics**, meticulously organized to facilitate progressive learning. Each concept builds upon foundational principles, guiding learners from basic constructs to advanced OOP paradigms.

### 🏛️ Object-Oriented Programming (OOP)

#### 📦 **Classes and Objects**
Classes serve as blueprints for creating objects, defining their properties (attributes) and behaviors (methods). Objects are instances of classes, representing real-world entities with specific data and functionality. This fundamental concept enables developers to model complex systems in an intuitive, reusable manner.
- 📂 **Reference:** [`Objects/StudentMain.java`](Objects/StudentMain.java)

#### 🔧 **Constructors**
Constructors are special methods used to initialize new objects, ensuring they are in a valid state upon creation. They share the same name as the class and are invoked automatically when an object is instantiated, facilitating proper object initialization and state management.
- 📂 **Reference:** [`Objects/StudentMain.java`](Objects/StudentMain.java)

#### 🎭 **Abstraction**
Abstraction focuses on displaying only essential information while concealing complex implementation details from the user. In Java, this is accomplished using abstract classes and interfaces, which define what an object performs rather than how it performs it, promoting maintainability and scalability.
- 📂 **Reference:** [`Interfaces/ExInterface.java`](Interfaces/ExInterface.java)

#### 🔌 **Interfaces**
Interfaces are formal contracts that define a collection of methods a class must implement, enforcing specific behaviors across implementations. They achieve complete abstraction and support multiple inheritance of type, allowing classes to implement multiple contracts simultaneously, thereby promoting flexible and modular design.
- 📂 **Reference:** [`Interfaces/ExInterface.java`](Interfaces/ExInterface.java)

#### 🎪 **Polymorphism (Run-time - Method Overriding)**
Method overriding permits a subclass to furnish a specialized implementation for a method already defined in its superclass. The precise method executed is determined during runtime based on the object's actual type, facilitating dynamic behavior and flexible code architecture.
- 📂 **Reference:** [`PolyMorphism/RunTimePoly.java`](PolyMorphism/RunTimePoly.java)

#### 🎯 **`this` Keyword**
The `this` keyword references the current instance of the class, distinguishing instance variables from local variables with identical names. It's frequently utilized within constructors and methods to access the object's own members, ensuring clarity and preventing naming conflicts.
- 📂 **Reference:** [`Objects/StudentMain.java`](Objects/StudentMain.java)

---

### 💻 Basic Java Constructs

#### ⚡ **Functions/Methods**
Functions (or methods in Java) are logical blocks of code that execute specific tasks, promoting code reusability and organizational clarity. They accept input parameters and return values, encapsulating logic for modular programming and facilitating maintainability across large codebases.
- 📂 **References:** [`FunctionsMethods/AddFunction.java`](FunctionsMethods/AddFunction.java), [`FunctionsMethods/Calculator.java`](FunctionsMethods/Calculator.java)

#### ⌨️ **User Input**
User input involves reading data provided by the user from the console or other input streams. In Java, the `Scanner` class is commonly employed to parse primitive types and strings from input, enabling interactive applications and dynamic runtime behavior.
- 📂 **References:** [`FunctionsMethods/AddFunction.java`](FunctionsMethods/AddFunction.java), [`FunctionsMethods/Calculator.java`](FunctionsMethods/Calculator.java), [`InputProgram.java`](InputProgram.java)

#### 🔀 **Control Flow**
Control flow statements regulate the order and manner in which instructions are executed throughout a program. Examples encompass conditional statements (`if-else`, `switch`) and looping constructs (`for`, `while`, `do-while`), providing developers with precise command over program execution sequences.
- 📂 **References:** [`FunctionsMethods/Calculator.java`](FunctionsMethods/Calculator.java), [`PatternPrograms/OITriangle.java`](PatternPrograms/OITriangle.java)

#### 🛡️ **Error Handling**
Error handling represents the process of anticipating, detecting, and resolving errors (exceptions) that occur during program execution. Java utilizes `try-catch-finally` blocks to gracefully manage exceptions, preventing unexpected program crashes and enabling robust, production-ready applications.
- 📂 **Reference:** [`FunctionsMethods/Calculator.java`](FunctionsMethods/Calculator.java)

#### 🧹 **Garbage Collection**
Garbage Collection constitutes Java's automated memory management mechanism that reclaims memory occupied by objects no longer referenced or in use. This eliminates the necessity for manual memory deallocation (as required in C++ deconstructors), substantially reducing memory leaks and simplifying development workflows.
- 📂 **Reference:** [`Objects/StudentMain.java`](Objects/StudentMain.java)

---

## ⚙️ Setting Up Your Development Environment

To effectively work with and execute these Java programs, you will require a Java Development Kit (JDK) and a suitable Integrated Development Environment (IDE) or sophisticated code editor. **Visual Studio Code (VS Code)** equipped with the **Java Extension Pack** comes highly recommended for an optimal development experience.

### ☕ 1. Install Java Development Kit (JDK)

The JDK provides the essential tools required to compile and execute Java applications. It is advisable to install the latest **Long-Term Support (LTS)** version for production-grade stability.

**📥 Download Instructions:**
- Visit the official **[Oracle JDK Download Page](https://www.oracle.com/java/technologies/downloads/)** for the latest releases
- Alternatively, consider open-source distributions such as **[Adoptium (Eclipse Temurin)](https://adoptium.net/)** for community-driven support

**📋 Installation Steps:**
- Execute the installer and adhere to the platform-specific installation guidelines for your operating system
- Proceed through the installation wizard, accepting default configurations unless customization is necessary

**🌍 Set `JAVA_HOME` (Optional but Highly Recommended):**
- Establish an environment variable `JAVA_HOME` pointing to your JDK installation root directory (e.g., `C:\Program Files\Java\jdk-26`)
- Append `%JAVA_HOME%\bin` (Windows) or `$JAVA_HOME/bin` (Linux/macOS) to your system's `PATH` environment variable
- This modification facilitates executing `java` and `javac` commands from any directory in your terminal

**✅ Verify Installation:**
Open your terminal or command prompt and execute the following commands:
```bash
java -version
javac -version
```
You should observe output indicating your installed JDK version and confirm successful installation.

---

### 💻 2. Install Visual Studio Code (VS Code)

VS Code represents a popular, lightweight, and remarkably powerful code editor featuring exceptional Java support and comprehensive development capabilities.

**📥 Download & Installation:**
- Navigate to the official **[Visual Studio Code Website](https://code.visualstudio.com/)**
- Download the installer appropriate for your operating system
- Execute the installer and adhere to the on-screen instructions for your platform

**🔧 Install Java Extension Pack:**
1. Open VS Code after installation
2. Access the Extensions marketplace (press `Ctrl+Shift+X` on Windows/Linux or `Cmd+Shift+X` on macOS)
3. Search for **"Java Extension Pack"** authored by Microsoft
4. Click **Install** to add the comprehensive package

The Java Extension Pack includes:
- ☑️ Language Support for Java™ (by Red Hat)
- ☑️ Debugger for Java
- ☑️ Maven for Java
- ☑️ Project Manager for Java
- ☑️ Test Runner for Java

---

## ▶️ How to Run

To successfully compile and execute any of these Java programs, adhere to the following systematic procedures:

### 📍 Method 1: From Root Directory (Recommended for Packaged Programs)

This approach is ideal when working with programs that utilize package declarations.

**Step 1️⃣: Navigate to the Directory**
```bash
cd path/to/BasicJavaPrograms
```

**Step 2️⃣: Compile the Java File**
```bash
javac path/to/YourProgramName.java
# Example:
javac Objects/StudentMain.java
```

**Step 3️⃣: Execute the Compiled Program**
```bash
java YourPackageName.YourProgramName
# Example:
java BasicJavaPrograms.Objects.StudentMain
```

---

### 📁 Method 2: From Subdirectory (Simplified Approach)

This method works optimally for standalone programs without package declarations.

**Step 1️⃣: Navigate to the Specific Subdirectory**
```bash
cd path/to/BasicJavaPrograms/DesiredSubfolder
# Example:
cd BasicJavaPrograms/Objects
```

**Step 2️⃣: Compile the Program**
```bash
javac YourProgramName.java
# Example:
javac StudentMain.java
```

**Step 3️⃣: Execute the Program**
```bash
java YourProgramName
# Example:
java StudentMain
```

---

### 💡 Practical Examples

#### 🔸 Example 1: Running InputProgram.java
```bash
# Method 1: From root directory
cd BasicJavaPrograms
javac InputProgram.java
java BasicJavaPrograms.InputProgram

# Method 2: From the program's directory
cd BasicJavaPrograms
javac InputProgram.java
java InputProgram
```

#### 🔸 Example 2: Running StudentInterface.java
```bash
# Method 1: From root directory
cd BasicJavaPrograms
javac Interfaces/StudentInterface.java
java BasicJavaPrograms.Interfaces.StudentInterface

# Method 2: From the Interfaces subdirectory
cd BasicJavaPrograms/Interfaces
javac StudentInterface.java
java StudentInterface
```

---

## 📁 Directory Structure

```
BasicJavaPrograms/
├── 📄 readme.md                          # Documentation (You are here!)
├── ⭐ FirstJavaProgram.java              # Your first Java application
│
├── 📚 Basic Control Structures
│   ├── IfElseConditions.java
│   ├── ElseIfCondition.java
│   ├── SwitchCase.java
│   ├── ForLoop.java
│   ├── WhileLoop.java
│   └── DoWhileLoop.java
│
├── 📊 Input & Output Operations
│   ├── InputProgram.java
│   └── Input_Maths.java
│
├── 🔢 Mathematical Computations
│   └── SumOfNnumbers.java
│   └── TableMultiplication.java
│   └── Variables.java
│
├── 🏗️ Abstraction/                      # Abstract class implementations
│   └── Abstraction.java
│
├── 🔐 AccessSpecifiers/                 # Access modifier demonstrations
│   └── Bank.java
│
├── 🎨 AdvancedPatterns/                 # Complex pattern generation
│   ├── Butterfly.java
│   ├── Diamond.java
│   └── PalindromicPyramid.java
│
├── ⚡ FunctionsMethods/                 # Function and method examples
│   ├── AddFunction.java
│   ├── AgeVerification.java
│   ├── BasicFunction.java
│   ├── Calculator.java
│   ├── Factorial.java
│   ├── Fibonacci.java
│   ├── GCD.java
│   ├── MulFunction.java
│   ├── RadiusCircle.java
│   └── RaisedPower.java
│
├── 👥 Inheritance/                      # Various inheritance types
│   ├── HierarchicalInherit.java
│   ├── HybridInherit.java
│   ├── MultilevelInherit.java
│   ├── SimpleInherit.java
│   └── SingleInherit.java
│
├── 🔌 Interfaces/                       # Interface implementations
│   ├── ExInterface.java
│   └── StudentInterface.java
│
├── 📦 Objects/                          # Object-oriented programming
│   ├── BasicObject.java
│   └── StudentMain.java
│
├── 🎪 PolyMorphism/                     # Polymorphic behavior
│   ├── CompileTimePoly.java
│   └── RunTimePoly.java
│
└── 🌈 PatternPrograms/                  # Pattern generation algorithms
    ├── FloydsPyramid.java
    ├── HalfPyramid.java
    ├── HoleInMatrix.java
    ├── InverseHalfPyramid.java
    ├── InverseNumericPattern.java
    ├── MathsBase.java
    ├── NestedForLoop.java
    ├── NumericPattern.java
    └── OITriangle.java
```

---

## 💡 Tips & Best Practices

### ✨ For Maximum Learning Success

| 💪 Practice | 📝 Description |
|-----------|--------------|
| **📖 Read Comments** | Each program includes detailed comments explaining logic and concepts. Read them thoroughly! |
| **🔄 Experiment** | Modify existing code, change values, and observe outcomes to deepen your understanding |
| **📚 Study Incrementally** | Progress from basic control flow to advanced OOP concepts systematically |
| **⚡ Use Debugging** | Utilize VS Code's debugger to step through code and inspect variable states |
| **💬 Understand Output** | Run programs and analyze their output to confirm your understanding |
| **🎯 Create Variations** | Write modified versions of programs to solve related problems |

### 🚀 Effective Study Approach

1. **Understand the Problem** - Read the program thoroughly before execution
2. **Execute & Observe** - Run the program and study its output carefully
3. **Modify & Experiment** - Change parameters and observe behavioral changes
4. **Trace Execution** - Use the debugger to follow program flow step-by-step
5. **Document Learnings** - Maintain notes on concepts and patterns discovered

---

## ❓ Getting Help

### 🔍 Troubleshooting Common Issues

| ❌ Issue | ✅ Solution |
|---------|----------|
| **"javac: command not found"** | Ensure JDK is installed and `JAVA_HOME/bin` is in your PATH |
| **"Class not found"** | Verify package name matches directory structure and file location |
| **Compilation errors** | Check for syntax mistakes and ensure all braces/parentheses are balanced |
| **No output** | Confirm the program includes `System.out.println()` statements |
| **File not found** | Verify the file path is correct and from the proper working directory |

### 📚 Recommended Resources

- **[Official Java Documentation](https://docs.oracle.com/en/java/)** - Comprehensive Java API reference
- **[Java Tutorials by Oracle](https://docs.oracle.com/javase/tutorial/)** - Structured learning path
- **[VS Code Java Documentation](https://code.visualstudio.com/docs/languages/java)** - IDE-specific guidance
- **[Stack Overflow Java Tag](https://stackoverflow.com/questions/tagged/java)** - Community Q&A platform

---

## 🤝 Contributing & Feedback

### 📝 Ways to Contribute

- ⭐ Star this repository if you found it helpful!
- 🐛 Report bugs or issues you encounter
- 💡 Suggest improvements or additional program examples
- 📚 Improve documentation and add clarifications
- 🔧 Submit optimized or alternative implementations

---

## 📊 Program Statistics

| 📈 Metric | 📌 Count |
|-----------|---------|
| **Total Programs** | 47+ |
| **Core Concepts** | 6 OOP + 5 Basic |
| **Code Examples** | Pattern Programs, Functions, Inheritance, etc. |
| **Learning Paths** | Beginner → Intermediate |
| **Average Complexity** | ⭐⭐⭐ (Moderate) |

---

## 📜 License & Credits

This collection represents a collaborative learning resource designed for educational purposes. Feel free to use, modify, and share these programs for learning and teaching within your educational context.

**Created with ❤️ for Java learners worldwide**

---

## 🎓 Learning Journey

```
Beginner          Intermediate           Advanced OOP
   ↓                  ↓                       ↓
Variables    →    Functions/Methods    →   Inheritance
   ↓                  ↓                       ↓
Loops        →    Control Flow         →   Polymorphism
   ↓                  ↓                       ↓
Conditions   →    User Input           →   Interfaces
   ↓                  ↓                       ↓
Patterns     →    Error Handling       →   Abstraction
```

---

<div align="center">

### 🌟 Happy Coding! 🌟

**Keep Learning, Keep Growing, Keep Coding!**

Made with 💻 and ☕ for the Java Community

</div>
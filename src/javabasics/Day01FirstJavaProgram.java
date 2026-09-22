package javabasics;

/// Day 1 - First Java Program
/// Topic: Core Java Fundamentals - Java Basics
/// Description:
/// This program introduces the basic structure of a Java program,
/// the main() method, Java compilation and execution, packages,
/// imports, and basic features of Java.
/// Topics Covered:
/// - History and features of Java
/// - JVM, JRE, and JDK
/// - Java program structure
/// - Compilation and execution
/// - main() method
/// - Packages and imports
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day01FirstJavaProgram {

    public static void main(String[] args) {

        // ==========================================
        // 1. JAVA PROGRAM STRUCTURE
        // ==========================================

        /*
         * A Java program is commonly organized using:
         * - Package declaration
         * - Import statements
         * - Class declaration
         * - main() method
         * - Statements
         *
         * This file itself demonstrates that structure.
         */

        System.out.println("==========================================");
        System.out.println("       DAY 1 - FIRST JAVA PROGRAM");
        System.out.println("==========================================");

        System.out.println("Java program is running successfully.");


        // ==========================================
        // 2. JAVA HISTORY AND FEATURES
        // ==========================================

        /*
         * Java was originally developed at Sun Microsystems.
         * It was created by a team led by James Gosling.
         *
         * Java was designed with the idea:
         * "Write Once, Run Anywhere."
         *
         * Important Java features include:
         * - Platform independent
         * - Object-oriented
         * - Robust
         * - Secure
         * - Portable
         * - Multithreaded
         * - High performance with JVM optimizations
         */

        System.out.println();
        System.out.println("2. Java History and Features");
        System.out.println("------------------------------------------");

        System.out.println("Java was developed at Sun Microsystems.");
        System.out.println("James Gosling is known as the father of Java.");
        System.out.println("Java is designed to be platform independent.");
        System.out.println("Java supports object-oriented programming.");
        System.out.println("Java programs run using the Java Virtual Machine (JVM).");


        // ==========================================
        // 3. JVM, JRE, AND JDK
        // ==========================================

        /*
         * JDK = Java Development Kit
         * --------------------------------
         * Used by developers to develop Java applications.
         * It contains development tools such as the Java compiler.
         *
         * JRE = Java Runtime Environment
         * --------------------------------
         * Provides the environment required to run Java programs.
         *
         * JVM = Java Virtual Machine
         * --------------------------------
         * Executes Java bytecode.
         *
         * Basic relationship:
         *
         * JDK
         *  |
         *  +-- JRE
         *       |
         *       +-- JVM
         *
         * Source Code (.java)
         *        |
         *        | javac
         *        v
         * Bytecode (.class)
         *        |
         *        | JVM
         *        v
         * Program Execution
         */

        System.out.println();
        System.out.println("3. JVM, JRE, and JDK");
        System.out.println("------------------------------------------");

        System.out.println("JDK: Used to develop Java applications.");
        System.out.println("JRE: Provides the environment to run Java applications.");
        System.out.println("JVM: Executes Java bytecode.");

        System.out.println();
        System.out.println("Java execution flow:");
        System.out.println("Source Code (.java)");
        System.out.println("       |");
        System.out.println("       | javac");
        System.out.println("       v");
        System.out.println("Bytecode (.class)");
        System.out.println("       |");
        System.out.println("       | JVM");
        System.out.println("       v");
        System.out.println("Program Execution");


        // ==========================================
        // 4. COMPILATION AND EXECUTION
        // ==========================================

        /*
         * Java source files normally have the .java extension.
         *
         * Compilation:
         *     javac Day01FirstJavaProgram.java
         *
         * This converts Java source code into bytecode.
         *
         * The compiler creates:
         *     Day01FirstJavaProgram.class
         *
         * Execution:
         *     java javabasics.Day01FirstJavaProgram
         *
         * The JVM loads and executes the bytecode.
         */

        System.out.println();
        System.out.println("4. Compilation and Execution");
        System.out.println("------------------------------------------");

        System.out.println("Java source file extension: .java");
        System.out.println("Java bytecode file extension: .class");

        System.out.println();
        System.out.println("Compilation command:");
        System.out.println("javac Day01FirstJavaProgram.java");

        System.out.println();
        System.out.println("Execution command:");
        System.out.println("java javabasics.Day01FirstJavaProgram");


        // ==========================================
        // 5. main() METHOD
        // ==========================================

        /*
         * The main() method is the entry point of a standard
         * Java application.
         *
         * The JVM starts program execution from:
         *
         * public static void main(String[] args)
         *
         * For today's lesson, we are using the standard form.
         */

        System.out.println();
        System.out.println("5. main() Method");
        System.out.println("------------------------------------------");

        System.out.println("The main() method is the entry point of the program.");
        System.out.println("Program execution starts from main().");

        System.out.println();
        System.out.println("Standard main() method:");
        System.out.println("public static void main(String[] args)");


        // ==========================================
        // 6. PACKAGES
        // ==========================================

        /*
         * A package is used to organize related Java classes.
         *
         * This program belongs to:
         *
         * package javabasics;
         *
         * The package declaration must appear before the class
         * declaration.
         *
         * For this project, we are keeping the beginner Java
         * programs inside the javabasics package.
         */

        System.out.println();
        System.out.println("6. Packages");
        System.out.println("------------------------------------------");

        System.out.println("Current package: javabasics");
        System.out.println("Packages help organize Java classes.");
        System.out.println("Package declaration: package javabasics;");


        // ==========================================
        // 7. IMPORTS
        // ==========================================

        /*
         * An import statement allows us to use classes from
         * another package without writing their fully qualified
         * name every time.
         *
         * Example:
         *
         * import java.util.Scanner;
         *
         * Scanner belongs to the java.util package.
         *
         * This particular program does not require an import,
         * so no import statement is necessary here.
         *
         * This concept is explained here because imports are
         * part of today's Java Basics lesson.
         */

        System.out.println();
        System.out.println("7. Imports");
        System.out.println("------------------------------------------");

        System.out.println("Import statements allow classes from other packages to be used.");
        System.out.println("Example: import java.util.Scanner;");
        System.out.println("No import is required for this program.");


        // ==========================================
        // 8. SIMPLE PROGRAM EXECUTION
        // ==========================================

        /*
         * System.out.println() displays text in the console.
         *
         * We are using it to demonstrate that the Java program
         * has successfully started and executed.
         */

        System.out.println();
        System.out.println("8. Simple Program Execution");
        System.out.println("------------------------------------------");

        System.out.println("Hello, Java!");
        System.out.println("Welcome to Java Backend Development.");
        System.out.println("Day 1 lesson completed successfully.");


        // ==========================================
        // 9. DAY 1 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 1 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Java History and Features");
        System.out.println("2. JVM, JRE, and JDK");
        System.out.println("3. Java Program Structure");
        System.out.println("4. Compilation and Execution");
        System.out.println("5. main() Method");
        System.out.println("6. Packages");
        System.out.println("7. Imports");

        System.out.println();
        System.out.println("Day 1 completed!");
    }
}
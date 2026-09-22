package javabasics;

import java.util.Scanner;

/// Day 4 - Interactive Programming
/// Topic: Scanner Input and Practical Control Flow
/// Description:
/// This program demonstrates interactive Java programming using
/// the Scanner class. User input is processed using conditions,
/// switch statements, loops, break, and continue.
/// Topics Covered:
/// - Scanner class
/// - User input
/// - if statement
/// - if-else statement
/// - if-else-if ladder
/// - switch statement
/// - for loop
/// - while loop
/// - do-while loop
/// - break statement
/// - continue statement
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day04InteractiveProgramming {

    public static void main(String[] args) {

        // 1. Initialize the Scanner first
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("     DAY 4 - INTERACTIVE PROGRAMMING");
        System.out.println("==========================================");


        // ==========================================
        // 1. BASIC USER INPUT
        // ==========================================

        System.out.println();
        System.out.println("1. Basic User Input");
        System.out.println("------------------------------------------");

        // 2. Prompt the user for their name
        System.out.print("Please enter your name: ");

        // 3. Read the name from the console
        String name = sc.nextLine();

        // 4. Prompt the user for their age
        System.out.print("Please enter your age: ");

        // 5. Read the age from the console
        int age = sc.nextInt();

        System.out.println();
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);


        // ==========================================
        // 2. if STATEMENT
        // ==========================================

        System.out.println();
        System.out.println("2. if Statement");
        System.out.println("------------------------------------------");

        if (age >= 18) {
            System.out.println("You are an adult.");
        }


        // ==========================================
        // 3. if-else STATEMENT
        // ==========================================

        System.out.println();
        System.out.println("3. if-else Statement");
        System.out.println("------------------------------------------");

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }


        // ==========================================
        // 4. if-else-if LADDER
        // ==========================================

        System.out.println();
        System.out.println("4. if-else-if Ladder");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for marks
        System.out.print("Please enter your exam marks: ");

        // 2. Read the marks from the console
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


        // ==========================================
        // 5. switch STATEMENT
        // ==========================================

        System.out.println();
        System.out.println("5. switch Statement");
        System.out.println("------------------------------------------");

        System.out.println("Select a programming language:");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. JavaScript");
        System.out.println("4. C++");

        // 1. Prompt the user for their choice
        System.out.print("Please enter your choice: ");

        // 2. Read the choice from the console
        int languageChoice = sc.nextInt();

        switch (languageChoice) {

            case 1:
                System.out.println("You selected Java.");
                break;

            case 2:
                System.out.println("You selected Python.");
                break;

            case 3:
                System.out.println("You selected JavaScript.");
                break;

            case 4:
                System.out.println("You selected C++.");
                break;

            default:
                System.out.println("Invalid choice.");
        }


        // ==========================================
        // 6. for LOOP WITH USER INPUT
        // ==========================================

        System.out.println();
        System.out.println("6. for Loop");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for a number
        System.out.print("Please enter a number: ");

        // 2. Read the number from the console
        int number = sc.nextInt();

        System.out.println("Numbers from 1 to " + number + ":");

        for (int count = 1; count <= number; count++) {
            System.out.println(count);
        }


        // ==========================================
        // 7. MULTIPLICATION TABLE
        // ==========================================

        System.out.println();
        System.out.println("7. Multiplication Table");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for a number
        System.out.print("Please enter a number for its table: ");

        // 2. Read the number from the console
        int tableNumber = sc.nextInt();

        System.out.println();
        System.out.println("Table of " + tableNumber);

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            int result = tableNumber * multiplier;

            System.out.println(
                    tableNumber + " x " + multiplier + " = " + result
            );
        }


        // ==========================================
        // 8. while LOOP WITH USER INPUT
        // ==========================================

        System.out.println();
        System.out.println("8. while Loop");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for the starting number
        System.out.print("Please enter a starting number: ");

        // 2. Read the starting number
        int start = sc.nextInt();

        // 3. Prompt the user for the ending number
        System.out.print("Please enter an ending number: ");

        // 4. Read the ending number
        int end = sc.nextInt();

        System.out.println();
        System.out.println("Counting using while loop:");

        int current = start;

        while (current <= end) {

            System.out.println(current);

            current++;
        }


        // ==========================================
        // 9. do-while INTERACTIVE MENU
        // ==========================================

        System.out.println();
        System.out.println("9. do-while Interactive Menu");
        System.out.println("------------------------------------------");

        int menuChoice;

        do {

            System.out.println();
            System.out.println("========== MENU ==========");
            System.out.println("1. Say Hello");
            System.out.println("2. Show Java Message");
            System.out.println("3. Show Your Name");
            System.out.println("4. Exit");

            // 1. Prompt the user for a menu choice
            System.out.print("Please enter your choice: ");

            // 2. Read the menu choice
            menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:
                    System.out.println("Hello, " + name + "!");
                    break;

                case 2:
                    System.out.println(
                            "Java is a powerful programming language."
                    );
                    break;

                case 3:
                    System.out.println("Your name is " + name + ".");
                    break;

                case 4:
                    System.out.println("Exiting menu...");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
            }

        } while (menuChoice != 4);


        // ==========================================
        // 10. break STATEMENT
        // ==========================================

        System.out.println();
        System.out.println("10. break Statement");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for the stopping number
        System.out.print(
                "Enter a number between 1 and 10 where the loop should stop: "
        );

        // 2. Read the stopping number
        int stopNumber = sc.nextInt();

        for (int count = 1; count <= 10; count++) {

            if (count == stopNumber) {
                System.out.println(
                        "break executed at number " + count
                );
                break;
            }

            System.out.println("Number = " + count);
        }


        // ==========================================
        // 11. continue STATEMENT
        // ==========================================

        System.out.println();
        System.out.println("11. continue Statement");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for the number to skip
        System.out.print(
                "Enter a number between 1 and 10 to skip: "
        );

        // 2. Read the number to skip
        int skipNumber = sc.nextInt();

        System.out.println("Numbers from 1 to 10:");

        for (int count = 1; count <= 10; count++) {

            if (count == skipNumber) {
                continue;
            }

            System.out.println("Number = " + count);
        }

        System.out.println("The selected number was skipped.");


        // ==========================================
        // 12. SIMPLE CALCULATOR
        // ==========================================

        System.out.println();
        System.out.println("12. Simple Calculator");
        System.out.println("------------------------------------------");

        // 1. Prompt the user for the first number
        System.out.print("Please enter the first number: ");

        // 2. Read the first number
        double firstNumber = sc.nextDouble();

        // 3. Prompt the user for the second number
        System.out.print("Please enter the second number: ");

        // 4. Read the second number
        double secondNumber = sc.nextDouble();

        System.out.println();
        System.out.println("Select an operation:");
        System.out.println("+ Addition");
        System.out.println("- Subtraction");
        System.out.println("* Multiplication");
        System.out.println("/ Division");

        // 5. Prompt the user for an operation
        System.out.print("Please enter the operation: ");

        // 6. Read the operation
        String operation = sc.next();

        switch (operation) {

            case "+":
                System.out.println(
                        "Result = " + (firstNumber + secondNumber)
                );
                break;

            case "-":
                System.out.println(
                        "Result = " + (firstNumber - secondNumber)
                );
                break;

            case "*":
                System.out.println(
                        "Result = " + (firstNumber * secondNumber)
                );
                break;

            case "/":

                if (secondNumber != 0) {
                    System.out.println(
                            "Result = " + (firstNumber / secondNumber)
                    );
                } else {
                    System.out.println("Cannot divide by zero.");
                }

                break;

            default:
                System.out.println("Invalid operation.");
        }


        // ==========================================
        // 13. FINAL SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("      INTERACTIVE PROGRAM COMPLETED");
        System.out.println("==========================================");

        System.out.println("User: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        System.out.println();
        System.out.println("Concepts practiced:");
        System.out.println("- Scanner");
        System.out.println("- User input");
        System.out.println("- if");
        System.out.println("- if-else");
        System.out.println("- if-else-if");
        System.out.println("- switch");
        System.out.println("- for loop");
        System.out.println("- while loop");
        System.out.println("- do-while loop");
        System.out.println("- break");
        System.out.println("- continue");

        System.out.println();
        System.out.println("Day 4 Interactive Programming completed!");

        sc.close();
    }
}
package javabasics;

/// Day 4 - Control Flow
/// Topic: Core Java Fundamentals - Control Flow
/// Description:
/// This program demonstrates Java control flow statements used
/// to make decisions, repeat operations, and control the execution
/// of a program.
/// Topics Covered:
/// - if statement
/// - if-else statement
/// - switch statement
/// - for loop
/// - while loop
/// - do-while loop
/// - break statement
/// - continue statement
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day04ControlFlow {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("          DAY 4 - CONTROL FLOW");
        System.out.println("==========================================");


        // ==========================================
        // 1. if STATEMENT
        // ==========================================

        /*
         * The if statement executes a block of code only when
         * its condition is true.
         *
         * Syntax:
         *
         * if (condition) {
         *     // code
         * }
         */

        System.out.println();
        System.out.println("1. if Statement");
        System.out.println("------------------------------------------");

        int age = 25;

        if (age >= 18) {
            System.out.println("The person is an adult.");
        }


        // ==========================================
        // 2. if-else STATEMENT
        // ==========================================

        /*
         * The if-else statement provides two possible paths.
         *
         * If the condition is true, the if block executes.
         * Otherwise, the else block executes.
         */

        System.out.println();
        System.out.println("2. if-else Statement");
        System.out.println("------------------------------------------");

        int marks = 75;

        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }


        // ==========================================
        // 3. if-else-if LADDER
        // ==========================================

        /*
         * Multiple conditions can be checked using an
         * if-else-if ladder.
         *
         * Java checks the conditions from top to bottom.
         * Once a true condition is found, its block executes
         * and the remaining conditions are skipped.
         */

        System.out.println();
        System.out.println("3. if-else-if Ladder");
        System.out.println("------------------------------------------");

        int studentMarks = 82;

        if (studentMarks >= 90) {
            System.out.println("Grade: A+");
        } else if (studentMarks >= 80) {
            System.out.println("Grade: A");
        } else if (studentMarks >= 70) {
            System.out.println("Grade: B");
        } else if (studentMarks >= 60) {
            System.out.println("Grade: C");
        } else if (studentMarks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }


        // ==========================================
        // 4. NESTED if STATEMENT
        // ==========================================

        /*
         * An if statement can be placed inside another if statement.
         *
         * This is called a nested if statement.
         */

        System.out.println();
        System.out.println("4. Nested if Statement");
        System.out.println("------------------------------------------");

        boolean accountActive = true;
        int userAge = 25;

        if (accountActive) {

            System.out.println("Account is active.");

            if (userAge >= 18) {
                System.out.println("User is eligible to access the service.");
            }
        }


        // ==========================================
        // 5. switch STATEMENT
        // ==========================================

        /*
         * switch is useful when one value needs to be compared
         * against multiple possible values.
         *
         * The break statement prevents execution from continuing
         * into the next case.
         *
         * Syntax:
         *
         * switch (value) {
         *     case value1:
         *         // code
         *         break;
         *     case value2:
         *         // code
         *         break;
         *     default:
         *         // code
         * }
         */

        System.out.println();
        System.out.println("5. switch Statement");
        System.out.println("------------------------------------------");

        int dayNumber = 3;

        switch (dayNumber) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number.");
        }


        // ==========================================
        // 6. switch WITH String
        // ==========================================

        /*
         * switch can also be used with String values.
         */

        System.out.println();
        System.out.println("6. switch with String");
        System.out.println("------------------------------------------");

        String programmingLanguage = "Java";

        switch (programmingLanguage) {

            case "Java":
                System.out.println("You selected Java.");
                break;

            case "Python":
                System.out.println("You selected Python.");
                break;

            case "JavaScript":
                System.out.println("You selected JavaScript.");
                break;

            default:
                System.out.println("Unknown programming language.");
        }


        // ==========================================
        // 7. for LOOP
        // ==========================================

        /*
         * A for loop is commonly used when the number of
         * repetitions is known.
         *
         * Syntax:
         *
         * for (initialization; condition; update) {
         *     // code
         * }
         */

        System.out.println();
        System.out.println("7. for Loop");
        System.out.println("------------------------------------------");

        for (int count = 1; count <= 5; count++) {
            System.out.println("Count = " + count);
        }


        // ==========================================
        // 8. for LOOP - PRACTICAL EXAMPLE
        // ==========================================

        /*
         * A for loop can be used to process a sequence of values.
         */

        System.out.println();
        System.out.println("8. for Loop - Practical Example");
        System.out.println("------------------------------------------");

        int total = 0;

        for (int number = 1; number <= 5; number++) {
            total += number;
        }

        System.out.println("Sum of numbers from 1 to 5 = " + total);


        // ==========================================
        // 9. NESTED for LOOP
        // ==========================================

        /*
         * A loop can be placed inside another loop.
         *
         * This is called a nested loop.
         */

        System.out.println();
        System.out.println("9. Nested for Loop");
        System.out.println("------------------------------------------");

        for (int row = 1; row <= 3; row++) {

            for (int column = 1; column <= 3; column++) {
                System.out.println(
                        "Row = " + row + ", Column = " + column
                );
            }
        }


        // ==========================================
        // 10. while LOOP
        // ==========================================

        /*
         * A while loop repeatedly executes code as long as
         * its condition remains true.
         *
         * The condition is checked before each iteration.
         */

        System.out.println();
        System.out.println("10. while Loop");
        System.out.println("------------------------------------------");

        int count = 1;

        while (count <= 5) {
            System.out.println("Count = " + count);
            count++;
        }


        // ==========================================
        // 11. do-while LOOP
        // ==========================================

        /*
         * A do-while loop executes its body at least once.
         *
         * The condition is checked after the loop body executes.
         *
         * Syntax:
         *
         * do {
         *     // code
         * } while (condition);
         */

        System.out.println();
        System.out.println("11. do-while Loop");
        System.out.println("------------------------------------------");

        int number = 1;

        do {
            System.out.println("Number = " + number);
            number++;
        } while (number <= 5);


        // ==========================================
        // 12. do-while EXECUTES AT LEAST ONCE
        // ==========================================

        /*
         * Even when the condition is false initially,
         * a do-while loop executes its body once.
         */

        System.out.println();
        System.out.println("12. do-while Executes at Least Once");
        System.out.println("------------------------------------------");

        int startingNumber = 10;

        do {
            System.out.println(
                    "This statement executes once."
            );
        } while (startingNumber < 5);


        // ==========================================
        // 13. break STATEMENT
        // ==========================================

        /*
         * break immediately terminates the loop.
         *
         * Execution continues with the statement after
         * the loop.
         */

        System.out.println();
        System.out.println("13. break Statement");
        System.out.println("------------------------------------------");

        for (int value = 1; value <= 10; value++) {

            if (value == 6) {
                break;
            }

            System.out.println("Value = " + value);
        }

        System.out.println("Loop ended because break was executed.");


        // ==========================================
        // 14. continue STATEMENT
        // ==========================================

        /*
         * continue skips the current iteration and moves
         * to the next iteration of the loop.
         */

        System.out.println();
        System.out.println("14. continue Statement");
        System.out.println("------------------------------------------");

        for (int value = 1; value <= 5; value++) {

            if (value == 3) {
                continue;
            }

            System.out.println("Value = " + value);
        }

        System.out.println("The value 3 was skipped.");


        // ==========================================
        // 15. break VS continue
        // ==========================================

        /*
         * break:
         * Stops the entire loop.
         *
         * continue:
         * Skips only the current iteration.
         */

        System.out.println();
        System.out.println("15. break vs continue");
        System.out.println("------------------------------------------");

        System.out.println("break -> terminates the loop.");
        System.out.println("continue -> skips the current iteration.");


        // ==========================================
        // 16. CONTROL FLOW WITH OPERATORS
        // ==========================================

        /*
         * Control flow statements commonly use relational
         * and logical operators to make decisions.
         *
         * Operators were covered in Day 3.
         */

        System.out.println();
        System.out.println("16. Control Flow with Operators");
        System.out.println("------------------------------------------");

        int salary = 60000;
        int minimumSalary = 50000;

        if (salary >= minimumSalary) {
            System.out.println("Salary meets the minimum requirement.");
        } else {
            System.out.println("Salary does not meet the minimum requirement.");
        }


        // ==========================================
        // 17. DAY 4 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 4 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. if statement");
        System.out.println("2. if-else statement");
        System.out.println("3. if-else-if ladder");
        System.out.println("4. Nested if statement");
        System.out.println("5. switch statement");
        System.out.println("6. for loop");
        System.out.println("7. while loop");
        System.out.println("8. do-while loop");
        System.out.println("9. break statement");
        System.out.println("10. continue statement");

        System.out.println();
        System.out.println("Day 4 completed!");
    }
}
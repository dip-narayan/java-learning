package javabasics;

/// Day 3 - Operators
/// Topic: Core Java Fundamentals - Operators
/// Description:
/// This program demonstrates the different types of operators
/// available in Java and shows how they can be used in practical
/// programming examples.
/// Topics Covered:
/// - Arithmetic operators
/// - Relational operators
/// - Logical operators
/// - Bitwise operators
/// - Assignment operators
/// - Increment and decrement operators
/// - Ternary operator
/// - instanceof operator
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day03Operators {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("           DAY 3 - OPERATORS");
        System.out.println("==========================================");


        // ==========================================
        // 1. ARITHMETIC OPERATORS
        // ==========================================

        /*
         * Arithmetic operators are used to perform mathematical
         * calculations.
         *
         * +  Addition
         * -  Subtraction
         * *  Multiplication
         * /  Division
         * %  Modulus (remainder)
         */

        System.out.println();
        System.out.println("1. Arithmetic Operators");
        System.out.println("------------------------------------------");

        int firstNumber = 20;
        int secondNumber = 6;

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("First number = " + firstNumber);
        System.out.println("Second number = " + secondNumber);

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Integer division = " + division);
        System.out.println("Remainder = " + remainder);

        /*
         * Integer division removes the decimal portion.
         *
         * 20 / 6 = 3
         *
         * If decimal division is required, at least one operand
         * should be a floating-point value.
         */

        double decimalDivision = (double) firstNumber / secondNumber;

        System.out.println("Decimal division = " + decimalDivision);


        // ==========================================
        // 2. RELATIONAL OPERATORS
        // ==========================================

        /*
         * Relational operators compare two values.
         *
         * They produce a boolean result: true or false.
         *
         * ==  Equal to
         * !=  Not equal to
         * >   Greater than
         * <   Less than
         * >=  Greater than or equal to
         * <=  Less than or equal to
         */

        System.out.println();
        System.out.println("2. Relational Operators");
        System.out.println("------------------------------------------");

        int employeeAge = 28;
        int minimumWorkingAge = 18;

        System.out.println("Employee age = " + employeeAge);
        System.out.println("Minimum working age = " + minimumWorkingAge);

        System.out.println("Age == minimum age: "
                + (employeeAge == minimumWorkingAge));

        System.out.println("Age != minimum age: "
                + (employeeAge != minimumWorkingAge));

        System.out.println("Age > minimum age: "
                + (employeeAge > minimumWorkingAge));

        System.out.println("Age < minimum age: "
                + (employeeAge < minimumWorkingAge));

        System.out.println("Age >= minimum age: "
                + (employeeAge >= minimumWorkingAge));

        System.out.println("Age <= minimum age: "
                + (employeeAge <= minimumWorkingAge));


        // ==========================================
        // 3. LOGICAL OPERATORS
        // ==========================================

        /*
         * Logical operators are used to combine boolean expressions.
         *
         * &&  Logical AND
         * ||  Logical OR
         * !   Logical NOT
         */

        System.out.println();
        System.out.println("3. Logical Operators");
        System.out.println("------------------------------------------");

        boolean hasJavaKnowledge = true;
        boolean hasProgrammingExperience = true;

        boolean bothConditions = hasJavaKnowledge
                && hasProgrammingExperience;

        boolean atLeastOneCondition = hasJavaKnowledge
                || hasProgrammingExperience;

        boolean doesNotHaveJavaKnowledge = !hasJavaKnowledge;

        System.out.println("Has Java knowledge = " + hasJavaKnowledge);
        System.out.println("Has programming experience = "
                + hasProgrammingExperience);

        System.out.println("Both conditions are true = "
                + bothConditions);

        System.out.println("At least one condition is true = "
                + atLeastOneCondition);

        System.out.println("Does not have Java knowledge = "
                + doesNotHaveJavaKnowledge);


        // ==========================================
        // 4. SHORT-CIRCUIT LOGICAL OPERATORS
        // ==========================================

        /*
         * && and || are short-circuit operators.
         *
         * With &&:
         * If the first condition is false, Java does not need
         * to evaluate the second condition.
         *
         * With ||:
         * If the first condition is true, Java does not need
         * to evaluate the second condition.
         *
         * This behavior becomes especially useful when working
         * with conditions and method calls.
         */

        System.out.println();
        System.out.println("4. Short-Circuit Logical Operators");
        System.out.println("------------------------------------------");

        boolean accountActive = true;
        boolean emailVerified = false;

        boolean canLogin = accountActive && emailVerified;

        boolean needsVerification = accountActive || emailVerified;

        System.out.println("Account active = " + accountActive);
        System.out.println("Email verified = " + emailVerified);
        System.out.println("Can login = " + canLogin);
        System.out.println("At least one condition is true = "
                + needsVerification);


        // ==========================================
        // 5. BITWISE OPERATORS
        // ==========================================

        /*
         * Bitwise operators work at the individual bit level
         * of integer values.
         *
         * &   Bitwise AND
         * |   Bitwise OR
         * ^   Bitwise XOR
         * ~   Bitwise NOT
         *
         * Bitwise operators are commonly encountered when working
         * with low-level operations, flags, masks, and binary data.
         */

        System.out.println();
        System.out.println("5. Bitwise Operators");
        System.out.println("------------------------------------------");

        int firstBits = 5;   // Binary: 0101
        int secondBits = 3;  // Binary: 0011

        System.out.println("First number = " + firstBits);
        System.out.println("Second number = " + secondBits);

        System.out.println("Bitwise AND (&) = "
                + (firstBits & secondBits));

        System.out.println("Bitwise OR (|) = "
                + (firstBits | secondBits));

        System.out.println("Bitwise XOR (^) = "
                + (firstBits ^ secondBits));

        System.out.println("Bitwise NOT (~) of first number = "
                + (~firstBits));


        // ==========================================
        // 6. ASSIGNMENT OPERATORS
        // ==========================================

        /*
         * Assignment operators assign values to variables.
         *
         * =    Basic assignment
         * +=   Add and assign
         * -=   Subtract and assign
         * *=   Multiply and assign
         * /=   Divide and assign
         * %=   Modulus and assign
         */

        System.out.println();
        System.out.println("6. Assignment Operators");
        System.out.println("------------------------------------------");

        int score = 100;

        System.out.println("Initial score = " + score);

        score += 20;
        System.out.println("After score += 20: " + score);

        score -= 10;
        System.out.println("After score -= 10: " + score);

        score *= 2;
        System.out.println("After score *= 2: " + score);

        score /= 2;
        System.out.println("After score /= 2: " + score);

        score %= 30;
        System.out.println("After score %= 30: " + score);


        // ==========================================
        // 7. INCREMENT OPERATOR
        // ==========================================

        /*
         * ++ increases a variable's value by 1.
         *
         * Pre-increment:
         * ++value
         *
         * Post-increment:
         * value++
         */

        System.out.println();
        System.out.println("7. Increment Operator");
        System.out.println("------------------------------------------");

        int counter = 5;

        System.out.println("Initial counter = " + counter);

        counter++;
        System.out.println("After counter++ = " + counter);

        ++counter;
        System.out.println("After ++counter = " + counter);


        // ==========================================
        // 8. DECREMENT OPERATOR
        // ==========================================

        /*
         * -- decreases a variable's value by 1.
         *
         * Pre-decrement:
         * --value
         *
         * Post-decrement:
         * value--
         */

        System.out.println();
        System.out.println("8. Decrement Operator");
        System.out.println("------------------------------------------");

        int remainingItems = 5;

        System.out.println("Initial remaining items = "
                + remainingItems);

        remainingItems--;
        System.out.println("After remainingItems-- = "
                + remainingItems);

        --remainingItems;
        System.out.println("After --remainingItems = "
                + remainingItems);


        // ==========================================
        // 9. PRE-INCREMENT VS POST-INCREMENT
        // ==========================================

        /*
         * The difference becomes important when the operator is
         * used as part of a larger expression.
         *
         * Pre-increment:
         * First increases the value, then uses it.
         *
         * Post-increment:
         * First uses the current value, then increases it.
         */

        System.out.println();
        System.out.println("9. Pre-Increment vs Post-Increment");
        System.out.println("------------------------------------------");

        int number = 10;

        int postIncrementResult = number++;

        System.out.println("Post-increment result = "
                + postIncrementResult);
        System.out.println("Number after post-increment = "
                + number);

        number = 10;

        int preIncrementResult = ++number;

        System.out.println("Pre-increment result = "
                + preIncrementResult);
        System.out.println("Number after pre-increment = "
                + number);


        // ==========================================
        // 10. TERNARY OPERATOR
        // ==========================================

        /*
         * The ternary operator is a compact way of choosing
         * between two values.
         *
         * Syntax:
         *
         * condition ? valueIfTrue : valueIfFalse
         *
         * Example:
         *
         * String result = age >= 18 ? "Adult" : "Minor";
         */

        System.out.println();
        System.out.println("10. Ternary Operator");
        System.out.println("------------------------------------------");

        int userAge = 25;

        String ageCategory = userAge >= 18
                ? "Adult"
                : "Minor";

        System.out.println("User age = " + userAge);
        System.out.println("Age category = " + ageCategory);

        int marks = 75;

        String result = marks >= 40
                ? "Pass"
                : "Fail";

        System.out.println("Marks = " + marks);
        System.out.println("Result = " + result);


        // ==========================================
        // 11. instanceof OPERATOR
        // ==========================================

        /*
         * instanceof checks whether an object is an instance of
         * a particular class or compatible type.
         *
         * String is used here because it is a reference type
         * introduced in the previous lesson.
         *
         * This operator will become more important when we study
         * inheritance and polymorphism.
         */

        System.out.println();
        System.out.println("11. instanceof Operator");
        System.out.println("------------------------------------------");

        String language = "Java";

        boolean isString = language instanceof String;

        System.out.println("Value = " + language);
        System.out.println("Is language a String? " + isString);

        /*
         * Future-topic note:
         * instanceof is especially useful with inheritance and
         * polymorphism. Those concepts will be covered later.
         */


        // ==========================================
        // 12. COMBINING OPERATORS
        // ==========================================

        /*
         * Multiple operators can be used together in an expression.
         *
         * Parentheses can make the intended order of evaluation
         * easier to understand.
         *
         * Operator precedence determines which operation is
         * evaluated first.
         */

        System.out.println();
        System.out.println("12. Combining Operators");
        System.out.println("------------------------------------------");

        int baseSalary = 50000;
        int bonus = 10000;

        int totalSalary = baseSalary + bonus;

        System.out.println("Base salary = " + baseSalary);
        System.out.println("Bonus = " + bonus);
        System.out.println("Total salary = " + totalSalary);

        boolean salaryEligible = totalSalary >= 50000
                && bonus > 0;

        System.out.println("Salary eligible = "
                + salaryEligible);


        // ==========================================
        // 13. DAY 3 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 3 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Arithmetic operators");
        System.out.println("2. Relational operators");
        System.out.println("3. Logical operators");
        System.out.println("4. Bitwise operators");
        System.out.println("5. Assignment operators");
        System.out.println("6. Increment operators");
        System.out.println("7. Decrement operators");
        System.out.println("8. Ternary operator");
        System.out.println("9. instanceof operator");

        System.out.println();
        System.out.println("Day 3 completed!");
    }
}
package javabasics;

/// Day 2 - Data Types and Variables
/// Topic: Core Java Fundamentals - Data Types and Variables
/// Description:
/// This program demonstrates Java primitive and reference types,
/// type conversion, type casting, literals, constants, variable scope,
/// and local variable type inference using var.
/// Topics Covered:
/// - Primitive data types
/// - Reference types
/// - Type casting
/// - Type conversion
/// - Literals and constants
/// - Variable scope
/// - var
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day02Variables {

    // ==========================================
    // 1. CONSTANTS
    // ==========================================

    /*
     * A constant is a value that cannot be changed after it
     * has been assigned.
     *
     * Constants are declared using the final keyword.
     *
     * By convention, constant names are written in UPPER_CASE.
     */
    static final double PI = 3.14159;
    static final int MAX_LOGIN_ATTEMPTS = 3;

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       DAY 2 - DATA TYPES & VARIABLES");
        System.out.println("==========================================");


        // ==========================================
        // 2. PRIMITIVE DATA TYPES
        // ==========================================

        /*
         * Java has 8 primitive data types:
         *
         * Integer types:
         * byte, short, int, long
         *
         * Floating-point types:
         * float, double
         *
         * Character:
         * char
         *
         * Boolean:
         * boolean
         */

        System.out.println();
        System.out.println("2. Primitive Data Types");
        System.out.println("------------------------------------------");

        byte age = 25;
        short employeeCount = 1500;
        int salary = 75000;
        long population = 1400000000L;

        float temperature = 36.5f;
        double accountBalance = 125000.75;

        char grade = 'A';
        boolean isJavaFun = true;

        System.out.println("byte age = " + age);
        System.out.println("short employeeCount = " + employeeCount);
        System.out.println("int salary = " + salary);
        System.out.println("long population = " + population);

        System.out.println("float temperature = " + temperature);
        System.out.println("double accountBalance = " + accountBalance);

        System.out.println("char grade = " + grade);
        System.out.println("boolean isJavaFun = " + isJavaFun);


        // ==========================================
        // 3. REFERENCE TYPES
        // ==========================================

        /*
         * Reference types store a reference to an object rather
         * than directly storing the object's value in the same
         * way as primitive types.
         *
         * String is a commonly used reference type.
         *
         * We will study classes and objects in detail later
         * in the OOP section.
         */

        System.out.println();
        System.out.println("3. Reference Types");
        System.out.println("------------------------------------------");

        String developerName = "Java Developer";

        System.out.println("developerName = " + developerName);
        System.out.println("String is a reference type.");

        /*
         * Future topic note:
         * Classes and objects will be covered in detail during
         * the Object-Oriented Programming section.
         */


        // ==========================================
        // 4. TYPE CONVERSION
        // ==========================================

        /*
         * Type conversion means converting a value from one
         * data type to another compatible data type.
         *
         * Widening conversion:
         * Smaller compatible type -> larger compatible type.
         *
         * Example:
         * int -> long
         * int -> double
         */

        System.out.println();
        System.out.println("4. Type Conversion");
        System.out.println("------------------------------------------");

        int numberOfStudents = 100;
        long largerNumber = numberOfStudents;

        System.out.println("Original int value = " + numberOfStudents);
        System.out.println("Converted long value = " + largerNumber);

        int productCount = 50;
        double productValue = productCount;

        System.out.println("Original int value = " + productCount);
        System.out.println("Converted double value = " + productValue);

        /*
         * Widening conversion is generally safe because the
         * destination type can represent the source value.
         */


        // ==========================================
        // 5. TYPE CASTING
        // ==========================================

        /*
         * Type casting explicitly converts a value into another
         * compatible data type.
         *
         * Narrowing conversion:
         * Larger type -> smaller type.
         *
         * Syntax:
         * smallerType variable = (smallerType) value;
         *
         * Information can be lost during narrowing.
         */

        System.out.println();
        System.out.println("5. Type Casting");
        System.out.println("------------------------------------------");

        double exactPrice = 999.99;
        int roundedDownPrice = (int) exactPrice;

        System.out.println("Original double value = " + exactPrice);
        System.out.println("After casting to int = " + roundedDownPrice);

        /*
         * The decimal part is removed during this cast.
         * 999.99 becomes 999.
         */


        // ==========================================
        // 6. CHAR AND INTEGER CONVERSION
        // ==========================================

        /*
         * A char represents a single character.
         *
         * Internally, char values are represented using
         * numeric Unicode values.
         *
         * Therefore, a char can participate in numeric
         * conversions.
         */

        System.out.println();
        System.out.println("6. Character Conversion");
        System.out.println("------------------------------------------");

        char letter = 'A';
        int characterCode = letter;

        System.out.println("Character = " + letter);
        System.out.println("Numeric value of character = " + characterCode);

        int numericValue = 66;
        char convertedCharacter = (char) numericValue;

        System.out.println("Numeric value = " + numericValue);
        System.out.println("Converted character = " + convertedCharacter);


        // ==========================================
        // 7. LITERALS
        // ==========================================

        /*
         * A literal is a fixed value written directly in Java
         * source code.
         *
         * Examples:
         * 100       -> integer literal
         * 100L      -> long literal
         * 10.5      -> double literal
         * 10.5f     -> float literal
         * 'A'       -> character literal
         * "Hello"   -> string literal
         * true      -> boolean literal
         */

        System.out.println();
        System.out.println("7. Literals");
        System.out.println("------------------------------------------");

        int integerLiteral = 100;
        long longLiteral = 100000L;
        double doubleLiteral = 99.99;
        float floatLiteral = 25.5f;
        char characterLiteral = 'J';
        String stringLiteral = "Java";
        boolean booleanLiteral = true;

        System.out.println("Integer literal = " + integerLiteral);
        System.out.println("Long literal = " + longLiteral);
        System.out.println("Double literal = " + doubleLiteral);
        System.out.println("Float literal = " + floatLiteral);
        System.out.println("Character literal = " + characterLiteral);
        System.out.println("String literal = " + stringLiteral);
        System.out.println("Boolean literal = " + booleanLiteral);


        // ==========================================
        // 8. CONSTANTS USING final
        // ==========================================

        /*
         * The final keyword prevents a variable from being
         * assigned a new value after initialization.
         *
         * Constants are useful when a value should remain
         * unchanged throughout the program.
         */

        System.out.println();
        System.out.println("8. Constants");
        System.out.println("------------------------------------------");

        System.out.println("PI = " + PI);
        System.out.println("Maximum login attempts = "
                + MAX_LOGIN_ATTEMPTS);

        /*
         * The following would cause a compilation error:
         *
         * PI = 3.14;
         *
         * because PI is final.
         */


        // ==========================================
        // 9. VARIABLE SCOPE
        // ==========================================

        /*
         * Scope determines where a variable can be accessed.
         *
         * A variable declared inside a method is available only
         * within that method.
         *
         * A variable declared inside a block is available only
         * within that block.
         *
         * The following example uses a separate method to
         * demonstrate method-level local scope.
         */

        System.out.println();
        System.out.println("9. Variable Scope");
        System.out.println("------------------------------------------");

        int mainMethodVariable = 100;

        System.out.println("Variable inside main() = "
                + mainMethodVariable);

        demonstrateLocalScope();

        /*
         * localVariable exists only inside demonstrateLocalScope().
         *
         * Therefore, the following would NOT compile:
         *
         * System.out.println(localVariable);
         */


        // ==========================================
        // 10. var - LOCAL VARIABLE TYPE INFERENCE
        // ==========================================

        /*
         * var allows Java to infer the type of a local variable
         * from the value assigned to it.
         *
         * Example:
         *
         * var developer = "Java Developer";
         *
         * Java automatically determines that developer is a String.
         *
         * IMPORTANT:
         * var does NOT mean that Java becomes dynamically typed.
         *
         * The variable still has a fixed type after compilation.
         *
         * var can be used for local variables, not for:
         * - class fields
         * - method parameters
         * - method return types
         */

        System.out.println();
        System.out.println("10. var - Local Variable Type Inference");
        System.out.println("------------------------------------------");

        var developer = "Backend Developer";
        var yearsOfExperience = 2;
        var experienceRating = 4.5;

        System.out.println("developer = " + developer);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("experienceRating = " + experienceRating);

        /*
         * The compiler infers:
         *
         * developer          -> String
         * yearsOfExperience  -> int
         * experienceRating   -> double
         *
         * var must be initialized when declared.
         *
         * This would NOT compile:
         *
         * var value;
         */


        // ==========================================
        // 11. VARIABLE INITIALIZATION
        // ==========================================

        /*
         * A variable must have a value before it is used.
         *
         * Declaration:
         * int employeeAge;
         *
         * Initialization:
         * employeeAge = 30;
         *
         * Declaration + initialization:
         * int employeeSalary = 50000;
         */

        System.out.println();
        System.out.println("11. Variable Declaration and Initialization");
        System.out.println("------------------------------------------");

        int employeeAge;
        employeeAge = 30;

        int employeeSalary = 50000;

        System.out.println("Employee age = " + employeeAge);
        System.out.println("Employee salary = " + employeeSalary);


        // ==========================================
        // 12. DAY 2 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 2 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Primitive data types");
        System.out.println("2. Reference types");
        System.out.println("3. Type conversion");
        System.out.println("4. Type casting");
        System.out.println("5. Literals");
        System.out.println("6. Constants");
        System.out.println("7. Variable scope");
        System.out.println("8. var");

        System.out.println();
        System.out.println("Day 2 completed!");
    }


    // ==========================================
    // 13. LOCAL VARIABLE SCOPE DEMONSTRATION
    // ==========================================

    /**
     * Demonstrates a local variable whose scope is limited
     * to this method.
     */
    public static void demonstrateLocalScope() {

        int localVariable = 500;

        System.out.println("Variable inside another method = "
                + localVariable);
    }
}
package javabasics;

/// Day 7 - Important OOP Keywords and Methods
/// Topic: this, super, static, final, Method Overloading, Constructor Overloading
/// Description:
/// This program demonstrates important Java keywords and method
/// concepts used in Object-Oriented Programming.
/// Topics Covered:
/// - this keyword
/// - super keyword
/// - static keyword
/// - final keyword
/// - Method overloading
/// - Constructor overloading
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day07OOPKeywordsAndMethods {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("   DAY 7 - OOP KEYWORDS AND METHODS");
        System.out.println("==========================================");


        // ==========================================
        // 1. this KEYWORD
        // ==========================================

        /*
         * The this keyword refers to the current object.
         *
         * It is commonly used when a parameter has the same
         * name as an instance variable.
         */

        System.out.println();
        System.out.println("1. this Keyword");
        System.out.println("------------------------------------------");

        Student student = new Student(
                "Rahul",
                21
        );

        student.displayDetails();


        // ==========================================
        // 2. this KEYWORD WITH METHOD
        // ==========================================

        /*
         * The this keyword can also be used to call another
         * method of the current object.
         */

        System.out.println();
        System.out.println("2. this with Method");
        System.out.println("------------------------------------------");

        student.showStudent();


        // ==========================================
        // 3. super KEYWORD
        // ==========================================

        /*
         * The super keyword refers to the immediate parent class.
         *
         * It can be used to:
         * - Access parent class fields
         * - Call parent class methods
         * - Call parent class constructors
         */

        System.out.println();
        System.out.println("3. super Keyword");
        System.out.println("------------------------------------------");

        Developer developer = new Developer(
                "Amit",
                "Java"
        );

        developer.displayDeveloperDetails();


        // ==========================================
        // 4. static VARIABLE
        // ==========================================

        /*
         * A static variable belongs to the class rather than
         * to individual objects.
         *
         * All objects share the same static variable.
         */

        System.out.println();
        System.out.println("4. static Variable");
        System.out.println("------------------------------------------");

        System.out.println(
                "Company name = " + Employee.companyName
        );

        Employee employeeOne = new Employee("Ravi");
        Employee employeeTwo = new Employee("Priya");

        employeeOne.displayEmployee();
        employeeTwo.displayEmployee();


        // ==========================================
        // 5. static METHOD
        // ==========================================

        /*
         * A static method belongs to the class.
         *
         * It can be called using the class name without
         * creating an object.
         */

        System.out.println();
        System.out.println("5. static Method");
        System.out.println("------------------------------------------");

        Employee.showCompanyInformation();


        // ==========================================
        // 6. final VARIABLE
        // ==========================================

        /*
         * A final variable can be assigned only once.
         *
         * Once initialized, its value cannot be changed.
         */

        System.out.println();
        System.out.println("6. final Variable");
        System.out.println("------------------------------------------");

        final double PI = 3.14159;

        System.out.println("Value of PI = " + PI);

        /*
         * The following would cause a compilation error:
         *
         * PI = 4.0;
         *
         * because PI is final.
         */


        // ==========================================
        // 7. final METHOD
        // ==========================================

        /*
         * A final method cannot be overridden by a child class.
         */

        System.out.println();
        System.out.println("7. final Method");
        System.out.println("------------------------------------------");

        FinalExample finalExample = new FinalExample();

        finalExample.showMessage();

        /*
         * A child class cannot override showMessage()
         * because it is declared final.
         */


        // ==========================================
        // 8. final CLASS
        // ==========================================

        /*
         * A final class cannot be inherited.
         *
         * Example:
         *
         * final class SecuritySystem
         *
         * Another class cannot extend SecuritySystem.
         */

        System.out.println();
        System.out.println("8. final Class");
        System.out.println("------------------------------------------");

        SecuritySystem securitySystem = new SecuritySystem();

        securitySystem.displayMessage();


        // ==========================================
        // 9. METHOD OVERLOADING
        // ==========================================

        /*
         * Method overloading means having multiple methods
         * with the same name but different parameter lists.
         *
         * The difference can be:
         * - Number of parameters
         * - Type of parameters
         * - Order of parameters
         */

        System.out.println();
        System.out.println("9. Method Overloading");
        System.out.println("------------------------------------------");

        Calculator calculator = new Calculator();

        System.out.println(
                "add(int, int) = "
                        + calculator.add(10, 20)
        );

        System.out.println(
                "add(int, int, int) = "
                        + calculator.add(10, 20, 30)
        );

        System.out.println(
                "add(double, double) = "
                        + calculator.add(10.5, 20.5)
        );

        System.out.println(
                "add(String, String) = "
                        + calculator.add("Java ", "Backend")
        );


        // ==========================================
        // 10. CONSTRUCTOR OVERLOADING
        // ==========================================

        /*
         * Constructor overloading means having multiple
         * constructors in the same class with different
         * parameter lists.
         */

        System.out.println();
        System.out.println("10. Constructor Overloading");
        System.out.println("------------------------------------------");

        Product productOne = new Product();

        Product productTwo = new Product(
                "Laptop"
        );

        Product productThree = new Product(
                "Laptop",
                75000
        );

        Product productFour = new Product(
                "Laptop",
                75000,
                "Electronics"
        );

        System.out.println("Product 1:");
        productOne.displayProduct();

        System.out.println();

        System.out.println("Product 2:");
        productTwo.displayProduct();

        System.out.println();

        System.out.println("Product 3:");
        productThree.displayProduct();

        System.out.println();

        System.out.println("Product 4:");
        productFour.displayProduct();


        // ==========================================
        // 11. COMBINING OOP CONCEPTS
        // ==========================================

        /*
         * Java programs commonly use multiple OOP features
         * together.
         */

        System.out.println();
        System.out.println("11. Combining OOP Concepts");
        System.out.println("------------------------------------------");

        Developer backendDeveloper = new Developer(
                "Dip",
                "Java Backend Developer"
        );

        backendDeveloper.displayDeveloperDetails();

        System.out.println(
                "Company = " + Employee.companyName
        );


        // ==========================================
        // 12. DAY 7 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 7 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. this keyword");
        System.out.println("2. super keyword");
        System.out.println("3. static variable");
        System.out.println("4. static method");
        System.out.println("5. final variable");
        System.out.println("6. final method");
        System.out.println("7. final class");
        System.out.println("8. Method overloading");
        System.out.println("9. Constructor overloading");

        System.out.println();
        System.out.println("Day 7 completed!");
    }
}


// ==========================================
// STUDENT CLASS
// ==========================================

class Student {

    private String name;
    private int age;


    // ==========================================
    // CONSTRUCTOR USING this
    // ==========================================

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }


    // ==========================================
    // DISPLAY METHOD
    // ==========================================

    void displayDetails() {

        System.out.println("Student name = " + this.name);
        System.out.println("Student age = " + this.age);
    }


    // ==========================================
    // METHOD USING this
    // ==========================================

    void showStudent() {

        this.displayDetails();
    }
}


// ==========================================
// PERSON PARENT CLASS
// ==========================================

class Person {

    protected String name;


    Person(String name) {

        this.name = name;
    }


    void displayName() {

        System.out.println(
                "Person name = " + name
        );
    }
}


// ==========================================
// DEVELOPER CHILD CLASS
// ==========================================

class Developer extends Person {

    private String technology;


    Developer(String name, String technology) {

        super(name);

        this.technology = technology;
    }


    void displayDeveloperDetails() {

        System.out.println(
                "Developer name = " + super.name
        );

        System.out.println(
                "Technology = " + this.technology
        );

        super.displayName();
    }
}


// ==========================================
// EMPLOYEE CLASS
// ==========================================

class Employee {

    private String name;

    static String companyName = "Tech Solutions";


    Employee(String name) {

        this.name = name;
    }


    void displayEmployee() {

        System.out.println(
                "Employee = " + name
        );

        System.out.println(
                "Company = " + companyName
        );
    }


    static void showCompanyInformation() {

        System.out.println(
                "Company = " + companyName
        );

        System.out.println(
                "This is a static method."
        );
    }
}


// ==========================================
// FINAL EXAMPLE CLASS
// ==========================================

class FinalExample {

    final void showMessage() {

        System.out.println(
                "This is a final method."
        );

        System.out.println(
                "A final method cannot be overridden."
        );
    }
}


// ==========================================
// FINAL CLASS
// ==========================================

final class SecuritySystem {

    void displayMessage() {

        System.out.println(
                "Security system is active."
        );

        System.out.println(
                "This class cannot be inherited."
        );
    }
}


// ==========================================
// CALCULATOR CLASS
// ==========================================

class Calculator {


    // ==========================================
    // METHOD 1
    // ==========================================

    int add(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }


    // ==========================================
    // METHOD 2
    // ==========================================

    int add(
            int firstNumber,
            int secondNumber,
            int thirdNumber) {

        return firstNumber
                + secondNumber
                + thirdNumber;
    }


    // ==========================================
    // METHOD 3
    // ==========================================

    double add(
            double firstNumber,
            double secondNumber) {

        return firstNumber + secondNumber;
    }


    // ==========================================
    // METHOD 4
    // ==========================================

    String add(
            String firstText,
            String secondText) {

        return firstText + secondText;
    }
}


// ==========================================
// PRODUCT CLASS
// ==========================================

class Product {

    private String name;
    private double price;
    private String category;


    // ==========================================
    // CONSTRUCTOR 1
    // ==========================================

    Product() {

        name = "Unknown";
        price = 0;
        category = "Not assigned";
    }


    // ==========================================
    // CONSTRUCTOR 2
    // ==========================================

    Product(String name) {

        this.name = name;
        price = 0;
        category = "Not assigned";
    }


    // ==========================================
    // CONSTRUCTOR 3
    // ==========================================

    Product(String name, double price) {

        this.name = name;
        this.price = price;
        category = "Not assigned";
    }


    // ==========================================
    // CONSTRUCTOR 4
    // ==========================================

    Product(
            String name,
            double price,
            String category) {

        this.name = name;
        this.price = price;
        this.category = category;
    }


    // ==========================================
    // DISPLAY METHOD
    // ==========================================

    void displayProduct() {

        System.out.println("Name = " + name);
        System.out.println("Price = " + price);
        System.out.println("Category = " + category);
    }
}
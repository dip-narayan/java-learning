package oop;

/// Day 5 - Classes and Objects
/// Topic: Object-Oriented Programming - Classes and Objects
/// Description:
/// This program demonstrates the basic concepts of classes and
/// objects in Java. It shows how to create classes, define fields
/// and methods, and create objects using different constructors.
/// Topics Covered:
/// - Classes
/// - Objects
/// - Fields
/// - Methods
/// - Default constructor
/// - Parameterized constructor
/// - Copy constructor
/// - Creating multiple objects
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day05ClassesAndObjects {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       DAY 5 - CLASSES AND OBJECTS");
        System.out.println("==========================================");


        // ==========================================
        // 1. CREATING AN OBJECT
        // ==========================================

        /*
         * A class is a blueprint for creating objects.
         *
         * An object is an actual instance of a class.
         *
         * Syntax:
         *
         * ClassName objectName = new ClassName();
         */

        System.out.println();
        System.out.println("1. Creating an Object");
        System.out.println("------------------------------------------");

        Student studentOne = new Student();

        System.out.println("Student object created successfully.");


        // ==========================================
        // 2. FIELDS
        // ==========================================

        /*
         * Fields are variables declared inside a class.
         *
         * They represent the data or state of an object.
         */

        System.out.println();
        System.out.println("2. Fields");
        System.out.println("------------------------------------------");

        studentOne.name = "Rahul";
        studentOne.age = 21;
        studentOne.course = "Java";

        System.out.println("Student name = " + studentOne.name);
        System.out.println("Student age = " + studentOne.age);
        System.out.println("Student course = " + studentOne.course);


        // ==========================================
        // 3. METHODS
        // ==========================================

        /*
         * A method is a block of code that performs a specific task.
         *
         * Methods allow an object to perform actions.
         */

        System.out.println();
        System.out.println("3. Methods");
        System.out.println("------------------------------------------");

        studentOne.displayStudentDetails();

        studentOne.study();


        // ==========================================
        // 4. DEFAULT CONSTRUCTOR
        // ==========================================

        /*
         * A constructor is used to initialize an object.
         *
         * A constructor:
         * - Has the same name as the class.
         * - Does not have a return type.
         * - Runs automatically when an object is created.
         *
         * Here Student has a no-argument constructor.
         */

        System.out.println();
        System.out.println("4. Default Constructor");
        System.out.println("------------------------------------------");

        Student studentTwo = new Student();

        System.out.println("Student created using default constructor.");

        studentTwo.displayStudentDetails();


        // ==========================================
        // 5. PARAMETERIZED CONSTRUCTOR
        // ==========================================

        /*
         * A parameterized constructor accepts values when an object
         * is created.
         */

        System.out.println();
        System.out.println("5. Parameterized Constructor");
        System.out.println("------------------------------------------");

        Student studentThree = new Student(
                "Amit",
                23,
                "Spring Boot"
        );

        studentThree.displayStudentDetails();


        // ==========================================
        // 6. CREATING MULTIPLE OBJECTS
        // ==========================================

        /*
         * A single class can be used to create many objects.
         *
         * Each object has its own copy of instance fields.
         */

        System.out.println();
        System.out.println("6. Multiple Objects");
        System.out.println("------------------------------------------");

        Student studentFour = new Student(
                "Priya",
                22,
                "Java Backend"
        );

        Student studentFive = new Student(
                "Arjun",
                24,
                "Spring Boot"
        );

        System.out.println("Student 1:");
        studentFour.displayStudentDetails();

        System.out.println();

        System.out.println("Student 2:");
        studentFive.displayStudentDetails();


        // ==========================================
        // 7. OBJECTS HAVE THEIR OWN STATE
        // ==========================================

        /*
         * Each object has its own instance variables.
         *
         * Changing one object's field does not automatically
         * change another object's field.
         */

        System.out.println();
        System.out.println("7. Object State");
        System.out.println("------------------------------------------");

        studentFour.age = 25;

        System.out.println(
                "Student 1 age = " + studentFour.age
        );

        System.out.println(
                "Student 2 age = " + studentFive.age
        );


        // ==========================================
        // 8. COPY CONSTRUCTOR
        // ==========================================

        /*
         * Java does not provide a built-in copy constructor syntax
         * like some other languages.
         *
         * We can create our own constructor that accepts another
         * object of the same class and copies its values.
         */

        System.out.println();
        System.out.println("8. Copy Constructor");
        System.out.println("------------------------------------------");

        Student originalStudent = new Student(
                "Rohan",
                26,
                "Java Backend"
        );

        Student copiedStudent = new Student(originalStudent);

        System.out.println("Original student:");
        originalStudent.displayStudentDetails();

        System.out.println();

        System.out.println("Copied student:");
        copiedStudent.displayStudentDetails();


        // ==========================================
        // 9. MODIFYING THE COPIED OBJECT
        // ==========================================

        /*
         * The copied object has its own instance fields.
         *
         * Changing the copied object does not change the original
         * object's fields in this example.
         */

        System.out.println();
        System.out.println("9. Modifying the Copied Object");
        System.out.println("------------------------------------------");

        copiedStudent.name = "Copied Rohan";
        copiedStudent.age = 27;

        System.out.println("Original student:");
        originalStudent.displayStudentDetails();

        System.out.println();

        System.out.println("Copied student after modification:");
        copiedStudent.displayStudentDetails();


        // ==========================================
        // 10. METHOD WITH PARAMETERS
        // ==========================================

        /*
         * Methods can accept parameters.
         *
         * Parameters allow us to send data to a method.
         */

        System.out.println();
        System.out.println("10. Method with Parameters");
        System.out.println("------------------------------------------");

        Student employee = new Student(
                "Dip",
                28,
                "Java Backend"
        );

        employee.greet("Welcome to Java Backend Development!");

        employee.updateCourse("Spring Boot");

        employee.displayStudentDetails();


        // ==========================================
        // 11. OBJECT REFERENCES
        // ==========================================

        /*
         * A variable that stores an object does not directly contain
         * the complete object. It contains a reference to the object.
         *
         * This example demonstrates that two variables can refer
         * to the same object.
         */

        System.out.println();
        System.out.println("11. Object References");
        System.out.println("------------------------------------------");

        Student firstReference = new Student(
                "Karan",
                25,
                "Java"
        );

        Student secondReference = firstReference;

        System.out.println("Before modification:");
        firstReference.displayStudentDetails();

        secondReference.name = "Updated Karan";

        System.out.println();
        System.out.println("After modifying through second reference:");
        firstReference.displayStudentDetails();

        /*
         * Both variables refer to the same Student object.
         */


        // ==========================================
        // 12. DAY 5 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 5 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Classes");
        System.out.println("2. Objects");
        System.out.println("3. Fields");
        System.out.println("4. Methods");
        System.out.println("5. Default constructor");
        System.out.println("6. Parameterized constructor");
        System.out.println("7. Copy constructor");
        System.out.println("8. Multiple objects");
        System.out.println("9. Object state");
        System.out.println("10. Object references");

        System.out.println();
        System.out.println("Day 5 completed!");
    }
}


// ==========================================
// STUDENT CLASS
// ==========================================

/*
 * Student is a custom class.
 *
 * It acts as a blueprint from which Student objects can be created.
 */

class Student {

    // ==========================================
    // FIELDS
    // ==========================================

    String name;
    int age;
    String course;


    // ==========================================
    // DEFAULT CONSTRUCTOR
    // ==========================================

    /*
     * This constructor does not accept parameters.
     */

    Student() {

        name = "Unknown";
        age = 0;
        course = "Not assigned";
    }


    // ==========================================
    // PARAMETERIZED CONSTRUCTOR
    // ==========================================

    /*
     * This constructor accepts values to initialize the object.
     */

    Student(String name, int age, String course) {

        this.name = name;
        this.age = age;
        this.course = course;
    }


    // ==========================================
    // COPY CONSTRUCTOR
    // ==========================================

    /*
     * This constructor creates a new Student object by copying
     * values from another Student object.
     */

    Student(Student otherStudent) {

        this.name = otherStudent.name;
        this.age = otherStudent.age;
        this.course = otherStudent.course;
    }


    // ==========================================
    // DISPLAY METHOD
    // ==========================================

    void displayStudentDetails() {

        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Course = " + course);
    }


    // ==========================================
    // STUDY METHOD
    // ==========================================

    void study() {

        System.out.println(
                name + " is studying " + course + "."
        );
    }


    // ==========================================
    // METHOD WITH PARAMETER
    // ==========================================

    void greet(String message) {

        System.out.println(name + ": " + message);
    }


    // ==========================================
    // UPDATE METHOD
    // ==========================================

    void updateCourse(String newCourse) {

        course = newCourse;

        System.out.println(
                "Course updated to: " + course
        );
    }
}
package oop.day09;

/// Day 9 - Interfaces and Abstract Classes
/// Topic: Object-Oriented Programming - Interfaces and Abstract Classes
/// Description:
/// This program demonstrates interfaces and abstract classes in Java.
/// It shows how abstraction can be achieved using abstract classes
/// and interfaces, including default methods, static interface methods,
/// and functional interfaces.
/// Topics Covered:
/// - Abstract classes
/// - Abstract methods
/// - Concrete methods in abstract classes
/// - Interfaces
/// - Implementing interfaces
/// - Multiple interfaces
/// - Default interface methods
/// - Static interface methods
/// - Functional interfaces
/// - @FunctionalInterface
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day09InterfacesAndAbstractClasses {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println(" DAY 9 - INTERFACES AND ABSTRACT CLASSES");
        System.out.println("==========================================");


        // ==========================================
        // 1. ABSTRACT CLASS
        // ==========================================

        /*
         * An abstract class is a class declared with the
         * abstract keyword.
         *
         * An abstract class cannot be directly instantiated.
         *
         * It can contain:
         * - Abstract methods
         * - Concrete methods
         * - Fields
         * - Constructors
         */

        System.out.println();
        System.out.println("1. Abstract Class");
        System.out.println("------------------------------------------");

        Dog dog = new Dog("Buddy");

        dog.displayName();
        dog.eat();
        dog.makeSound();


        // ==========================================
        // 2. ABSTRACT METHOD
        // ==========================================

        /*
         * An abstract method does not have a method body.
         *
         * The child class must provide the implementation.
         *
         * Example:
         *
         * abstract void makeSound();
         *
         * Dog provides the implementation of makeSound().
         */

        System.out.println();
        System.out.println("2. Abstract Method");
        System.out.println("------------------------------------------");

        dog.makeSound();

        System.out.println(
                "Dog provides the implementation of the abstract method."
        );


        // ==========================================
        // 3. ABSTRACT CLASS REFERENCE
        // ==========================================

        /*
         * An abstract class cannot be instantiated directly.
         *
         * However, an abstract class reference can refer to
         * an object of a child class.
         */

        System.out.println();
        System.out.println("3. Abstract Class Reference");
        System.out.println("------------------------------------------");

        Animal animal = new Dog("Rocky");

        animal.displayName();
        animal.eat();
        animal.makeSound();


        // ==========================================
        // 4. INTERFACE
        // ==========================================

        /*
         * An interface defines a contract that implementing
         * classes must follow.
         *
         * A class uses the implements keyword to implement
         * an interface.
         */

        System.out.println();
        System.out.println("4. Interface");
        System.out.println("------------------------------------------");

        Payment payment = new CreditCardPayment();

        payment.pay(5000);


        // ==========================================
        // 5. IMPLEMENTING AN INTERFACE
        // ==========================================

        /*
         * CreditCardPayment implements the Payment interface.
         *
         * Therefore, it must provide an implementation of
         * the pay() method.
         */

        System.out.println();
        System.out.println("5. Implementing an Interface");
        System.out.println("------------------------------------------");

        Payment upiPayment = new UpiPayment();

        upiPayment.pay(2500);


        // ==========================================
        // 6. MULTIPLE INTERFACES
        // ==========================================

        /*
         * Java does not support multiple class inheritance.
         *
         * However, a class can implement multiple interfaces.
         *
         * This allows a class to follow multiple contracts.
         */

        System.out.println();
        System.out.println("6. Multiple Interfaces");
        System.out.println("------------------------------------------");

        SmartPhone smartPhone = new SmartPhone();

        smartPhone.call("9876543210");
        smartPhone.takePhoto();
        smartPhone.connectToInternet();


        // ==========================================
        // 7. DEFAULT INTERFACE METHOD
        // ==========================================

        /*
         * An interface can contain a default method.
         *
         * A default method has a method body.
         *
         * Implementing classes automatically receive the
         * default implementation unless they override it.
         */

        System.out.println();
        System.out.println("7. Default Interface Method");
        System.out.println("------------------------------------------");

        Printer printer = new OfficePrinter();

        printer.print();

        printer.showPrinterInformation();


        // ==========================================
        // 8. OVERRIDING DEFAULT METHOD
        // ==========================================

        /*
         * A class can override a default interface method
         * and provide its own implementation.
         */

        System.out.println();
        System.out.println("8. Overriding Default Method");
        System.out.println("------------------------------------------");

        AdvancedPrinter advancedPrinter =
                new AdvancedPrinter();

        advancedPrinter.print();

        advancedPrinter.showPrinterInformation();


        // ==========================================
        // 9. STATIC INTERFACE METHOD
        // ==========================================

        /*
         * Interfaces can contain static methods.
         *
         * Static interface methods belong to the interface itself.
         *
         * They are called using the interface name.
         */

        System.out.println();
        System.out.println("9. Static Interface Method");
        System.out.println("------------------------------------------");

        Printer.showPrinterType();


        // ==========================================
        // 10. FUNCTIONAL INTERFACE
        // ==========================================

        /*
         * A functional interface contains exactly one
         * abstract method.
         *
         * @FunctionalInterface is used to tell Java that
         * the interface should contain one abstract method.
         */

        System.out.println();
        System.out.println("10. Functional Interface");
        System.out.println("------------------------------------------");

        Greeting greeting = new Greeting() {

            @Override
            public void greet(String name) {

                System.out.println(
                        "Hello, " + name + "!"
                );
            }
        };

        greeting.greet("Dip");


        // ==========================================
        // 11. FUNCTIONAL INTERFACE WITH LAMBDA
        // ==========================================

        /*
         * A functional interface can be used with a lambda
         * expression.
         *
         * Lambda expressions provide a shorter way to provide
         * the implementation of a functional interface.
         */

        System.out.println();
        System.out.println("11. Functional Interface with Lambda");
        System.out.println("------------------------------------------");

        Greeting lambdaGreeting =
                name -> System.out.println(
                        "Welcome, " + name + "!"
                );

        lambdaGreeting.greet("Java Developer");


        // ==========================================
        // 12. INTERFACE REFERENCE
        // ==========================================

        /*
         * An interface reference can refer to an object of
         * any class that implements that interface.
         *
         * This is another example of polymorphism.
         */

        System.out.println();
        System.out.println("12. Interface Reference");
        System.out.println("------------------------------------------");

        Payment paymentOne =
                new CreditCardPayment();

        Payment paymentTwo =
                new UpiPayment();

        paymentOne.pay(1000);
        paymentTwo.pay(2000);


        // ==========================================
        // 13. ABSTRACT CLASS VS INTERFACE
        // ==========================================

        /*
         * Abstract class:
         *
         * - Can have constructors.
         * - Can have instance fields.
         * - Can have abstract methods.
         * - Can have concrete methods.
         * - A class can extend only one class.
         *
         * Interface:
         *
         * - Defines a contract.
         * - A class can implement multiple interfaces.
         * - Can contain abstract methods.
         * - Can contain default methods.
         * - Can contain static methods.
         *
         * The choice depends on the design requirements.
         */

        System.out.println();
        System.out.println("13. Abstract Class vs Interface");
        System.out.println("------------------------------------------");

        System.out.println(
                "Abstract class = shared base class and behavior"
        );

        System.out.println(
                "Interface = contract that a class agrees to follow"
        );

        System.out.println(
                "A class can extend one class."
        );

        System.out.println(
                "A class can implement multiple interfaces."
        );


        // ==========================================
        // 14. COMBINING ABSTRACT CLASS AND INTERFACE
        // ==========================================

        /*
         * Real Java applications commonly combine abstract
         * classes and interfaces.
         *
         * The abstract class can provide common behavior,
         * while the interface defines a contract.
         */

        System.out.println();
        System.out.println("14. Combining Abstract Class and Interface");
        System.out.println("------------------------------------------");

        BackendDeveloper developer =
                new BackendDeveloper("Dip");

        developer.displayName();
        developer.writeCode();
        developer.testApplication();


        // ==========================================
        // 15. DAY 9 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 9 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Abstract classes");
        System.out.println("2. Abstract methods");
        System.out.println("3. Abstract class references");
        System.out.println("4. Interfaces");
        System.out.println("5. Implementing interfaces");
        System.out.println("6. Multiple interfaces");
        System.out.println("7. Default interface methods");
        System.out.println("8. Static interface methods");
        System.out.println("9. Functional interfaces");
        System.out.println("10. @FunctionalInterface");
        System.out.println("11. Interface references");
        System.out.println("12. Abstract class vs interface");

        System.out.println();
        System.out.println("Day 9 completed!");
    }
}


// ==========================================
// ABSTRACT ANIMAL CLASS
// ==========================================

/*
 * Animal is an abstract class.
 *
 * It provides common behavior for different animals.
 */

abstract class Animal {

    protected String name;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    Animal(String name) {

        this.name = name;
    }


    // ==========================================
    // CONCRETE METHOD
    // ==========================================

    void displayName() {

        System.out.println(
                "Animal name = " + name
        );
    }


    // ==========================================
    // CONCRETE METHOD
    // ==========================================

    void eat() {

        System.out.println(
                name + " is eating."
        );
    }


    // ==========================================
    // ABSTRACT METHOD
    // ==========================================

    abstract void makeSound();
}


// ==========================================
// DOG CLASS
// ==========================================

class Dog extends Animal {

    Dog(String name) {

        super(name);
    }


    // ==========================================
    // IMPLEMENTING ABSTRACT METHOD
    // ==========================================

    @Override
    void makeSound() {

        System.out.println(
                name + " says: Woof!"
        );
    }
}


// ==========================================
// PAYMENT INTERFACE
// ==========================================

interface Payment {

    /*
     * Interface methods are abstract by default
     * unless they are declared as default or static.
     */

    void pay(double amount);
}


// ==========================================
// CREDIT CARD PAYMENT
// ==========================================

class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid " + amount + " using Credit Card."
        );
    }
}


// ==========================================
// UPI PAYMENT
// ==========================================

class UpiPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println(
                "Paid " + amount + " using UPI."
        );
    }
}


// ==========================================
// CALLABLE INTERFACE
// ==========================================

interface Callable {

    void call(String phoneNumber);
}


// ==========================================
// CAMERA INTERFACE
// ==========================================

interface Camera {

    void takePhoto();
}


// ==========================================
// INTERNET INTERFACE
// ==========================================

interface InternetConnection {

    void connectToInternet();
}


// ==========================================
// SMARTPHONE CLASS
// ==========================================

/*
 * A class can implement multiple interfaces.
 */

class SmartPhone
        implements Callable, Camera, InternetConnection {


    @Override
    public void call(String phoneNumber) {

        System.out.println(
                "Calling " + phoneNumber
        );
    }


    @Override
    public void takePhoto() {

        System.out.println(
                "Taking a photo using the smartphone."
        );
    }


    @Override
    public void connectToInternet() {

        System.out.println(
                "Connecting smartphone to the internet."
        );
    }
}


// ==========================================
// PRINTER INTERFACE
// ==========================================

interface Printer {

    /*
     * Abstract method.
     */

    void print();


    /*
     * Default method.
     */

    default void showPrinterInformation() {

        System.out.println(
                "This is a standard printer."
        );
    }


    /*
     * Static interface method.
     */

    static void showPrinterType() {

        System.out.println(
                "Printer interface: Printing device contract."
        );
    }
}


// ==========================================
// OFFICE PRINTER
// ==========================================

class OfficePrinter implements Printer {

    @Override
    public void print() {

        System.out.println(
                "Office printer is printing a document."
        );
    }
}


// ==========================================
// ADVANCED PRINTER
// ==========================================

class AdvancedPrinter implements Printer {

    @Override
    public void print() {

        System.out.println(
                "Advanced printer is printing a high-quality document."
        );
    }


    /*
     * Overriding the default interface method.
     */

    @Override
    public void showPrinterInformation() {

        System.out.println(
                "This is an advanced multifunction printer."
        );
    }
}


// ==========================================
// FUNCTIONAL INTERFACE
// ==========================================

/*
 * A functional interface contains exactly one
 * abstract method.
 */

@FunctionalInterface
interface Greeting {

    void greet(String name);
}


// ==========================================
// DEVELOPER INTERFACE
// ==========================================

interface DeveloperActions {

    void writeCode();
}


// ==========================================
// TESTABLE INTERFACE
// ==========================================

interface Testable {

    void testApplication();
}


// ==========================================
// BACKEND DEVELOPER CLASS
// ==========================================

/*
 * This class demonstrates combining an abstract class
 * with interfaces.
 */

class BackendDeveloper
        extends DeveloperBase
        implements DeveloperActions, Testable {


    BackendDeveloper(String name) {

        super(name);
    }


    @Override
    public void writeCode() {

        System.out.println(
                name + " is writing Java backend code."
        );
    }


    @Override
    public void testApplication() {

        System.out.println(
                name + " is testing the backend application."
        );
    }
}


// ==========================================
// DEVELOPER BASE ABSTRACT CLASS
// ==========================================

abstract class DeveloperBase {

    protected String name;


    DeveloperBase(String name) {

        this.name = name;
    }


    void displayName() {

        System.out.println(
                "Developer name = " + name
        );
    }
}
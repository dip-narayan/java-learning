package oop;

/// Day 6 - OOP Principles
/// Topic: Object-Oriented Programming - OOP Principles
/// Description:
/// This program demonstrates the four fundamental principles of
/// Object-Oriented Programming using practical Java examples.
/// Topics Covered:
/// - Encapsulation
/// - Inheritance
/// - Polymorphism
/// - Abstraction
///
/// @author Dip Narayan Chowdhury
/// @version 1.0
public class Day06OOPPrinciples {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("          DAY 6 - OOP PRINCIPLES");
        System.out.println("==========================================");


        // ==========================================
        // 1. ENCAPSULATION
        // ==========================================

        /*
         * Encapsulation means keeping data and the methods that
         * operate on that data together inside a class.
         *
         * It also allows us to control direct access to data.
         *
         * In this example, the balance field is private.
         * It can only be accessed through methods such as
         * deposit(), withdraw(), and getBalance().
         */

        System.out.println();
        System.out.println("1. Encapsulation");
        System.out.println("------------------------------------------");

        BankAccount account = new BankAccount(
                "ACC1001",
                "Dip",
                10000
        );

        System.out.println("Account holder = " + account.getAccountHolder());
        System.out.println("Account number = " + account.getAccountNumber());
        System.out.println("Initial balance = " + account.getBalance());

        account.deposit(5000);

        System.out.println("Balance after deposit = "
                + account.getBalance());

        account.withdraw(2000);

        System.out.println("Balance after withdrawal = "
                + account.getBalance());

        /*
         * The following would NOT be allowed:
         *
         * account.balance = 50000;
         *
         * because balance is private.
         */


        // ==========================================
        // 2. INHERITANCE
        // ==========================================

        /*
         * Inheritance allows one class to acquire properties and
         * behavior from another class.
         *
         * Parent class:
         * Animal
         *
         * Child class:
         * Dog
         *
         * Dog inherits the eat() method from Animal.
         */

        System.out.println();
        System.out.println("2. Inheritance");
        System.out.println("------------------------------------------");

        Dog dog = new Dog("Buddy");

        System.out.println("Dog name = " + dog.getName());

        dog.eat();
        dog.bark();


        // ==========================================
        // 3. POLYMORPHISM
        // ==========================================

        /*
         * Polymorphism means "many forms".
         *
         * A parent class reference can refer to an object of a
         * child class.
         *
         * The method that actually runs depends on the object.
         */

        System.out.println();
        System.out.println("3. Polymorphism");
        System.out.println("------------------------------------------");

        Animal animal;

        animal = new Dog("Rocky");

        animal.makeSound();

        animal = new Cat("Milo");

        animal.makeSound();

        /*
         * The same Animal reference is able to refer to different
         * child objects.
         *
         * This is called runtime polymorphism.
         */


        // ==========================================
        // 4. ABSTRACTION
        // ==========================================

        /*
         * Abstraction means hiding implementation details and
         * showing only the important functionality.
         *
         * An abstract class can contain abstract methods.
         *
         * The child class must provide the implementation of
         * the abstract method.
         */

        System.out.println();
        System.out.println("4. Abstraction");
        System.out.println("------------------------------------------");

        Payment payment;

        payment = new CreditCardPayment();

        payment.pay(5000);

        payment = new UpiPayment();

        payment.pay(2500);


        // ==========================================
        // 5. COMBINING OOP PRINCIPLES
        // ==========================================

        /*
         * Real applications normally use multiple OOP principles
         * together.
         *
         * This example combines inheritance, polymorphism,
         * abstraction, and encapsulation.
         */

        System.out.println();
        System.out.println("5. Combining OOP Principles");
        System.out.println("------------------------------------------");

        Employee employee = new Developer(
                "Amit",
                "Java Backend Developer"
        );

        employee.displayDetails();

        employee.work();


        // ==========================================
        // 6. DAY 6 SUMMARY
        // ==========================================

        System.out.println();
        System.out.println("==========================================");
        System.out.println("              DAY 6 SUMMARY");
        System.out.println("==========================================");

        System.out.println("Topics completed:");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. Abstraction");

        System.out.println();
        System.out.println("Day 6 completed!");
    }
}


// ==========================================
// BANK ACCOUNT CLASS
// ==========================================

/*
 * This class demonstrates encapsulation.
 */

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    BankAccount(
            String accountNumber,
            String accountHolder,
            double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    // ==========================================
    // GETTER METHODS
    // ==========================================

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    double getBalance() {
        return balance;
    }


    // ==========================================
    // DEPOSIT METHOD
    // ==========================================

    void deposit(double amount) {

        if (amount > 0) {
            balance += amount;

            System.out.println(
                    "Deposited = " + amount
            );
        } else {
            System.out.println(
                    "Deposit amount must be greater than zero."
            );
        }
    }


    // ==========================================
    // WITHDRAW METHOD
    // ==========================================

    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println(
                    "Withdrawn = " + amount
            );

        } else {
            System.out.println(
                    "Invalid withdrawal amount."
            );
        }
    }
}


// ==========================================
// ANIMAL CLASS
// ==========================================

/*
 * Animal is the parent class.
 */

class Animal {

    protected String name;


    Animal(String name) {

        this.name = name;
    }


    String getName() {

        return name;
    }


    void eat() {

        System.out.println(
                name + " is eating."
        );
    }


    void makeSound() {

        System.out.println(
                name + " makes an animal sound."
        );
    }
}


// ==========================================
// DOG CLASS
// ==========================================

/*
 * Dog inherits from Animal.
 *
 * The extends keyword is used for inheritance.
 */

class Dog extends Animal {

    Dog(String name) {

        super(name);
    }


    void bark() {

        System.out.println(
                name + " is barking."
        );
    }


    /*
     * This method overrides the makeSound() method
     * from the Animal class.
     */

    @Override
    void makeSound() {

        System.out.println(
                name + " says: Woof!"
        );
    }
}


// ==========================================
// CAT CLASS
// ==========================================

/*
 * Cat also inherits from Animal.
 */

class Cat extends Animal {

    Cat(String name) {

        super(name);
    }


    /*
     * Cat provides its own implementation of makeSound().
     */

    @Override
    void makeSound() {

        System.out.println(
                name + " says: Meow!"
        );
    }
}


// ==========================================
// PAYMENT ABSTRACT CLASS
// ==========================================

/*
 * This abstract class demonstrates abstraction.
 *
 * An abstract class cannot be directly instantiated.
 */

abstract class Payment {

    /*
     * Abstract method:
     * The child classes must provide the implementation.
     */

    abstract void pay(double amount);
}


// ==========================================
// CREDIT CARD PAYMENT
// ==========================================

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
                "Paid " + amount + " using Credit Card."
        );
    }
}


// ==========================================
// UPI PAYMENT
// ==========================================

class UpiPayment extends Payment {

    @Override
    void pay(double amount) {

        System.out.println(
                "Paid " + amount + " using UPI."
        );
    }
}


// ==========================================
// EMPLOYEE CLASS
// ==========================================

/*
 * Employee is used to demonstrate abstraction through
 * inheritance and method overriding.
 */

class Employee {

    protected String name;


    Employee(String name) {

        this.name = name;
    }


    void displayDetails() {

        System.out.println(
                "Employee name = " + name
        );
    }


    void work() {

        System.out.println(
                name + " is working."
        );
    }
}


// ==========================================
// DEVELOPER CLASS
// ==========================================

class Developer extends Employee {

    private String jobTitle;


    Developer(String name, String jobTitle) {

        super(name);

        this.jobTitle = jobTitle;
    }


    @Override
    void displayDetails() {

        System.out.println(
                "Developer name = " + name
        );

        System.out.println(
                "Job title = " + jobTitle
        );
    }


    @Override
    void work() {

        System.out.println(
                name + " is writing Java code."
        );
    }
}
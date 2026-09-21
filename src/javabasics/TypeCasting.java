package javabasics;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening)
        int number = 100;
        double implicit = number;

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + number);
        System.out.println("double value: " + implicit);


        // Explicit Type Casting (Narrowing)
        double price = 99.99;
        int explicit = (int) price;

        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + price);
        System.out.println("int value: " + explicit);
    }
}

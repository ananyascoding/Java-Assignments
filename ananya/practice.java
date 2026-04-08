package ananya;
// assignment 3a - method overloading & constructor overloading

/* 
import java.util.Scanner;

class Shapes{
    double length, breadth, radius;

    //constructor overloading

    Shapes(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Shapes(double radius){
        this.radius=radius;
    }

    Shapes(int side){
        this.length=side;
    }

    //method overloading
    double area(double l, double b){
        return(l*b);
    }

    int area(int side){
        return(side*side);
    }
}

public class practice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.println("3. Square");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();

                Shapes rect = new Shapes(l, b);
                System.out.println("Rectangle Area: " + rect.area(l, b));
                break;

            case 2:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                Shapes circle = new Shapes(r);
                System.out.println("Circle Area: " + circle.area(r));
                break;

            case 3:
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                Shapes square = new Shapes(side);
                System.out.println("Square Area: " + square.area(side));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();

    }
}

// assignment 3b - method overriding & inheritance

import java.util.Scanner;

// Parent Class
class Hillstations {
    void famousfood() {
        System.out.println("Famous food of hill station");
    }

    void famousfor() {
        System.out.println("Famous for scenic beauty");
    }
}

// Child Class 1
class Manali extends Hillstations {
    @Override // optional but good practice to indicate method overriding
    void famousfood() {
        System.out.println("Manali is famous for Siddu");
    }

    @Override
    void famousfor() {
        System.out.println("Manali is famous for Snow Mountains");
    }
}

// Child Class 2
class Mussoorie extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Mussoorie is famous for Momos");
    }

    @Override
    void famousfor() {
        System.out.println("Mussoorie is famous for Hills and Waterfalls");
    }
}

// Child Class 3
class Gulmarg extends Hillstations {
    @Override
    void famousfood() {
        System.out.println("Gulmarg is famous for Rogan Josh");
    }

    @Override
    void famousfor() {
        System.out.println("Gulmarg is famous for Skiing");
    }
}

// Driver Class
public class assignment3_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Hill Station:");
        System.out.println("1. Manali");
        System.out.println("2. Mussoorie");
        System.out.println("3. Gulmarg");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Hillstations hs; // Parent reference variable

        switch (choice) {
            case 1:
                hs = new Manali(); // actual object is of Manali class but reference is of Hillstations class
                break;
            case 2:
                hs = new Mussoorie();
                break;
            case 3:
                hs = new Gulmarg();
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("\n--- Details ---");
        hs.famousfood(); // Runtime Polymorphism
        hs.famousfor();

        sc.close();
    }
}

*/
// assignment 4 - method overriding & inheritance

import java.io.*;
import java.util.*;

class InvalidDataException extends Exception {
    InvalidDataException(String msg) {
        super(msg);
    }
}

public class practice {

    static final Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "customers.txt";

    public static void main(String args[]) {
        int choice;
        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Display Records");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        withdrawAmount();
                        break;
                    case 3:
                        depositAmount();
                        break;
                    case 4:
                        displayRecords();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 5);
    }

    static void createAccount() throws Exception {

    }

    static void withdrawAmount() throws Exception {

    }

    static void depositAmount() throws Exception {

    }

    static void displayRecords() throws Exception {

    }

}

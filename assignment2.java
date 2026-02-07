import java.util.Scanner;

// Base class
class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display salary
    public void DisplaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class 1
class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name, salary); // super calls parent constructor
    }

    // Calculate salary with 50% hike
    public void CalculateSalary() {
        salary = salary + (salary * 0.50);
    }
}

// Derived class 2
class InternEmployee extends Employee {

    public InternEmployee(String name, double salary) {
        super(name, salary);
    }

    // Calculate salary with 25% hike
    public void CalculateSalary() {
        salary = salary + (salary * 0.25);
    }
}

// Main class
public class assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full-Time Employee Name: ");
        String fname = sc.next();

        System.out.print("Enter Full-Time Employee Salary: ");
        double fsalary = sc.nextDouble();

        FullTimeEmployee f = new FullTimeEmployee(fname, fsalary);

        System.out.println("\nBefore Hike:");
        f.DisplaySalary();

        f.CalculateSalary();

        System.out.println("After 50% Hike:");
        f.DisplaySalary();

        System.out.println("\nEnter Intern Employee Name: ");
        String iname = sc.next();

        System.out.print("Enter Intern Salary: ");
        double isalary = sc.nextDouble();

        InternEmployee i = new InternEmployee(iname, isalary);

        System.out.println("\nBefore Hike:");
        i.DisplaySalary();

        i.CalculateSalary();

        System.out.println("After 25% Hike:");
        i.DisplaySalary();

        sc.close();
    }
}

import java.util.Scanner;

class Student {

    private String name;
    private int rollNo;
    private int mathMarks;
    private int scienceMarks;

    
    // Static variables to keep track of total marks and student count. Its shared across all instances of Student class.
    static int totalMathMarks = 0;
    static int totalScienceMarks = 0;
    static int studentCount = 0;

    // Constructor
    public Student(String name, int rollNo, int mathMarks, int scienceMarks) {
        this.name = name; // 'this' keyword is used to refer to the current instance of the class.
                          // It distinguishes between instance variables and parameters with the same name.
        this.rollNo = rollNo;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;

        totalMathMarks += mathMarks;
        totalScienceMarks += scienceMarks;
        studentCount++;
    }

    public double calculateAverage() {
        return (mathMarks + scienceMarks) / 2.0; // '2.0' to get result as a decimal value instead of integer
    }

    public char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 75)
            return 'A';
        else if (avg >= 50)
            return 'B';
        else
            return 'C';
    }

    public void displayStudent() {
        System.out.println("\nName: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }
    /*
     * // runs when java's garbage collector removes an object from memory.
     * 
     * @Override
     * protected void finalize() throws Throwable { // 'finalize' - destructor
     * concept, Throwable is the parent class of
     * // all errors and exceptions.
     * System.out.println("Object destroyed for student: " + name);
     * }
     */
}

public class assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Math Marks (out of 100): ");
            int math = sc.nextInt();

            System.out.print("Science Marks (out of 100): ");
            int science = sc.nextInt();

            students[i] = new Student(name, roll, math, science);
        }

        System.out.println("\n--- Student Grades ---");

        for (int i = 0; i < 10; i++) {
            students[i].displayStudent();
        }

        System.out.println("Average Math Marks: " +
                (Student.totalMathMarks / (double) Student.studentCount));

        System.out.println("Average Science Marks: " +
                (Student.totalScienceMarks / (double) Student.studentCount));

        sc.close();
    }
}

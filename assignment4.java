import java.io.*; // file handling
import java.util.*; // scanner, arraylist, etc.

// User-defined Exception
class InvalidDataException extends Exception {
    InvalidDataException(String msg) {
        super(msg); // sends message to Java’s default exception system
    }
}

// Main Class
public class assignment4 {
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "customers.txt"; //static allows access without creating an object, final makes it a constant

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Display Records");
            System.out.println("4. Exit");
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
                        displayRecords();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 4);
    }

    // Create Account
    static void createAccount() throws Exception { //throws Exception allows us to throw any exception from this method, which we catch in main
        System.out.print("Enter CID (1-20): ");
        int cid = sc.nextInt();

        if (cid < 1 || cid > 20) {
            throw new InvalidDataException("CID must be between 1 and 20");
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Amount: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            throw new InvalidDataException("Amount must be positive");
        }

        if (amt < 1000) {
            throw new InvalidDataException("Minimum balance is 1000");
        }

        // Write to file
        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(cid + " " + name + " " + amt + "\n");
        fw.close();

        System.out.println("Account created successfully!");
    }

    // Withdraw Amount
    static void withdrawAmount() throws Exception {
        System.out.print("Enter CID: ");
        int cid = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        double wamt = sc.nextDouble();

        if (wamt <= 0) {
            throw new InvalidDataException("Amount must be positive");
        }

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No records found!");
            return;
        }

        Scanner fr = new Scanner(file);
        String data = "";
        boolean found = false;

        while (fr.hasNext()) {
            int id = fr.nextInt();
            String name = fr.next();
            double amt = fr.nextDouble();

            if (id == cid) {
                found = true;

                if (wamt > amt) {
                    fr.close();
                    throw new InvalidDataException("Insufficient balance");
                }

                amt = amt - wamt;
                System.out.println("Withdrawal successful! Remaining: " + amt);
            }

            data += id + " " + name + " " + amt + "\n";
        }
        fr.close();

        if (!found) {
            throw new InvalidDataException("Customer not found");
        }

        // Rewrite file
        FileWriter fw = new FileWriter(FILE_NAME);
        fw.write(data);
        fw.close();
    }

    // Display Records
    static void displayRecords() throws Exception {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No records found!");
            return;
        }

        Scanner fr = new Scanner(file);

        System.out.println("\nCID  Name  Amount");
        while (fr.hasNext()) {
            System.out.println(
                    fr.nextInt() + "   " +
                            fr.next() + "   " +
                            fr.nextDouble());
        }

        fr.close();
    }
}
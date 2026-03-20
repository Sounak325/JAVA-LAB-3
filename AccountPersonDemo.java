import java.util.Scanner;
class Account {
    int acc_no;
    double balance;
    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Derived class
class Person extends Account {
    String name;
    String aadhar_no;

    // Method to take input (extends Account input)
    void input(Scanner sc) {
        super.input(sc); // call Account input
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    // Overridden display method
    @Override
    void disp() {
        super.disp(); // show account details
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

// Driver class
public class AccountPersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of 3 persons
        Person[] persons = new Person[3];

        // Input details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        // Display details
        System.out.println("\n--- Displaying Details of Persons ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1) + " Details:");
            persons[i].disp();
        }

        sc.close();
    }
}


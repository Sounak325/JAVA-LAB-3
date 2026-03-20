import java.util.Scanner;

// Base class for 2D sheet
class Plastic2D {
    double length;
    double breadth;
    static final int COST_PER_SQFT = 40;

    // Constructor
    Plastic2D(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to calculate cost of sheet
    double calculateCost() {
        double area = length * breadth;
        return area * COST_PER_SQFT;
    }
}

// Derived class for 3D box
class Plastic3D extends Plastic2D {
    double height;
    static final int COST_PER_CUFT = 60;

    // Constructor
    Plastic3D(double l, double b, double h) {
        super(l, b); // call parent constructor
        height = h;
    }

    // Method to calculate cost of box
    double calculateCost() {
        double volume = length * breadth * height;
        return volume * COST_PER_CUFT;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for 2D sheet
        System.out.print("Enter length of sheet: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of sheet: ");
        double b = sc.nextDouble();

        Plastic2D sheet = new Plastic2D(l, b);
        System.out.println("Cost of 2D plastic sheet: Rs " + sheet.calculateCost());

        // Input for 3D box
        System.out.print("Enter length of box: ");
        double l1 = sc.nextDouble();
        System.out.print("Enter breadth of box: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter height of box: ");
        double h1 = sc.nextDouble();

        Plastic3D box = new Plastic3D(l1, b1, h1);
        System.out.println("Cost of 3D plastic box: Rs " + box.calculateCost());

        sc.close();
    }
}


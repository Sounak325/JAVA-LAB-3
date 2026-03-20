import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor called.");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

// Derived class from Plate
class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w); // call Plate constructor
        height = h;
        System.out.println("Box constructor called.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height);
    }
}

// Derived class from Box
class WoodBox extends Box {
    double thickness;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h); // call Box constructor
        thickness = t;
        System.out.println("WoodBox constructor called.");
        System.out.println("Length = " + length + ", Width = " + width + ", Height = " + height + ", Thickness = " + thickness);
    }
}
public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        // Create WoodBox object
        WoodBox wb = new WoodBox(l, w, h, t);

        sc.close();
    }
}

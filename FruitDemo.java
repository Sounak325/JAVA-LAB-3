// Base class
class Fruit {
    void show() {
        System.out.println("This is the Fruit class show() method.");
    }
}

// Derived class Banana
class Banana extends Fruit {
    void show() {
        System.out.println("This is the Banana class show() method.");
    }
}

// Derived class Cherry
class Cherry extends Fruit {
    void show() {
        System.out.println("This is the Cherry class show() method.");
    }
}

public class FruitDemo {
    public static void main(String[] args) {
        // Create objects of each class
        Fruit f = new Fruit();
        Banana b = new Banana();
        Cherry c = new Cherry();
        f.show();
        b.show();
        c.show();
    }
}

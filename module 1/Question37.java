// Question 37: Write a program to create a class with multiple constructors (constructor overloading).
class Boxx {
    int length, width;

    Boxx() { length = 1; width = 1; }

    Boxx(int side) { length = side; width = side; }

    Boxx(int l, int w) { length = l; width = w; }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class Question37 {
    public static void main(String[] args) {
        Boxx b1 = new Boxx();
        Boxx b2 = new Boxx(5);
        Boxx b3 = new Boxx(4, 6);
        b1.display(); b2.display(); b3.display();
    }
}

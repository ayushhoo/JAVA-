// Question 46: Create a program to show run-time polymorphism using dynamic method dispatch.
class Base {
    void show() { System.out.println("Base show"); }
}

class Derivedd extends Base {
    void show() { System.out.println("Derived show"); }
}

public class Question46 {
    public static void main(String[] args) {
        Base b = new Derivedd();
        b.show();
    }
}

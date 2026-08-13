// Question 43: Create a program to show method overriding and the use of super to call the parent class method.
class Par {
    void display() { System.out.println("Parent display"); }
}

class Chi extends Par {
    void display() {
        super.display();
        System.out.println("Child display");
    }
}

public class Question43 {
    public static void main(String[] args) {
        Chi c = new Chi();
        c.display();
    }
}

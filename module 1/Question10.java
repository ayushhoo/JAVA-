// Question 10: Show an example of the final keyword for variables, methods, and classes.
final class FinalClass {
    final int VALUE = 100;

    final void display() {
        System.out.println("Final method, VALUE = " + VALUE);
    }
}

public class Question10 {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.display();
    }
}

// Question 45: Write a program to demonstrate final classes and methods.
final class FinalClass2 {
    final void show() {
        System.out.println("Final class and method");
    }
}

public class Question45 {
    public static void main(String[] args) {
        FinalClass2 f = new FinalClass2();
        f.show();
    }
}

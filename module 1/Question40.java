// Question 40: Write a program to demonstrate the use of static and non-static methods.
class Demo {
    static int count = 0;
    int instanceVar = 0;

    static void staticMethod() {
        count++;
        System.out.println("Static method called. count = " + count);
    }

    void nonStaticMethod() {
        instanceVar++;
        System.out.println("Non-static method called. instanceVar = " + instanceVar);
    }
}

public class Question40 {
    public static void main(String[] args) {
        Demo.staticMethod();
        Demo d = new Demo();
        d.nonStaticMethod();
        d.nonStaticMethod();
    }
}

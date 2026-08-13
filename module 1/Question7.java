// Question 7: Write a Java program to showcase the use of this and super keywords.
class Parentt {
    int x = 10;

    Parentt() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent show: x = " + x);
    }
}

class Childd extends Parentt {
    int x = 20;

    Childd() {
        super();
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println("Child show: x = " + x);
        System.out.println("Using super: x = " + super.x);
        super.show();
    }
}

public class Question7 {
    public static void main(String[] args) {
        Childd c = new Childd();
        c.show();
    }
}

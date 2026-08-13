// Question 42: Write a program to demonstrate multilevel inheritance in Java.
class Grandparent {
    void showGP() { System.out.println("Grandparent"); }
}

class Parenttt extends Grandparent {
    void showP() { System.out.println("Parent"); }
}

class Childdd extends Parenttt {
    void showC() { System.out.println("Child"); }
}

public class Question42 {
    public static void main(String[] args) {
        Childdd c = new Childdd();
        c.showGP();
        c.showP();
        c.showC();
    }
}

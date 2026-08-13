// Question 8: Demonstrate the concept of constructors in OOP with a program.
class Employeee {
    String name;
    int id;

    Employeee() {
        this("Unknown", 0);
        System.out.println("Default constructor");
    }

    Employeee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Parameterized: " + name + ", " + id);
    }
}

public class Question8 {
    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee("ayush", 101);
    }
}

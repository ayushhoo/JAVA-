// Question 38: Implement a program to demonstrate the use of a copy constructor in Java.
class Persn {
    String name;
    int age;

    Persn(String n, int a) { name = n; age = a; }

    Persn(Persn p) { name = p.name; age = p.age; }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Question38 {
    public static void main(String[] args) {
        Persn p1 = new Persn("ayush", 25);
        Persn p2 = new Persn(p1);
        p2.display();
    }
}

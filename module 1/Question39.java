// Question 39: Create a program that initializes class fields using a parameterized constructor.
class Bookk {
    String title;
    String author;

    Bookk(String t, String a) {
        title = t;
        author = a;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Question39 {
    public static void main(String[] args) {
        Bookk b = new Bookk("Java Basics", "ayush");
        b.display();
    }
}

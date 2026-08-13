// Question 1: Write a program to demonstrate encapsulation in Java.
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Question1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("ayush");
        s.setAge(20);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

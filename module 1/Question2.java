// Question 2: Create a program showing the use of inheritance and polymorphism.
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat meows");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.speak();
        a = new Cat();
        a.speak();
    }
}

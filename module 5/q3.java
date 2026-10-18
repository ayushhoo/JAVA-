// Section: Java Annotations and Its Types
// Question: What is the difference between @Override and @Deprecated annotations?
Question: What is the difference between @Override and @Deprecated annotations?
Answer:
@Override is used on a method to indicate that it is meant to override a method from its parent class. It is a compile-time check: if the method does not actually match a parent method, the compiler will report an error. @Deprecated is used to mark a method, class, or field as outdated. It does not cause an error; instead, the compiler shows a warning whenever the deprecated element is used, telling developers to move to a newer alternative.

Example:
class Animal {
    // This method is the original implementation.
    void speak() {
        System.out.println("Animal sound");
    }

    // This method is outdated and replaced by speak().
    @Deprecated
    void makeSound() {
        speak();
    }
}

class Dog extends Animal {
    // @Override checks that this method correctly overrides Animal.speak().
    @Override
    void speak() {
        System.out.println("Woof");
    }
}

public class DeprecatedDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        dog.makeSound(); // This call produces a deprecation warning.
    }
}
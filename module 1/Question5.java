// Question 5: Create a class hierarchy for animals that demonstrates polymorphism.
class Animall {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dogg extends Animall {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Birdd extends Animall {
    void makeSound() {
        System.out.println("Chirp");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Animall a;
        a = new Dogg();
        a.makeSound();
        a = new Birdd();
        a.makeSound();
    }
}

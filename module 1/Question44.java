// Question 44: Implement an abstract class and override its methods in a subclass.
abstract class Vehiclee {
    abstract void start();
    abstract void stop();
}

class Carr extends Vehiclee {
    void start() { System.out.println("Car starts"); }
    void stop() { System.out.println("Car stops"); }
}

public class Question44 {
    public static void main(String[] args) {
        Vehiclee v = new Carr();
        v.start();
        v.stop();
    }
}

/*
 * Question:
 * How do bounded type parameters work in generics?
 * Write a generic class that accepts only subclasses of Number.
 */

/**
 * Explanation:
 * Bounded type parameters restrict the types that can be used as type arguments in a generic class.
 * By using the 'extends' keyword, we can specify an upper bound.
 * For example, <T extends Number> means T must be Number or any subclass of Number (like Integer, Double, Float).
 * This allows the generic class to use methods defined in the bound class (like doubleValue() from Number).
 */

class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public double doubleValue() {
        // Since T extends Number, we can call Number methods
        return value.doubleValue();
    }

    public void display() {
        System.out.println("Value: " + value + " | As Double: " + doubleValue());
    }

    public static void main(String[] args) {
        // Valid: Integer is a subclass of Number
        NumberBox<Integer> intBox = new NumberBox<>(123);
        intBox.display();

        // Valid: Double is a subclass of Number
        NumberBox<Double> doubleBox = new NumberBox<>(45.67);
        doubleBox.display();

        // Invalid: String is NOT a subclass of Number.
        // The following line would cause a compile-time error:
        // NumberBox<String> strBox = new NumberBox<>("Hello");
    }
}

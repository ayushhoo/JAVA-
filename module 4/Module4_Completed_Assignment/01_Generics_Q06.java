/*
 * Question:
 * Create a user-defined generic class Box<T> with methods addItem(T item) and getItem().
 * Demonstrate its usage with String and Integer types.
 */

class Box<T> {
    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public static void main(String[] args) {
        // Box for Integers
        Box<Integer> intBox = new Box<>();
        intBox.addItem(100);
        System.out.println("Integer Box contains: " + intBox.getItem());

        // Box for Strings
        Box<String> strBox = new Box<>();
        strBox.addItem("Generic Java Box");
        System.out.println("String Box contains: " + strBox.getItem());
    }
}

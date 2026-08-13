// Question 9: Explain and implement the concept of access modifiers in Java.
public class Question9 {
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }

    public static void main(String[] args) {
        Question9 obj = new Question9();
        obj.display();
    }
}

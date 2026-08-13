// Question 13: Write a program to declare variables of all primitive data types in Java and print their default values.
class Defaults {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
}

public class Question13 {
    public static void main(String[] args) {
        Defaults d = new Defaults();
        System.out.println("byte: " + d.b);
        System.out.println("short: " + d.s);
        System.out.println("int: " + d.i);
        System.out.println("long: " + d.l);
        System.out.println("float: " + d.f);
        System.out.println("double: " + d.d);
        System.out.println("char: [" + d.c + "]");
        System.out.println("boolean: " + d.bool);
    }
}

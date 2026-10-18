// Section: Java Annotations and Its Types
// Question: How does the @SuppressWarnings annotation work? Provide an example.
Question: How does the @SuppressWarnings annotation work? Provide an example.
Answer:
@SuppressWarnings is a built-in annotation that tells the compiler to suppress specific warnings for the element it is applied to. It takes a string array as its value, and you list the identifiers of the warnings you want to hide, such as "unchecked", "deprecation", "unused", or "rawtypes". It is useful when you know a warning is harmless, for example when using older collection classes that do not use generics.

Example:
import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // The next line would normally produce an unchecked warning.
        List list = new ArrayList();
        list.add("Hello");
        System.out.println(list.get(0));
    }
}
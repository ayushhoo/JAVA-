// Section: Creating Custom Annotations
// Question: Write a program to demonstrate how custom annotations can be used with reflection.
Question: Write a program to demonstrate how custom annotations can be used with reflection.
Answer:
This program shows how to scan a class for custom annotations and perform actions based on those annotations. It uses reflection to read the @AuthorInfo annotation.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface AuthorInfo {
    String author();
    double version();
}

@AuthorInfo(author = "Alice", version = 2.5)
class DemoClass {
}

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        // Get the class object
        Class<?> cls = DemoClass.class;

        // Check if the class has the annotation
        if (cls.isAnnotationPresent(AuthorInfo.class)) {
            // Get the annotation instance
            AuthorInfo info = cls.getAnnotation(AuthorInfo.class);
            // Use the annotation values
            System.out.println("Class: " + cls.getSimpleName());
            System.out.println("Author: " + info.author());
            System.out.println("Version: " + info.version());
        }
    }
}
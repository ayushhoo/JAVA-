// Section: Java Annotations and Its Types
// Question: How do you create a custom annotation in Java?
Question: How do you create a custom annotation in Java?
Answer:
To create a custom annotation in Java, you use the @interface keyword followed by the annotation name. Each element inside the annotation is declared as a method signature, with an optional default value. You can then apply the annotation to classes, methods, or fields. The @Target meta-annotation restricts where the annotation can be used, and @Retention specifies whether it is available at runtime.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation.
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
    int version() default 1;
}

// Apply the custom annotation to a class.
@Author(name = "Ayush", version = 2)
class AnnotatedClass {
    // class body
}

public class CustomAnnotationDemo {
    public static void main(String[] args) {
        // At compile time the annotation is attached to the class.
        System.out.println("Annotation demo");
    }
}
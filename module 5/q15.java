// Section: Java Annotations and Its Types
// Question: Can annotations be inherited? If yes, how?
Question: Can annotations be inherited? If yes, how?
Answer:
Yes, annotations can be inherited. This happens when a subclass inherits an annotation from a parent class. By default, annotations are not inherited, but you can make them inherited by adding the @Inherited meta-annotation to the annotation definition. Only class annotations are inherited; annotations on methods and fields are not inherited.

Example:
import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAnnotation {
    String value();
}

@BaseAnnotation("Parent")
class Parent {
}

class Child extends Parent {
}

public class InheritedDemo {
    public static void main(String[] args) {
        // Both Parent and Child have the annotation at runtime.
        System.out.println("Annotation inherited from parent");
    }
}
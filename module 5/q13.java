// Section: Java Annotations and Its Types
// Question: What is the difference between marker annotations and single-value annotations?
Question: What is the difference between marker annotations and single-value annotations?
Answer:
A marker annotation has no elements; it is simply @interface Marker {}. It just indicates presence or absence. A single-value annotation has one element with a name, typically used with the annotation type attribute. In the latter, you can use the shorthand @Single("value") without specifying the element name if the element is named "value". The single-value annotation can hold a value.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Marker annotation: no elements.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Marker {
}

// Single-value annotation: one element named "value".
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface SingleValue {
    String value();
}

public class AnnotationTypesDemo {
    @Marker
    public void mark() {
        System.out.println("This method is marked");
    }

    @SingleValue("important")
    public void process() {
        System.out.println("Process something");
    }
}
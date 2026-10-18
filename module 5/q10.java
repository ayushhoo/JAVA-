// Section: Java Annotations and Its Types
// Question: What is the use of the @Target meta-annotation?
Question: What is the use of the @Target meta-annotation?
Answer:
The @Target meta-annotation configures which program elements can be annotated with the custom annotation. Each element in the @Target value must be an ElementType constant. For example, applying @Target(ElementType.METHOD) allows the annotation to be used only on methods, while @Target(ElementType.FIELD) allows it on fields. You can combine multiple ElementTypes using an array.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation can be applied only to fields and methods.
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Loggable {
}

class Example {
    // Allowed: annotation on a field.
    @Loggable
    private int id;

    // Allowed: annotation on a method.
    @Loggable
    public void compute() {
        System.out.println("Compute");
    }

    // The following would be a compile error: @Loggable on a class.
    // @Loggable
    // class Bad { }
}
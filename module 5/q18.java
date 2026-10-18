// Section: Java Annotations and Its Types
// Question: What are repeatable annotations in Java? Provide an example.
Question: What are repeatable annotations in Java? Provide an example.
Answer:
Repeatable annotations allow the same annotation to be applied multiple times to the same program element. Before Java 8, you could not have the same annotation applied more than once. Now, you can use the @Repeatable meta-annotation along with the containing annotation to support repetition. For example, you can have a single @Author annotation that can appear multiple times on a class.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String value();
}

// Indicates that Author is repeatable
@Repeatable(Authors.class)
@interface Authors {
    Author[] value();
}

// The following would compile:
// @Author("Alice")
// @Author("Bob")
// class Book {}

// But using @Repeatable:
@Author("Alice")
@Author("Bob")
class Book {
}
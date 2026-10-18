// Section: Java Annotations and Its Types
// Question: What is the use of default values in annotations? Provide an example.
Question: What is the use of default values in annotations? Provide an example.
Answer:
Default values make an annotation element optional. If the annotation is used without specifying a value for that element, the default value is used instead. This allows more flexible usage of the annotation across different contexts.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Config {
    String name();
    int version() default 1; // Default value if not provided
    String author() default "Unknown";
}

@Config(name = "DemoApp", author = "John")
class App {
    // version will be 1 because not specified
}

@Config(name = "DemoApp", version = 2, author = "Jane")
class AppWithVersion {
    // version will be 2 as specified
}
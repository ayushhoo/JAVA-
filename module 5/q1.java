// Section: Java Annotations and Its Types
// Question: What is the purpose of annotations in Java?
Question: What is the purpose of annotations in Java?
Answer:
Annotations in Java are a form of metadata that provide extra information about a program element such as a class, method, field, or parameter. They do not change the behavior of the program directly, but they can be read by tools or by the program itself at runtime to decide what to do. Annotations help reduce the amount of configuration code that developers need to write. For example, instead of writing a large XML configuration file, you can simply place an annotation on a method to tell a framework that the method should run before a test.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation marks a method as a test method.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test {
}

public class PurposeDemo {
    // The annotation tells a tool that this method is a test.
    @Test
    public void sampleTest() {
        System.out.println("Running the test");
    }
}
// Section: Java Annotations and Its Types
// Question: How can you use reflection to process annotations in Java?
Question: How can you use reflection to process annotations in Java?
Answer:
You can use reflection to read annotations from classes, methods, fields, etc. The process involves using methods like getAnnotations(), getAnnotation(), isAnnotationPresent(), and the Annotation interface's methods to retrieve the values defined in the annotation. This allows you to write code that behaves differently based on the presence of annotations at runtime.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Log {
    String value();
}

public class ReflectionDemo {
    @Log("database")
    public void fetchData() {
        System.out.println("Fetching data");
    }

    public static void main(String[] args) throws Exception {
        // Get the Method object for fetchData
        Method method = ReflectionDemo.class.getMethod("fetchData");
        // Check if the method has the @Log annotation
        if (method.isAnnotationPresent(Log.class)) {
            // Get the annotation instance
            Log annotation = method.getAnnotation(Log.class);
            // Read the value from the annotation
            System.out.println("Annotation value: " + annotation.value());
        }
    }
}
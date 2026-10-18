// Section: Creating Custom Annotations
// Question: What happens if a custom annotation is not annotated with @Retention?
Question: What happens if a custom annotation is not annotated with @Retention?
Answer:
If a custom annotation is not explicitly annotated with @Retention, the default retention policy is CLASS, meaning the annotation is stored in the .class file but not available to the runtime via reflection. It cannot be read at runtime unless accessed via compile-time tools or by loading the class file and examining the attribute.

Example:
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@interface NoRetentionDemo {
    String value();
}

class Example {
    @NoRetentionDemo(value = "test")
    public void demo() {
        System.out.println("Annotation with default retention (CLASS)");
    }

    public static void main(String[] args) throws Exception {
        // At runtime the annotation is NOT available.
        Method method = Example.class.getMethod("demo");
        if (method.isAnnotationPresent(NoRetentionDemo.class)) {
            System.out.println("Annotation found at runtime (unexpected)");
        } else {
            System.out.println("Annotation not found at runtime (expected)");
        }
    }
}
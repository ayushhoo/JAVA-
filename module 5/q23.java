// Section: Creating Custom Annotations
// Question: How do you process custom annotations using Java's Annotation interface?
Question: How do you process custom annotations using Java's Annotation interface?
Answer:
You use the Annotation interface to represent an annotation at runtime. Methods include getType(), getValue(), and getDefaultValue(). By invoking getType(), you can retrieve the class of the annotation and then call its methods to get values. This allows reading custom annotation elements.

Example:
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Log {
    String value();
}

class Logger {
    public static void processAnnotation() {
        Method method = Logger.class.getMethod("processAnnotation");
        // Get annotation present
        if (method.isAnnotationPresent(Log.class)) {
            Annotation ann = method.getAnnotation(Log.class);
            // Get the annotation type
            Class<? extends Annotation> type = method.getAnnotation(Log.class).annotationType();
            // Get value
            String val = method.getAnnotation(Log.class).value();
            System.out.println("Annotation: " + type.getSimpleName() + " value: " + val);
        }
    }

    public static void main(String[] args) {
        processAnnotation();
    }
}
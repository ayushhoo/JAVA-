// Section: Creating Custom Annotations
// Question: What are the restrictions on defining annotation methods?
Question: What are the restrictions on defining annotation methods?
Answer:
Annotation methods have the following restrictions:
- They must return a primitive type (byte, short, int, long, float, double, boolean, char), String, Class, Enum, Annotation, or an array of those.
- They must not throw any checked exceptions.
- They must not take parameters.
- They must have no body.
- They must end with a semicolon.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RestrictedAnnotation {
    // Valid: returns int with default value
    int number() default 0;

    // Valid: returns String
    String description() default "";

    // Invalid (cannot be defined in annotation):
    // void invalidMethod() { ... } // No body allowed

    // Invalid (cannot have parameters):
    // void takesParam(int x) default 0; // Parameters not allowed

    // Invalid (cannot throw checked exceptions):
    // String throwsException() throws Exception; // No checked exceptions
}
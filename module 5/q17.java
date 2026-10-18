// Section: Java Annotations and Its Types
// Question: Write a custom annotation to validate the length of a string.
Question: Write a custom annotation to validate the length of a string.
Answer:
A custom annotation for validating string length can be used on fields to enforce minimum and maximum length constraints. It can have elements min and max, and a method for validation. The validation logic can be placed in a validation method (though the annotation itself only defines the constraints).

Example:
import java.lang.annotation.*;
import java.lang.reflect.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Length {
    int min() default 0;
    int max() default Integer.MAX_VALUE;
}

class ValidatedClass {
    @Length(min = 3, max = 10)
    private String name;

    public ValidatedClass(String name) {
        this.name = name;
    }

    public void validate() throws IllegalArgumentException {
        // Validation logic
        if (name.length() < getLengthAnnotation().min()) {
            throw new IllegalArgumentException("Name too short");
        }
        if (name.length() > getLengthAnnotation().max()) {
            throw new IllegalArgumentException("Name too long");
        }
    }

    private Length getLengthAnnotation() {
        // Retrieve annotation via reflection
        Length ann = this.getClass().getDeclaredField("name").getAnnotation(Length.class);
        return ann;
    }
}

public class LengthValidationDemo {
    public static void main(String[] args) {
        try {
            ValidatedClass obj = new ValidatedClass("John");
            obj.validate();
            System.out.println("Valid: " + obj.name);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid: " + e.getMessage());
        }
    }
}
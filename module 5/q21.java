// Section: Creating Custom Annotations
// Question: Create a custom annotation @MinLength to validate the minimum length of a string in a Java class.
Question: Create a custom annotation @MinLength to validate the minimum length of a string in a Java class.
Answer:
The @MinLength annotation defines the minimum length a string must have. It can be used on fields, parameters, or methods, and includes a validation method that can be called at runtime to ensure the constraint is met.

Example:
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface MinLength {
    int value();
}

class ValidatedString {
    @MinLength(value = 5)
    private String name;

    public ValidatedString(String name) {
        this.name = name;
    }

    public void validate() throws IllegalArgumentException {
        MinLength ann = getClass().getDeclaredField("name").getAnnotation(MinLength.class);
        if (ann != null && name.length() < ann.value()) {
            throw new IllegalArgumentException("String is too short. Minimum length: " + ann.value());
        }
    }
}

public class MinLengthDemo {
    public static void main(String[] args) {
        try {
            ValidatedString vs1 = new ValidatedString("Tom");
            vs1.validate();
            System.out.println("Valid: " + vs1.name);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            ValidatedString vs2 = new ValidatedString("Alice");
            vs2.validate();
            System.out.println("Valid: " + vs2.name);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
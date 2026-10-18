// Section: Practical Exercise Suggestions
// Question: Create a Maven project that uses annotations to validate user input.
Question: Create a Maven project that uses annotations to validate user input.
Answer:
This practical exercise involves creating a Maven project with a custom annotation (e.g., @NotNull) and an validation method using reflection to check fields before processing.

Example:
// pom.xml (minimal)
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>validation-demo</artifactId>
    <version>1.0.0</version>
</project>

// Custom annotation
import java.lang.annotation.*;
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface NotNull {
}

// User class
class User {
    @NotNull
    private String name;

    @NotNull
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

// Simple validator using reflection
import java.lang.reflect.*;
class Validator {
    public static boolean validate(Object obj) {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) == null) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
    }
}

public class ValidationApp {
    public static void main(String[] args) {
        User validUser = new User("Alice", "alice@example.com");
        User invalidUser = new User(null, "bob@example.com");

        System.out.println("Valid user: " + Validator.validate(validUser));
        System.out.println("Invalid user: " + Validator.validate(invalidUser));
    }
}
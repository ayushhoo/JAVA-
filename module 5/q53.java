// Section: Practical Exercise Suggestions
// Question: Develop a simple core Java application that uses custom annotations and Maven to manage dependencies.
Question: Develop a simple core Java application that uses custom annotations and Maven to manage dependencies.
Answer:
This application combines a custom @Todo annotation and Maven's dependency management (JUnit for testing) to build a small annotated app.

Example:
// pom.xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>todo-app</artifactId>
    <version>1.0.0</version>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>

// Custom annotation
import java.lang.annotation.*;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String value();
}

class TaskRunner {
    @Todo("Implement login")
    public void login() {
        System.out.println("Login feature pending");
    }

    @Todo("Implement logout")
    public void logout() {
        System.out.println("Logout feature pending");
    }

    public static void main(String[] args) throws Exception {
        for (Method m : TaskRunner.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println("Pending: " + todo.value());
            }
        }
    }
}
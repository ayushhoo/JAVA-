// Section: Creating Custom Annotations
// Question: Can annotations take arrays as parameters? Provide an example.
Question: Can annotations take arrays as parameters? Provide an example.
Answer:
Yes, annotation methods can return arrays. The syntax uses the array notation (e.g., String[]). You can define an annotation with an array element and then provide an array when using the annotation.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Authors {
    String[] authors(); // Array of strings
    int[] versions() default {1, 2}; // Array with default
}

@Authors(authors = {"Alice", "Bob"}, versions = {1, 2})
class Book {
    public static void main(String[] args) {
        Authors ann = Book.class.getAnnotation(Authors.class);
        System.out.println("Authors: ");
        for (String author : ann.authors()) {
            System.out.println("  " + author);
        }
        System.out.println("Versions: ");
        for (int v : ann.versions()) {
            System.out.println("  " + v);
        }
    }
}
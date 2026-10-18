// Section: Creating Custom Annotations
// Question: Write a custom annotation to specify the author and version of a class.
Question: Write a custom annotation to specify the author and version of a class.
Answer:
This custom annotation can be applied to a class to specify the author name and version number. It provides metadata that can be used for documentation, tooling, or runtime reflection.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface AuthorInfo {
    String author();
    double version();
}

@AuthorInfo(author = "John", version = 1.0)
class Software {
    public static void main(String[] args) {
        System.out.println("Software developed by " + getAuthorInfo().author() + " version " + getAuthorInfo().version());
    }

    static AuthorInfo getAuthorInfo() {
        return Software.class.getAnnotation(AuthorInfo.class);
    }
}
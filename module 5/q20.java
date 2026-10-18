// Section: Java Annotations and Its Types
// Question: How are annotations processed during the compilation phase?
Question: How are annotations processed during the compilation phase?
Answer:
During compilation, the Java compiler reads annotations as metadata. It does not require the annotation classes to be present at compile time, only that they exist. The compiler can generate warnings or compile-time errors based on custom rules (using tools like javac -Xlint). Annotations can be used for compile-time processing tools (such as APT) that generate additional source files. The annotations are stored in the class file in a standard format (the .class file contains attribute entries for each annotation).

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE) // This annotation is used only for compile-time processing
@interface Generate {
    String name();
}

@Generate(name = "Helper")
class SourceGen {
    // This annotation is visible during compilation and can be processed by annotation processors.
}

// The @Retention(SOURCE) annotation indicates that this annotation is not stored in the class file after compilation.
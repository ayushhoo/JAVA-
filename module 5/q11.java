// Section: Java Annotations and Its Types
// Question: Explain the difference between @Retention with RUNTIME and CLASS.
Question: Explain the difference between @Retention with RUNTIME and CLASS.
Answer:
The @Retention meta-annotation takes a RetentionPolicy value. With RUNTIME, the annotation is stored in the .class file and is available to the Java runtime via reflection, meaning your program can read it during execution. With CLASS, the annotation is stored in the .class file but is not available at runtime; it is mainly for compile-time tools. Most annotations used for metadata that needs runtime processing use RUNTIME retention.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
// Annotation used only during compilation, not available at runtime.
@Retention(RetentionPolicy.CLASS)
@interface CompileOnly {
}

@Target(ElementType.METHOD)
// Annotation available at runtime.
@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeNote {
    String value();
}
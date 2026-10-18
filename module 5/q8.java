// Section: Java Annotations and Its Types
// Question: What is the retention policy in annotations? Explain the types of retention policies.
Question: What is the retention policy in annotations? Explain the types of retention policies.
Answer:
The retention policy determines how long an annotation is retained by the Java compiler. It is set using the @Retention meta-annotation and has three values:
1. SOURCE - The annotation is discarded by the compiler after the compilation phase. It is not present in the class file and cannot be read at runtime. It is useful only for compile-time tools.
2. CLASS - The annotation is kept in the class file but is not available to the JVM at runtime. By default, custom annotations use CLASS retention.
3. RUNTIME - The annotation is kept in the class file and is available at runtime through the reflection API. This is needed when you want to read the annotation while the program is running.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// This annotation is kept until runtime so it can be read by reflection.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeNote {
    String value();
}
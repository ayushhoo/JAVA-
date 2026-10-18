// Section: Java Annotations and Its Types
// Question: What are meta-annotations in Java?
Question: What are meta-annotations in Java?
Answer:
Meta-annotations are annotations that are applied to other annotations. They are used to configure how an annotation behaves, for example where the annotation can be used, how long it is kept, and whether it appears in the documentation. In Java, the most common meta-annotations are @Target, @Retention, and @Documented. By using meta-annotations on your own custom annotation, you control its scope and lifetime.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target and @Retention are meta-annotations that configure this annotation.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "default";
}
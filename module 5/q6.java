// Section: Java Annotations and Its Types
// Question: List the meta-annotations available in Java and describe their purposes.
Question: List the meta-annotations available in Java and describe their purposes.
Answer:
The main meta-annotations in Java are:
1. @Target - Specifies the program elements to which the annotation can be applied, such as TYPE (class), METHOD, FIELD, PARAMETER, or CONSTRUCTOR. It restricts where the annotation may appear.
2. @Retention - Specifies how long the annotation is kept. It can be SOURCE (discarded after compilation), CLASS (kept in the class file but not available at runtime), or RUNTIME (kept and available at runtime through reflection).
3. @Documented - Indicates that the annotation should appear in the generated documentation (Javadoc) for the elements it marks.
4. @Inherited - Indicates that the annotation is inherited by subclasses. If a class has an annotation marked @Inherited, its subclasses will also have that annotation.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface Description {
    String value();
}
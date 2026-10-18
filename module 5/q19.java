// Section: Java Annotations and Its Types
// Question: How does the @Documented meta-annotation work?
Question: How does the @Documented meta-annotation work?
Answer:
The @Documented meta-annotation indicates that the annotation should be included in the generated JavaDoc documentation for the elements it annotates. When a custom annotation is marked with @Documented, the annotation's name and details appear in the Javadoc output alongside the annotated element. It does not affect runtime behavior; it only influences the documentation tool.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface DeprecatedFeature {
    String reason();
}

@DeprecatedFeature(reason = "Use newAPI")
class OldApi {
    @DeprecatedFeature(reason = "Avoid")
    void oldMethod() {
        System.out.println("This is deprecated");
    }
}

public class DocumentedDemo {
    public static void main(String[] args) {
        System.out.println("Annotation marked with @Documented appears in Javadoc");
    }
}
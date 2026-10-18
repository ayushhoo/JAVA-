// Section: Creating Custom Annotations
// Question: Can a custom annotation extend another annotation? Why or why not?
Question: Can a custom annotation extend another annotation? Why or why not?
Answer:
Yes, a custom annotation can extend another annotation, but there is a restriction: it can only extend annotations that are meta-annotations (@Target, @Retention, @Documented, @Inherited, @Repeatable). It cannot extend arbitrary annotations that are meant for program elements like fields or methods. This is because the extended annotation must be a meta-annotation, not a typical element-specific annotation.

Example:
import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface BaseAnnotation {
    String base() default "base";
}

// @BaseAnnotation is a regular annotation, cannot be extended by another element-specific annotation.
// But a meta-annotation can extend @BaseAnnotation if @BaseAnnotation is itself a meta-annotation? Actually only the predefined meta-annotations can be extended.

// This is not allowed:
// @interface ExtendsBase extends BaseAnnotation {} // Error

// Instead, extending @BaseAnnotation is not allowed by the Java language.

// Correct: extending a meta-annotation:
@Retention(RetentionPolicy.RUNTIME)
@interface MyRetention extends Retention {
}

@Target({ElementType.TYPE})
@interface MyTarget extends Target {
}
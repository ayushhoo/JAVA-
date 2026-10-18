// Section: Java Annotations and Its Types
// Question: How can annotations affect runtime behavior in Java?
Question: How can annotations affect runtime behavior in Java?
Answer:
Annotations with RUNTIME retention do not change the code behavior by themselves, but an application can read them at runtime using the reflection API. The program can check whether an annotation is present on a class, method, or field, and then take action based on it. For example, a framework can look for a specific annotation on a method and automatically invoke that method, or skip a method that is marked as deprecated. This allows the code to be driven by metadata instead of hard-coded logic.

Example:
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Run {
}

public class RuntimeBehaviorDemo {
    @Run
    public void autoRun() {
        System.out.println("This method runs because of the @Run annotation");
    }

    public void normalMethod() {
        System.out.println("This method is not annotated");
    }

    public static void main(String[] args) throws Exception {
        RuntimeBehaviorDemo obj = new RuntimeBehaviorDemo();
        for (Method m : RuntimeBehaviorDemo.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Run.class)) {
                m.invoke(obj);
            }
        }
    }
}
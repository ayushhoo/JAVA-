// Section: Creating Custom Annotations
// Question: How can you define a custom annotation to log method execution time?
Question: How can you define a custom annotation to log method execution time?
Answer:
A custom annotation for logging execution time can be used on methods to indicate that a logging aspect or code should measure and record the time taken. The annotation itself provides metadata, while the actual logging logic can be implemented using reflection or an AOP framework.

Example:
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface LogExecutionTime {
}

class TimingLogger {
    public static void logExecutionTime(Object target, Method method, Object[] args) throws Exception {
        long start = System.currentTimeMillis();
        // Simulate method execution
        method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("Method " + method.getName() + " took " + (end - start) + " ms");
    }
}

class DemoClass {
    @LogExecutionTime
    public void performTask() {
        // Simulate work
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task completed");
    }

    public static void main(String[] args) throws Exception {
        DemoClass obj = new DemoClass();
        Method method = DemoClass.class.getMethod("performTask");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            TimingLogger.logExecutionTime(obj, method, new Object[0]);
        }
    }
}
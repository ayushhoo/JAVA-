// Section: Maven Framework
// Question: Explain the Maven build lifecycle.
Question: Explain the Maven build lifecycle.
Answer:
The Maven build lifecycle defines a sequence of phases (steps) that are executed in a specific order. The default lifecycle includes phases like validate, compile, test, package, verify, install, and deploy. Each phase corresponds to a specific task (e.g., compile phase compiles source code). Phases can be bound to plugins, which execute goals when those phases are invoked.

Example:
// Example plugin binding for the compile phase
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <executions>
                <execution>
                    <id>compile</id>
                    <phase>compile</phase>
                    <goals>
                        <goal>compile</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

public class LifecycleDemo {
    public static void main(String[] args) {
        System.out.println("Maven lifecycle: validate -> compile -> test -> package -> verify -> install -> deploy");
    }
}
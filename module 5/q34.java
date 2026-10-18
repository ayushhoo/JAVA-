// Section: Maven Framework
// Question: How do you add a dependency to a Maven project? Provide an example.
Question: How do you add a dependency to a Maven project? Provide an example.
Answer:
To add a dependency, add a dependency element inside the <dependencies> section in pom.xml. Specify groupId, artifactId, version, and scope. The scope can be compile (default), runtime, test, provided, or system.

Example:
// pom.xml with a dependency
<dependencies>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
</dependencies>

public class DependencyDemo {
    public static void main(String[] args) {
        System.out.println("Dependency added to pom.xml");
    }
}
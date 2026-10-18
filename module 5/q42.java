// Section: Repositories, Dependencies, and Plugins
// Question: What is a transitive dependency in Maven?
Question: What is a transitive dependency in Maven?
Answer:
A transitive dependency is a dependency that is automatically pulled in as a result of project declaring a dependency on a library, which itself depends on other libraries. Maven resolves and includes these transitive dependencies automatically based on the transitive dependency graph.

Example:
// If you depend on spring-web which depends on spring-core, you don't declare spring-core
// explicitly but Maven still includes it.
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-web</artifactId>
        <version>5.3.12</version>
    </dependency>
</dependencies>

public class TransitiveDependencyDemo {
    public static void main(String[] args) {
        System.out.println("Transitive dependencies are automatically resolved");
    }
}
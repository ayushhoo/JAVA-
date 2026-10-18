// Section: Practical Exercise Suggestions
// Question: Build a Maven project that demonstrates the use of transitive dependencies.
Question: Build a Maven project that demonstrates the use of transitive dependencies.
Answer:
This project uses a dependency that itself has dependencies, and Maven pulls them in automatically. When you run mvn dependency:tree, you can see the transitive dependencies.

Example:
// pom.xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>transitive-demo</artifactId>
    <version>1.0.0</version>
    <dependencies>
        <dependency>
            <groupId>org.apache.httpcomponents</groupId>
            <artifactId>httpclient</artifactId>
            <version>4.5.13</version>
        </dependency>
    </dependencies>
</project>

// Run: mvn dependency:tree
// Output shows httpclient pulling in:
// ├── commons-codec:commons-codec
// ├── commons-logging:commons-logging
// └── org.apache.httpcomponents:httpcore

public class TransitiveDemo {
    public static void main(String[] args) {
        System.out.println("Run 'mvn dependency:tree' to see transitive dependencies of httpclient");
    }
}
// Section: Repositories, Dependencies, and Plugins
// Question: How do you exclude a specific transitive dependency in Maven?
Question: How do you exclude a specific transitive dependency in Maven?
Answer:
You can exclude a transitive dependency by adding an <exclusions> element to the dependency that brings in the transitive dependency, specifying the groupId and artifactId of the dependency to exclude. This is useful when the transitive dependency conflicts with your project.

Example:
<project>
    <dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-web</artifactId>
            <version>5.3.12</version>
            <exclusions>
                <exclusion>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>jackson-databind</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>
</project>

public class ExcludeTransitiveDemo {
    public static void main(String[] args) {
        System.out.println("Excluded transitive dependency: jackson-databind");
    }
}
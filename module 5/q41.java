// Section: Repositories, Dependencies, and Plugins
// Question: How does Maven resolve conflicts when multiple versions of a dependency are included?
Question: How does Maven resolve conflicts when multiple versions of a dependency are included?
Answer:
Maven uses a conflict resolution strategy called "nearest definition". The dependency closest to the project's root is selected. If multiple versions are at the same distance, the first declared dependency wins and a warning is logged. This strategy determines which version of the artifact to include in the final classpath.

Example:
// Maven resolves version conflicts based on nearest definition
// Root --> A:1.0 --> C:1.5
// Root --> B:2.0 --> C:1.0
// In this case, C:1.0 (nearest to root) is chosen for the final classpath.

// To override this behavior manually, you can use the dependencyManagement element
<project>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.example</groupId>
                <artifactId>conflicting-lib</artifactId>
                <version>1.0</version>
            </dependency>
        </dependencies>
    </dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.example</groupId>
            <artifactId>conflicting-lib</artifactId> <!-- Version comes from dependencyManagement -->
        </dependency>
    </dependencies>
</project>

public class ConflictResolutionDemo {
    public static void main(String[] args) {
        System.out.println("Maven resolves conflicts using 'nearest definition' strategy");
    }
}
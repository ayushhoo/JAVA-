// Section: Repositories, Dependencies, and Plugins
// Question: How can you use Maven to create a JAR file for your project?
Question: How can you use Maven to create a JAR file for your project?
Answer:
The maven-jar-plugin is invoked during the package phase (default behavior for jar packaging) to create a JAR file containing compiled classes. You can run mvn package and Maven will produce the JAR. You can configure the plugin to change the archive name or include/exclude specific files.

Example:
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.3.0</version>
    <configuration>
        <archive>
            <manifest>
                <mainClass>com.example.Main</mainClass>
            </manifest>
        </archive>
    </configuration>
</plugin>

// Run: mvn package
// Output: target/myproject-1.0.0.jar

public class JarCreationDemo {
    public static void main(String[] args) {
        System.out.println("mvn package creates the JAR file in the target directory");
    }
}
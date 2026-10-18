// Section: Maven Framework
// Question: What is the purpose of Maven plugins?
Question: What is the purpose of Maven plugins?
Answer:
Maven plugins extend the core functionality of Maven. They execute goals that perform tasks such as compiling source code, creating JAR files, running tests, packaging web applications, and deploying artifacts. Plugins are defined in pom.xml and are part of the build lifecycle.

Example:
// Example plugin: maven-compiler-plugin
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>

public class PluginPurposeDemo {
    public static void main(String[] args) {
        System.out.println("Maven plugins extend core functionality (compile, package, test, etc.)");
    }
}
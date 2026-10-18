// Section: Practical Exercise Suggestions
// Question: Configure a Maven project to build a web application using maven-war-plugin.
Question: Configure a Maven project to build a web application using maven-war-plugin.
Answer:
To build a web application, set the packaging to war. Maven will look for the src/main/webapp directory for web resources. The maven-war-plugin packages the WAR file during the package phase.

Example:
// pom.xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>webapp-demo</artifactId>
    <version>1.0.0</version>
    <packaging>war</packaging>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>3.3.2</version>
                <configuration>
                    <warSourceDirectory>src/main/webapp</warSourceDirectory>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

// Directory structure:
// src
// └── main
//     ├── java
//     └── webapp
//         └── WEB-INF
//             ├── web.xml
//             └── index.jsp

public class WarBuildDemo {
    public static void main(String[] args) {
        System.out.println("Run 'mvn package' to create the .war file in target/");
    }
}
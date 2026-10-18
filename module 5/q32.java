// Section: Maven Framework
// Question: Explain the role of the pom.xml file in Maven.
Question: Explain the role of the pom.xml file in Maven.
Answer:
The pom.xml (Project Object Model) is the central configuration file for Maven projects. It defines the project's coordinates (groupId, artifactId, version), dependencies, plugins, build lifecycle, properties, and more. It enables Maven to understand what the project needs, how to build it, and how to manage its lifecycle. The pom.xml is the foundation of Maven's declarative configuration.

Example:
// A minimal pom.xml defining a Java project with dependencies
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>calculator</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>

    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>

public class PomRoleDemo {
    public static void main(String[] args) {
        System.out.println("pom.xml defines project configuration and dependencies");
    }
}
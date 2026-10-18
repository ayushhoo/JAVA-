// Section: Maven Framework
// Question: What is the purpose of Maven in Java development?
Question: What is the purpose of Maven in Java development?
Answer:
Maven is a build automation tool for Java projects that manages dependencies, builds, testing, and documentation. It provides a standardized project structure and a declarative approach using pom.xml to describe the project's configuration, dependencies, and plugins. This helps developers focus on coding rather than manual build steps, and ensures reproducible builds.

Example:
// Minimal pom.xml for a simple Java project
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>my-app</artifactId>
    <version>1.0.0</version>
    <packaging>jar</packaging>
</project>

public class PurposeDemo {
    public static void main(String[] args) {
        System.out.println("Maven manages project build lifecycle");
    }
}
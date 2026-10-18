// Section: Repositories, Dependencies, and Plugins
// Question: Explain how to create a multi-module Maven project.
Question: Explain how to create a multi-module Maven project.
Answer:
A multi-module Maven project has a parent pom that uses packaging type "pom" and lists modules inside <modules>. Each module is a subdirectory with its own pom.xml and artifactId. You run Maven from the parent directory to build all modules together.

Example:
// Parent pom.xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <modules>
        <module>core</module>
        <module>web</module>
    </modules>
</project>

// core/pom.xml
<project>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>parent</artifactId>
        <version>1.0.0</version>
    </parent>
    <artifactId>core</artifactId>
</project>

// web/pom.xml
<project>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>parent</artifactId>
        <version>1.0.0</version>
    </parent>
    <artifactId>web</artifactId>
    <packaging>war</packaging>
</project>

public class MultiModuleDemo {
    public static void main(String[] args) {
        System.out.println("Multi-module project with parent pom and submodules core and web");
    }
}
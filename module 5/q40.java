// Section: Maven Framework
// Question: Write an example pom.xml file for a project using Spring Boot.
Question: Write an example pom.xml file for a project using Spring Boot.
Answer:
Spring Boot projects use spring-boot-starter-parent as the parent POM, which inherits sensible defaults and manages dependency versions. It uses spring-boot-starter dependencies for common features. The spring-boot-maven-plugin is used for packaging executable JAR files.

Example:
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.7.5</version>
        <relativePath/>
    </parent>
    <groupId>com.example</groupId>
    <artifactId>spring-boot-demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>
    <name>spring-boot-demo</name>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

public class SpringBootPomDemo {
    public static void main(String[] args) {
        System.out.println("Spring Boot pom.xml uses spring-boot-starter-parent and starters");
    }
}
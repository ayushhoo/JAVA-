// Section: Practical Exercise Suggestions
// Question: Implement a Maven multi-module project with shared dependencies in the parent pom.xml.
Question: Implement a Maven multi-module project with shared dependencies in the parent pom.xml.
Answer:
This multi-module project defines shared dependencies in the parent's <dependencyManagement> section. Submodules inherit these and declare them without versions. Common plugins can be configured in the parent too.

Example:
// Parent pom.xml (packaging=pom)
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>parent</artifactId>
    <version>1.0.0</version>
    <packaging>pom</packaging>

    <modules>
        <module>core</module>
        <module>api</module>
    </modules>

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.apache.commons</groupId>
                <artifactId>commons-lang3</artifactId>
                <version>3.12.0</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>8</source>
                    <target>8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

// core/pom.xml
<project>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>parent</artifactId>
        <version>1.0.0</version>
    </parent>
    <artifactId>core</artifactId>
    <dependencies>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId> <!-- Version inherited -->
        </dependency>
    </dependencies>
</project>

// api/pom.xml
<project>
    <parent>
        <groupId>com.example</groupId>
        <artifactId>parent</artifactId>
        <version>1.0.0</version>
    </parent>
    <artifactId>api</artifactId>
    <dependencies>
        <dependency>
            <groupId>com.example</groupId>
            <artifactId>core</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
</project>

public class MultiModuleParentDemo {
    public static void main(String[] args) {
        System.out.println("Run 'mvn install' from parent to build all modules");
    }
}
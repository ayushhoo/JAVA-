// Section: Repositories, Dependencies, and Plugins
// Question: What is the difference between compile, provided, and runtime dependency scopes in Maven?
Question: What is the difference between compile, provided, and runtime dependency scopes in Maven?
Answer:
- compile: The default scope. Available during compilation, testing, and runtime. It is packaged with the application.
- provided: Available only during compilation and testing. Not packaged because it is provided by the environment (e.g., a servlet container).
- runtime: Needed only at runtime, not during compilation. It is packaged with the application (e.g., JDBC drivers).

Example:
<project>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>servlet-api</artifactId>
            <version>2.5</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.28</version>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
</project>

public class DependencyScopesDemo {
    public static void main(String[] args) {
        System.out.println("Compile=test+runtime+packaging | Provided=compile+test only | Runtime=pull to run+package");
    }
}
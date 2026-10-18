// Section: Repositories, Dependencies, and Plugins
// Question: Write a Maven configuration to run unit tests using the maven-surefire-plugin.
Question: Write a Maven configuration to run unit tests using the maven-surefire-plugin.
Answer:
The maven-surefire-plugin runs unit tests during the test phase. It's configured inside <build><plugins>. You can specify test patterns, forks, and reporting.

Example:
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.2.5</version>
    <configuration>
        <includes>
            <include>**/*Test.java</include>
            <include>**/*Tests.java</include>
        </includes>
        <forkCount>1</forkCount>
        <reuseForks>true</reuseForks>
    </configuration>
</plugin>

public class SurefireDemo {
    public static void main(String[] args) {
        System.out.println("mvn test runs surefire-plugin to execute unit tests");
    }
}
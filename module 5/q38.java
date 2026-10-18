// Section: Maven Framework
// Question: How do you configure the Java version in a Maven project?
Question: How do you configure the Java version in a Maven project?
Answer:
You configure the Java version by setting the source and target properties of the maven-compiler-plugin in the build section of pom.xml. You can also set the java.version property for use in resource filtering.

Example:
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>

public class JavaVersionDemo {
    public static void main(String[] args) {
        System.out.println("Java version configured in pom.xml");
    }
}
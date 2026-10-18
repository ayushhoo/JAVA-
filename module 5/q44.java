// Section: Repositories, Dependencies, and Plugins
// Question: What is the purpose of the maven-compiler-plugin?
Question: What is the purpose of the maven-compiler-plugin?
Answer:
The maven-compiler-plugin is responsible for compiling Java source code to bytecode and compiling test source code to test bytecode. It uses the standard javac compiler. You can configure it to specify the Java version (source/target), enable annotations processing, and more.

Example:
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.11.0</version>
    <configuration>
        <source>11</source>
        <target>11</target>
    </configuration>
</plugin>

public class CompilerPluginDemo {
    public static void main(String[] args) {
        System.out.println("maven-compiler-plugin compiles source and test bytecode");
    }
}
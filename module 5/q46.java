// Section: Repositories, Dependencies, and Plugins
// Question: How do you include and configure a plugin in pom.xml? Provide an example.
Question: How do you include and configure a plugin in pom.xml? Provide an example.
Answer:
Plugins are included inside the <build><plugins> section in pom.xml. Each plugin requires groupId, artifactId, and version. Configuration is added inside <configuration>. The plugin can also be bound to specific lifecycle phases.

Example:
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.11.0</version>
            <configuration>
                <source>8</source>
                <target>8</target>
                <encoding>UTF-8</encoding>
            </configuration>
        </plugin>
    </plugins>
</build>

public class ConfigurePluginDemo {
    public static void main(String[] args) {
        System.out.println("Plugin configured inside build/plugins/configuration");
    }
}
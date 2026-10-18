// Section: Repositories, Dependencies, and Plugins
// Question: How do you deploy a Maven project to a remote repository?
Question: How do you deploy a Maven project to a remote repository?
Answer:
You deploy a Maven project using the maven-deploy-plugin (default for the deploy phase). Configure the plugin with the repository URL and credentials in pom.xml or settings.xml, then run mvn deploy to upload the artifact.

Example:
// In pom.xml
<distributionManagement>
    <repository>
        <id>my-repo</id>
        <url>https://my-repo.com/repository/maven/</url>
    </repository>
</distributionManagement>

// Run: mvn deploy

public class DeployDemo {
    public static void main(String[] args) {
        System.out.println("mvn deploy uploads the artifact to the remote repository");
    }
}
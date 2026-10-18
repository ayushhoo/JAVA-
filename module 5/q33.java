// Section: Maven Framework
// Question: What are the differences between the local repository, central repository, and remote repository in Maven?
Question: What are the differences between the local repository, central repository, and remote repository in Maven?
Answer:
The local repository is on the developer's machine, storing all downloaded artifacts for reuse. The central repository is a shared remote repository managed by Maven, providing commonly used dependencies. Remote repositories are user-defined (like internal company repositories) for private or custom artifacts.

Example:
// Example snippet showing references in pom.xml
<repositories>
    <repository>
        <id>central</id>
        <url>https://repo1.maven.org/maven2</url>
    </repository>
    <repository>
        <id>internal</id>
        <url>http://internal-repo.company.com/artifactory/repo</url>
    </repository>
</repositories>

public class RepositoryDiffDemo {
    public static void main(String[] args) {
        System.out.println("Local: developer's cache | Central: Maven public | Remote: custom/internal");
    }
}
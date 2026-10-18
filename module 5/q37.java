// Section: Maven Framework
// Question: What are the default phases of the Maven lifecycle?
Question: What are the default phases of the Maven lifecycle?
Answer:
The default lifecycle phases are:
1. validate - ensure the project is correct and all necessary information is available.
2. initialize - initialize build state, e.g., set properties.
3. generate-sources - generate source code.
4. process-sources - process source code (e.g., filter resources).
5. generate-resources - generate resource files.
6. process-resources - process resources (copy and customize).
7. compile - compile the source code.
8. process-classes - post-process the compiled classes.
9. generate-test-sources - generate test source code.
10. process-test-sources - process test sources.
11. test-compile - compile the test source code.
12. process-test-classes - post-process test classes.
13. test - run tests.
14. prepare-package - prepare before actual packaging.
15. package - package compiled code into its distributable format (e.g., JAR).
16. pre-integration-test - prepare for integration tests.
17. integration-test - run integration tests.
18. post-integration-test - clean up after integration tests.
19. verify - run checks to verify quality.
20. install - install the package into the local repository.
21. deploy - deploy the package to a remote repository.

Example:
// The phases are executed sequentially when you run mvn deploy.
public class DefaultPhasesDemo {
    public static void main(String[] args) {
        System.out.println("Maven lifecycle includes validate, compile, test, package, verify, install, deploy");
    }
}
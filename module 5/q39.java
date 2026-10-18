// Section: Maven Framework
// Question: What is a Maven goal, and how is it different from a phase?
Question: What is a Maven goal, and how is it different from a phase?
Answer:
A Maven goal is a specific task that performs a unit of work, associated with a phase. A phase is a step in the build lifecycle, while a goal is a concrete action executed. Multiple goals can be bound to a single phase. When a user executes a phase, Maven runs all goals associated with that phase and all prior phases.

Example:
// maven-compiler-plugin declares two goals: compile and testCompile
// These goals can be bound to phases like compile and test-compile.

// Invoking a goal directly: mvn compiler:compile

// Invoking a phase (runs all goals in that phase): mvn package

public class GoalVsPhaseDemo {
    public static void main(String[] args) {
        System.out.println("A goal performs work; a phase is a step in the lifecycle");
    }
}
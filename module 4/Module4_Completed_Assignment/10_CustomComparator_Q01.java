/*
 * Question:
 * Write a program to sort a list of custom objects (e.g., Student with name and marks) using a Comparator.
 */

import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

// Comparator to sort students by marks in descending order
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks); // Descending
    }
}

// Comparator to sort students by name in alphabetical order
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Ascending
    }
}

public class StudentSortDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));
        students.add(new Student("Diana", 95));

        System.out.println("Original List:");
        students.forEach(System.out::println);

        // Sort by marks (Descending)
        Collections.sort(students, new MarksComparator());
        System.out.println("\nSorted by Marks (Highest to Lowest):");
        students.forEach(System.out::println);

        // Sort by name (Alphabetical)
        Collections.sort(students, new NameComparator());
        System.out.println("\nSorted by Name (Alphabetical):");
        students.forEach(System.out::println);
    }
}

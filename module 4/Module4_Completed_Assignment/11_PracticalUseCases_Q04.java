/*
 * Question:
 * Create a program to store students’ grades in a TreeMap, with student names as keys
 * and grades as values. Allow adding, removing, and querying grades.
 */

import java.util.*;

public class StudentGradeSystem {
    public static void main(String[] args) {
        // TreeMap keeps students sorted by name automatically
        TreeMap<String, Integer> gradeMap = new TreeMap<>();

        // 1. Adding grades
        gradeMap.put("Alice", 90);
        gradeMap.put("Bob", 85);
        gradeMap.put("Charlie", 92);
        gradeMap.put("Diana", 88);

        System.out.println("Current Grades (Sorted by Name): " + gradeMap);

        // 2. Querying a grade
        String searchName = "Charlie";
        if (gradeMap.containsKey(searchName)) {
            System.out.println("\nGrade for " + searchName + ": " + gradeMap.get(searchName));
        } else {
            System.out.println("\nStudent " + searchName + " not found.");
        }

        // 3. Removing a grade
        System.out.println("\nRemoving Bob's grade...");
        gradeMap.remove("Bob");
        System.out.println("Updated Grades: " + gradeMap);
    }
}

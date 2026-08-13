// Question 31: Write a program to remove duplicate elements from an array.
import java.util.HashSet;
import java.util.Set;

public class Question31 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
        Set<Integer> set = new HashSet<>();
        for (int n : arr) set.add(n);
        System.out.print("Unique elements: ");
        for (int n : set) System.out.print(n + " ");
        System.out.println();
    }
}

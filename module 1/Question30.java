// Question 30: Write a program to search for an element in a sorted array using the binary search algorithm.
public class Question30 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int key = 40;
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) { result = mid; break; }
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        if (result != -1) System.out.println("Element found at index: " + result);
        else System.out.println("Element not found.");
    }
}

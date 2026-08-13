// Question 18: Write a program to find the largest and smallest numbers in an array.
public class Question18 {
    public static void main(String[] args) {
        int[] arr = {34, 12, 7, 89, 23, 5};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) largest = arr[i];
            if (arr[i] < smallest) smallest = arr[i];
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

// Question 26: Implement a program to reverse the elements of an array.
public class Question26 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }
}

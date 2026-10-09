/*
 * Question:
 * Write a generic method swapElements that swaps two elements in an array.
 * Demonstrate its usage with different data types.
 */

import java.util.Arrays;

public class ArraySwapper {

    // Generic method to swap elements
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Testing with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Before swap (Integer): " + Arrays.toString(intArray));
        swapElements(intArray, 0, 4);
        System.out.println("After swap (Integer): " + Arrays.toString(intArray));

        // Testing with String array
        String[] strArray = {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("Before swap (String): " + Arrays.toString(strArray));
        swapElements(strArray, 1, 2);
        System.out.println("After swap (String): " + Arrays.toString(strArray));
    }
}

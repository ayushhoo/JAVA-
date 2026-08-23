// Question 6: Method reference — find the square of a number using a static method.

package functionalinterface;

import java.util.function.Function;

public class Question6 {
    public static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> sq = Question6::square;

        int num = 7;
        System.out.println("Square of " + num + " = " + sq.apply(num));

        num = 12;
        System.out.println("Square of " + num + " = " + sq.apply(num));
    }
}

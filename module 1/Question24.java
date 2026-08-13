// Question 24: Write a program to check whether a given number is prime.
public class Question24 {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && num > 1) System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
    }
}

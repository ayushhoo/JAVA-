// Question 15: Write a program to check if a number is prime using a while loop.
public class Question15 {
    public static void main(String[] args) {
        int num = 17;
        boolean isPrime = true;
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime && num > 1) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
}

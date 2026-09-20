// q26: Write a program that uses the Date and Calendar classes to display the current date and time.
import java.util.Date;
import java.util.Calendar;

public class q26 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current Date (Date class): " + date);

        Calendar cal = Calendar.getInstance();
        System.out.println("Current Year (Calendar class): " + cal.get(Calendar.YEAR));
        System.out.println("Current Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Current Day: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}

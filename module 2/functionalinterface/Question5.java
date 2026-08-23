// Question 5: Sort a list of strings in descending order using a lambda.

package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;

public class Question5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Banana");
        names.add("Apple");
        names.add("Cherry");
        names.add("Mango");
        names.add("Date");

        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));

        System.out.println("Strings in descending order:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}

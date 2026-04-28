package String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "siddhi";
        String str2 = "siddhi";
        // convert lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // convert to char array
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        // sort
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // compare
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

}

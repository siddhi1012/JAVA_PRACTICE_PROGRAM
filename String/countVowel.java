package String;

import java.util.*;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.next();
        int vowel = 0;
        int consonant = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonant++;

            }

        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

    }

}

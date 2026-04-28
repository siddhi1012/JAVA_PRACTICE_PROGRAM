package String;

import java.util.*;

public class removeSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String res = "";
        for (char c : str.toCharArray()) {
            if (c != ' ') {
                res += c;
            }
        }
        System.out.println("After removing spaces: " + res);

    }

}

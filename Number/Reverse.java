package Number;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int rev = 0, a, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        while (n > 0) {
            r = n % 10;
            rev = rev*10+r;
            n = n/10;

        }
        System.out.println("Reverse"+rev);
    }

}

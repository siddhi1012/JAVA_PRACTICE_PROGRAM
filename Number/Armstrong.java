package Number;

import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int arm = 0, original, r;
        original = n;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            arm = arm + (r * r * r);
        }
        if (arm == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

}

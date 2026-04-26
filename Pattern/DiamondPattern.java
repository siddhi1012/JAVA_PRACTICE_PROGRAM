//   *
//  ***
// *****
// *****
//  ***
//   *

package Pattern;
public class DiamondPattern {
    public static void main(String[] args) {
        // upper

        // row
        for (int i = 1; i <= 3; i++) {
            // space
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower
        // row
        for (int i = 3; i >= 1; i--) {
            // space
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

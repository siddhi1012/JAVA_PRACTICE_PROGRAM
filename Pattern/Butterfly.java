
//   *      *
//   **    **
//   ***  ***
//   ********
//   ********
//   ***  ***
//   **    **
//   *      *
package Pattern;

public class Butterfly {
    public static void main(String[] args) {
        // Upper half
        for (int i = 1; i <= 4; i++) {
            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            // right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half
        for (int i = 4; i >= 1; i--) {
            // left star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            // right
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}

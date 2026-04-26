package Pattern;

public class PyramidPattern {
    public static void main(String[] args) {
        // Total row
        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=2*i-1; i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}

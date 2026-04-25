package Array;

public class LargestSmallest {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6 };
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 0) {
                System.out.println("Array is empty");
            } else {

                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Min:" + min);
        System.out.println("Max:" + max);
    }
}

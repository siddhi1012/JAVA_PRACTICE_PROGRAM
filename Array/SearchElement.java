package Array;

public class SearchElement {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 3 };
        int target = 6;

        int index = LinearSearch(arr, target);
        if (index != -1) {
            System.out.println("Element Found At Index:" + index);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int LinearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }

}

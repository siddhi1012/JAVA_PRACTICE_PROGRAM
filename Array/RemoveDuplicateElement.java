package Array;


import java.util.LinkedHashSet;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 2, 5 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        System.out.println("Array After removing Dulpicate Element");
        for (int num : set) {
            System.out.println(num);
        }
    }

}

package Array;

import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 3, 4, 5, 6, 7 };

        HashSet<Integer> set = new HashSet<>();

        // add in set 
        for(int num: arr1){
            set.add(num);
        }

        System.out.println("Common Element Are:");

        for(int num: arr2){
            if(set.contains(num)){
                System.out.println(num);
            }
        }

    }

}

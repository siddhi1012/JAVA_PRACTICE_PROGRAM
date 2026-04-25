package Array;

import java.util.ArrayList;

public class RemoveElementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(6);
        list.add(2);
        list.add(5);

        ArrayList<Integer> newlist = new ArrayList<>();
        for(int num : list){
            if(!newlist.contains(num)){
                newlist.add(num);
            }
        }
        System.out.println("After Remove Duplicate");
        System.out.println(newlist);

    }
}

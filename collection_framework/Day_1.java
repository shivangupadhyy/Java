package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class Day_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        list.add(12);
        list.add(8);
        list.add(80);
        // System.out.println(list.get((2)));
        // System.out.println(list.size());
        // for(int i = 0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        // for(int x: list){
        //     System.out.println(x);
        // }
        // list.remove(2);
        // list.add(2,60);
        // list.set(2, 50);
        // System.out.println(list);
        // System.out.println(list.contains(12));
        // System.out.println(list.contains(5));


        List<Integer> list1 = List.of(4, 5, 6, 7, 8,9 ); 
        System.out.println(list1);
        list.addAll(list1);
        System.out.println(list);

        list.toArray();
    }
}

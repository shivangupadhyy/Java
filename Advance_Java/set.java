package Advance_Java;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(56);
        myHashSet.add(7);
        System.out.println(myHashSet);
    }
}

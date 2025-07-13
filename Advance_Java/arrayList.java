package Advance_Java;

import java.util.*; // Importing utility package for ArrayList and other collections

public class arrayList {
    public static void main(String[] args) {

        // ✅ Creating a dynamic ArrayList (default size is 10)
        ArrayList<Integer> l1 = new ArrayList<>();

        // ✅ Creating another ArrayList with initial capacity of 5
        ArrayList<Integer> l2 = new ArrayList<>(5);

        // ✅ Adding elements to l2
        l2.add(12);
        l2.add(34);
        l2.add(32);
        l2.add(11);
        l2.add(54);

        // ✅ Adding elements to l1
        l1.add(6);         // Adds 6 at end
        l1.add(7);         // Adds 7 at end
        l1.add(4);         // Adds 4 at end
        l1.add(6);         // Adds another 6 at end (duplicate values allowed)

        l1.add(0, 5);      // Adds 5 at index 0 → shifts all elements right
        l1.add(0, 1);      // Adds 1 at index 0 → 1 becomes the new first element

        // ✅ Merging two lists: inserts all of l2 at index 0
        l1.addAll(0, l2);

        // ✅ Checking if value 27 is present in l1
        System.out.println(l1.contains(27)); // false

        // ✅ Finding the first index of value 6
        System.out.println(l1.indexOf(6)); // index of first 6

        // ✅ Finding the last index of value 6
        System.out.println(l1.lastIndexOf(6)); // index of last 6

        // ✅ Removing element at index 10
        l1.remove(10); // removes the element at index 10 (NOT the value 10)

        // ✅ Updating value at index 1 to 566
        l1.set(1, 566); // replaces the value at index 1

        // ✅ Uncommenting below would clear the list
        // l1.clear(); // removes all elements

        // ✅ Printing all elements of l1
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)); // access element at index i
            System.out.print(", ");
        }
    }
}

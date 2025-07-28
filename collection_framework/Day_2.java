package collection_framework;

import java.util.LinkedList;

import Advance_Java.linkList;
import java.util.Arrays;

class Node {
    public int value;

    public Node next;
}

public class Day_2 {
    public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>();
      linkedList.add(5);
      linkedList.add(3);
      linkedList.add(98);

      LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat", "dogs", "elephant"));
      LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("cat", "elephant"));
      animals.removeAll(animalsToRemove);
      System.out.println(animals);

    }
}

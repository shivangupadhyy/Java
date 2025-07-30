package collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMapDemo {
    public static void main(String[] args) {

        // Demonstrate LinkedHashMap usage
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("shubham", 91);
        hashMap.put("Shivang", 14);
        hashMap.put("Aysuhi", 25);

        Integer res = hashMap.getOrDefault("vipul", 0);
        hashMap.put("prabhat", 82);
        System.out.println(res);

    }
}

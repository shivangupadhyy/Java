package collection_framework;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V>  extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    
}

protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
    return size() > capacity;
} 


    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("ayushi", 12);
        studentMap.put("alice", 128);
        studentMap.put("bob", 125);
        studentMap.put("shivang", 2);
        System.out.println(studentMap);
    }
}

package collection_framework;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyonwriteArray {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("bread");
        shoppingList.add("Eggs");
        shoppingList.add("Milk");

        System.out.println("Initial Shopping List: "  + shoppingList);

        for(String item : shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter While Reading..");
            }
        }

        System.out.println("Updated Shopping list: " + shoppingList);
    }
}

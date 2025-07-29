package collection_framework;

import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(9);
        // stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);


    }    
}

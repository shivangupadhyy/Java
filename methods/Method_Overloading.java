package methods;

public class Method_Overloading {

    // Method with no parameters
    static void foo(){
        System.out.println("Good morning bro");
    }

    // Overloaded method: takes one int parameter
    static void foo(int a){
        System.out.println( "good morning " + a + " bro!");
    }

    // Overloaded method: takes two int parameters
    static void foo(int a, int b){
        System.out.println( "good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!");
    }

    // Demonstrates that primitive types are passed by value
    static void change(int a){
        a = 98; // This change will not affect the original variable in main
    }

    // Demonstrates that arrays are passed by reference (the reference is copied)
    static void change2(int []arr){
        arr[0] = 98; // This change will affect the original array in main
    }

    public static void main(String[] args) {
        // tellJoke(); // Example of calling another method

        // Example 1: Changing an integer (primitive type)
        // int x = 45;
        // change(x);
        // System.out.println("the value of x after running change is : " + x);
        // Output: x remains 45 because primitives are passed by value

        // Example 2: Changing an array (reference type)
        // int [] marks = {52, 73, 77, 89, 98};
        // change2(marks);
        // System.out.println("the value of marks[0] after running change2 is " + marks[0]);
        // Output: marks[0] becomes 98 because arrays are passed by reference

        // Method overloading demonstration
        foo(); // Calls foo() with no arguments
        foo(3000); // Calls foo(int a)
        foo(3000, 4000); // Calls foo(int a, int b)
        // Arguments are actual values passed to the methods
    }

    // Example of a simple method that prints a joke
    static void tellJoke(){
        System.out.println("I invented a new word! \nplagiarism");
    }
}

/*
NOTES:
- Method overloading: Multiple methods with the same name but different parameter lists.
- Java chooses which overloaded method to call based on the number and type of arguments.
- Primitives (like int) are passed by value: changes inside the method do not affect the original variable.
- Arrays and objects are passed by reference: changes inside the method affect the original array/object.
- You can comment/uncomment code in main to test different behaviors.
*/

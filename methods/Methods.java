package methods;

public class Methods {

    // This method takes two integers x and y, and returns an integer result
    static int logic(int x, int y){
        int z; // Declare a variable to store the result
        if(x > y){ // If x is greater than y
            z = x + y;  // z is the sum of x and y
        }else{
            z = (x + y) * 5; // Otherwise, z is (x + y) multiplied by 5
        }
        return z; // Return the result
    }

    public static void main(String[] args) {
        int a = 5; // Declare and initialize variable a
        int b = 7; // Declare and initialize variable b
        int c;     // Declare variable c to store result
        // Methods invocation using Object creation (uncomment to use instance method)
        // Methods obj = new Methods(); // Create an object of Methods class
        // c = obj.logic(a, b); // Call logic method using object
        c = logic(a, b); // Call static logic method directly and store result in c
        int a1 = 15; // Declare and initialize another variable a1
        int b1 = 7;  // Declare and initialize another variable b1
        int c1;      // Declare variable c1 to store result
        c1 = logic(a1, b1); // Call logic method with new values and store result in c1
        System.out.println(c);  // Print the result of first logic call
        System.out.println(c1); // Print the result of second logic call
    }
}

/*
NOTES:
- static int logic(int x, int y): Defines a static method that can be called without creating an object.
- if(x > y): Checks if x is greater than y.
- z = x + y: If true, adds x and y.
- z = (x + y) * 5: If false, adds x and y, then multiplies by 5.
- return z: Returns the computed value.
- In main, variables are declared and initialized, and the logic method is called with different values.
- System.out.println() prints the results to the console.
- You can call static methods directly using the class name or from within the same class.
- To call a non-static method, you need to create an object of the class.
*/

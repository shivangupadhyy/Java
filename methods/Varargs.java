package methods;

public class Varargs {

    // Example of method overloading for sum (commented out)
    // static int sum(int a, int b){
    //     return a+b;
    // }
    // static int sum(int a, int b, int c){
    //     return a+b+c;
    // }
    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }

    // Varargs method: accepts any number of int arguments
    static int sum(int ...arr){
        // arr is available as int[] (array of integers)
        int result = 0; // Initialize result to 0
        for(int a: arr){ // For each integer in arr
            result += a; // Add it to result
        }
        return result; // Return the total sum
    }

    public static void main(String[] args) {
        System.out.println("welcome to varargs tutorial");
        // Call sum with 2 arguments
        System.out.println("the sum of  4, and 5 is : " + sum(4, 5));
        // Call sum with 3 arguments
        System.out.println("the sum of  4,3 and 5 is : " + sum(4,3, 5));
    }
}

/*
NOTES:
- Varargs (variable arguments) allow you to pass any number of arguments to a method.
- The syntax is: methodName(type... varName), e.g., sum(int ...arr).
- Inside the method, varargs are treated as an array (int[] arr).
- This avoids writing multiple overloaded methods for different numbers of arguments.
- You can call sum() with any number of int values (including zero).
- The for-each loop (for(int a: arr)) iterates through all arguments.
*/

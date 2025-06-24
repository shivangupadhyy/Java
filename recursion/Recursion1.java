package recursion;

public class Recursion1 {

    // factorial(n) = n * (n-1) * ... * 1
    // Example: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120

    // Recursive method to calculate factorial
    static int factorial(int n){
        if(n==0 || n==1){ // Base case: factorial of 0 or 1 is 1
            return 1;
        }else{
            return n * factorial(n-1); // Recursive call: n * factorial of (n-1)
        }
    }

    // Iterative method to calculate factorial
    static int factorial_iterative(int n){
        if(n==0 || n==1){ // Base case: factorial of 0 or 1 is 1
            return 1;
        }else{
            int product = 1; // Initialize product to 1
            for(int i = 1; i<=n; i++){
                product *= i; // Multiply product by each number from 1 to n
            }
            return product; // Return the final product
        }
    }

    public static void main(String[] args) {
        int n = 4; // Number to calculate factorial for
        // Call recursive factorial method and print result
        System.out.println("the value of factorial n is : " + factorial(n));
        // Call iterative factorial method and print result
        System.out.println("the value of factorial n is : " + factorial_iterative(n));
    }
}

/*
NOTES:
- The factorial of a number n (written as n!) is the product of all positive integers up to n.
- The recursive method calls itself with n-1 until it reaches the base case (n==0 or n==1).
- The iterative method uses a loop to multiply numbers from 1 to n.
- Both methods return 1 for n=0 or n=1, as 0! and 1! are defined as 1.
- You can change the value of n in main to test other numbers.
*/

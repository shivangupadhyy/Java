// public class Practice_Sets_Onmethods {
//     // Prints the multiplication table of a given number n from 0 to 10
//     // static void multiplpication(int n){
//     //     for(int i =0; i<=10; i++){
//     //         int result;
//     //         result = n *i;
//     //         System.out.println(n + " x " + i + " = " + result);
//     //     }
//     // }

//     // Prints a left-aligned triangle of stars using loops
//     // static void pattern1(int n){
//     //     for(int i =0; i<n; i++){
//     //         for(int j=0; j<i+1; j++){
//     //             System.out.print("*"); // Print star for each column
//     //         }
//     //         System.out.println(); // Move to next line after each row
//     //     }
//     // }

//     // Prints a left-aligned triangle of stars using recursion
//     static void pattern1_rec(int n){
//         // Base case: if n is 0, do nothing
//         if(n>0){
//             pattern1_rec(n-1); // Recursive call to print previous rows first
//             for(int i=0; i<n; i++){
//                 System.out.print("*"); // Print n stars for the current row
//             }
//             System.out.println(); // Move to next line after each row
//         }
//     }

//     // Prints a reversed triangle of stars using loops
//     // static void patternRev(int n){
//     //     for(int i=0; i<n; i++){
//     //         for(int j=n; j>i;j--){
//     //             System.out.print("*"); // Print star for each column
//     //         }
//     //         System.out.println(""); // Move to next line after each row
//     //     }
//     // }

//     // Returns the nth Fibonacci number using recursion
//     // static int fib(int n){
//     //     if(n == 1){
//     //         return 0; // First Fibonacci number is 0
//     //     }else if (n == 2){
//     //         return 1; // Second Fibonacci number is 1
//     //     } else {
//     //         return fib(n - 1) + fib(n - 2); // Sum of previous two numbers
//     //     }
//     // }

//     // Returns the sum of first n natural numbers using recursion
//     // sum(n) = 1 + 2 + ... + n
//     // static int sumRec(int n){
//     //     if(n==1){
//     //         return 1; // Base case: sum of 1 is 1
//     //     }
//     //     return n+sumRec(n-1); // Recursive case: n + sum of previous numbers
//     // }

//     public static void main(String[] args) {
//         // Problem 1: Print multiplication table of 2
//         // multiplpication(2);

//         // Problem 2: Print left-aligned triangle of stars using loops
//         // pattern1(5);

//         // Problem 3: Print sum of first 3 natural numbers using recursion
//         // int c =  sumRec(3);
//         // System.out.println(c);

//         // Problem 4: Print reversed triangle of stars
//         // patternRev(4);

//         // Problem 5: Print nth Fibonacci number
//         // int result = fib(n);
//         // System.out.println(result);

//         // Problem 6: Print left-aligned triangle of stars using recursion
//         pattern1_rec(9);
//     }
// }

// /*
// NOTES:
// - Use // for single-line comments and /* ... */ for multi-line comments.
// - Each method demonstrates a different concept: loops, recursion, patterns, Fibonacci, and sum.
// - You can uncomment any method call in main to test that functionality.
// - Recursion is when a method calls itself to solve a smaller subproblem.
// - Patterns are a good way to practice nested loops and recursion in Java.
// */

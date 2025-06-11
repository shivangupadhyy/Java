// This Java program demonstrates various conditional statements and a simple calculator.
// It covers: if-else, else-if ladder, switch-case, and user input handling with Scanner.

package condition;

import java.util.Scanner;

public class Conditions {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        // --- Comparison of Two Numbers ---
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if (a == b) {
        //     System.out.println("equal");
        // }
        // else if(a > b){
        //     System.out.println("a is greater than b");
        // } else if (b < a) {
        //     System.out.println("b is less than a");
        // } else {
        //     System.out.println("a is lesser than b");
        // }
        // Notes:
        // - This section takes two integers as input and compares them.
        // - Demonstrates the use of if, else if, and else for decision making.

        // --- Button Language Example with if-else ---
        // int button = sc.nextInt();
        // if(button == 1){
        //     System.out.println("hello");
        // } else if(button == 2){
        //     System.out.println("bonjour");
        // } else if(button == 3){
        //     System.out.println("namaste");
        // } else {
        //     System.out.println("invalid button");
        // }
        // Notes:
        // - Shows how to use if-else to select actions based on user input.

        // --- Button Language Example with switch-case ---
        // switch (button) {
        //     case 1: System.out.println("hello");
        //         break;
        //     case 2: System.out.println("bonjour");
        //         break;
        //     case 3: System.out.println("namaste");
        //         break;
        //     default: System.out.println("invalid button");
        // }
        // Notes:
        // - switch-case is an alternative to multiple if-else statements.
        // - Each case matches a value; default runs if no case matches.

        // --- Month Name Example with switch-case ---
        // int month  = sc.nextInt();
        // switch (month) {
        //     case 1: System.out.println("January"); break;
        //     case 2: System.out.println("feb"); break;
        //     case 3: System.out.println("march"); break;
        //     case 4: System.out.println("april"); break;
        //     case 5: System.out.println("may"); break;
        //     case 6: System.out.println("june"); break;
        //     case 7: System.out.println("july"); break;
        //     case 8: System.out.println("august"); break;
        //     case 9: System.out.println("september"); break;
        //     case 10: System.out.println("october"); break;
        //     case 11: System.out.println("november"); break;
        //     case 12: System.out.println("december"); break;
        //     default: break;
        // }
        // Notes:
        // - Maps a number (1-12) to a month name using switch-case.

        // --- Simple Calculator ---
        System.out.println("enter the first number(a): ");
        double a = sc.nextDouble(); // Read first number

        System.out.println("enter the second number(b):");
        double b = sc.nextDouble(); // Read second number

        System.out.println("choose an operation:");
        System.out.println("1: + (Addition)");
        System.out.println("2: - (Subtraction)");
        System.out.println("3: * (Multiplication)");
        System.out.println("4: / (Division)");
        System.out.println("5: % (Modulo)");

        System.out.println("enter Operation Number(1-5): ");
        int operation = sc.nextInt(); // Read operation choice

        double result;
        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("result: " + result);
                break;
            case 2:
                result = a - b;
                System.out.println("result: " + result);
                break;
            case 3:
                result = a * b;
                System.out.println("result: " + result);
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed");
                }
                break;
            case 5:
                if (b != 0) {
                    result = a % b;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("Error: Modulo by zero is not allowed");
                }
                break;
            default:
                System.out.println("Invalid operation selected. Please choose between 1 and 5.");
                break;
        }
        sc.close();

    }
}

/*
GENERAL NOTES:
- Use Scanner for user input (import java.util.Scanner;).
- if, else if, and else are used for decision making.
- switch-case is useful for multiple fixed options.
- Always close Scanner after use to free resources.
- Use break in switch-case to prevent fall-through.
- Use comments to explain code for yourself and others.
*/
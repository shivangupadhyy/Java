package Error_and_Exceptions;

import java.util.Scanner;



public class Error {
    public static void main(String[] args) {

        // syantex Error
        // int a = 8// error no semicolon
        // b =8; // b  is not declared4

        //logical Error Demo
        //WRite a program to print all prime number between 1 to 10;

        // System.out.println(2);
        // for(int i=1; i<5; i++){
        //     System.out.println(2*i+1);
        // }
        

        //runtime error

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer Part of 1000 divide by k is " + 1000/k);
    }
}

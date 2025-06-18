package recursion;

import java.util.Scanner;

public class Recursion {

    // public static void printNumber(int n){
    //     // if(n==0){
    //     //     return;
    //     // }
    //     // System.out.println(n);
    //     // printNumber(n-1);

    //     if(n>5){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumber(n+1);
    // }

    // public static void printSum(int i, int n, int sum){

    //     if(i == n){
    //         sum +=i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum +=i;
    //     printSum(i+1, n, sum);
    // }
    
    // public static int calcfactorial(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int fact_nm1 = calcfactorial(n-1);
    //     int fact_n = n* fact_nm1;
    //     return fact_n;
    // }
    // public static void printFib(int a, int b, int n){
    //     if(n ==0){
    //         return;
    //     }

    //     int c = a+b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }

    public static int calcPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String[] args) {
        // int n =5;
        // printNumber(n);//n=5

        // int n =1;
        // printNumber(n);

        // printSum(1, 5, 0);

        // int n =5;
        // int ans = calcfactorial(n);
        // System.out.println(ans);

       
        //  Scanner sc= new Scanner(System.in);
        // int n =sc.nextInt();
        //  int a =0, b=1;
        // System.out.println(a);
        // System.out.println(b);
       
        
        // printFib(a, b, n-2);
        int x =2, n =5;
        int ans = calcPower(x, n);
        System.out.println(ans);

    }
}

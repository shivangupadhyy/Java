package functionss;

import java.util.Scanner;

public class Functions {

    // public static void printName(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // public static int multipleTwo(int a, int b){
    //     int mul = a * b;
    //     return mul;
    // }

    // public static void printFactorial(int n){
    //     //loop
    //     if(n < 0){
    //         System.out.println("invalid Number");
    //         return;
    //     }
    //     int Factorial = 1;

    //     for(int i=n; i>=1; i--){
    //         Factorial = Factorial * i;
    //     }

    //     System.out.println(Factorial);
    //     return;
    // }

    // public static int average( int a, int b, int c){
    //     int avg = (a + b + c)/3;
    //     return avg;
    // }

    // public  static void printSum(int n){
    //     int sum =0;
        
    //     for(int i=1; i<=n; i++){
    //         if(i %2 !=0){
    //             sum =sum +i;
    //         }
    //     }
    //     System.out.println(sum);
    // }

    // public static void greaterAmong(int a, int b){
    //     if(a > b){
    //         System.out.println(a + " a is greater than b");
    //     }else{
    //         System.out.println(b + " b is greater than a");
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();

        // printName(name);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = calculateSum(a, b);
        // System.out.println(sum);
        // int a  = sc.nextInt();
        // int b = sc.nextInt();
        // int mul = multipleTwo(a, b);
        // System.out.println("multiplication of two number is :"+ mul);


        // int n = sc.nextInt();
        // printFactorial(n);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // double Calculate = average(a, b, c);
        // System.out.println("average of these 3 number is :" + Calculate);

        // int n = sc.nextInt();
        // printSum(n);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // greaterAmong(a, b);

        // int positive  = 0, negative = 0, zero = 0;
        // System.out.println("press 1 to continue & 0  to stop");

        // int input = sc.nextInt();
        // while (input == 1) {
        //     System.out.println("enter your Number");
        //     int number = sc.nextInt();
        //     if(number > 0){
        //         positive++;
        //     }else if(number < 0){
        //         negative++;
        //     }else{
        //         zero++;
        //     }

        //     System.out.println("press 1 to continue & 0 to stop");
        //     input = sc.nextInt();
        // }
        // System.out.println("postive " + positive);
        // System.out.println("negative" + negative);
        // System.out.println("zeros" + zero);


        // System.out.println("Enter x");
        // int x =sc.nextInt();
        // System.out.println("Enter n");
        // int n = sc.nextInt();

        // int result = 1 ;
        // //please see that n is not too large or else result will exceed the size of int

        // for(int i = 0;i<n;i++){
        //     result = result*x;
        // }
        // System.out.println("x is the power n is : " + result);

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();

        // while (n1 != n2) {
        //     if(n1 > n2){
        //         n1 = n1- n2;
        //     }else{
        //         n2 = n2-n1;
        //     }
        // }
        // System.out.println("GCD is :"+ n2);

        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a + " ");

        if(n > 1){
            //find nth term
            for(int i=2; i<=n;i++){
                System.out.println(b + " ");
                //the concept below is called swapping
                int temp = b;
                b = a + b;
                a =temp;
            }
            System.out.println();
        }


    }
}

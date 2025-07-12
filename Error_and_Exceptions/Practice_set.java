package Error_and_Exceptions;

import java.util.Scanner;

public class Practice_set {
    public static void main(String[] args) {
        // // problem 1
        // // syntax error - int a = 7
        // int age = 78;
        // int year_born = 2000-78;// logical error

        // System.out.println(6/0);

        //problem 2
        // try {
        //     int a = 666/0;
        // } catch (IllegalArgumentException e) {
        //     System.out.println("hehe");
        // }
        // catch(ArithmeticException e){
        //     System.out.println("hahah ");
        // }

        //problem 3
        boolean flag = true;
        int [] marks  = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in); 
        int index;
        int i = 0;

        while(flag && i<5){
           try {
            System.out.println("enter the valid index");
             index = sc.nextInt();
            System.out.println("The value if marks[index] is " + marks[index]);
            
           } catch (Exception e) {
            System.out.println("invalid index");
           i++;
           }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}

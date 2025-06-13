package array;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int [] marks = new int[3];
        // marks[0]= 97;
        // marks[1]= 87;
        // marks[2] = 81;

        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // for(int i =0; i<size; i++){
        // number[i]= sc.nextInt();
        // }

        // int x = sc.nextInt();

        // for(int i= 0; i<number.length; i++){

        // if (number[i] == x) {
        // System.out.println("x found at this:" + i);
        // }

        // System.out.print(number[i]);

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // }

        // int size = sc.nextInt();

        // String names[] = new String[size];

        // //input
        // for(int i= 0 ; i<size; i++){
        // names[i] = sc.next();
        // }

        // //output

        // for(int i =0; i<names.length; i++){
        // System.out.println("name" + (i+1) +" is : " + names[i]);
        // }

        // Find the maximum & minimum number in an array of integers.

        int size = sc.nextInt();
        int number[] = new int[size];

        // input

        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }

        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}

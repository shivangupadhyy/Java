package bit_Manipulation;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        // int n = 5;
        // int pos =1;
        // int bitMask = 1<< pos;

        //get bit
        // if((bitMask & n) == 0){
        //     System.out.println("bit was zero");
        // }else{
        //     System.out.println("bit was one");
        // }

        //set bit
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);4

        //clear bit

        // int n = 5;
        // int pos =1;
        // int bitMask = 1<< pos;
        // int notBitMask = ~(bitMask);

        // int newNumber = notBitMask & n;
        // System.out.println(newNumber);

        Scanner sc = new Scanner(System.in);
        // System.out.println("enter the number");
        // int num = sc.nextInt();

        // if(num >0 && (num&(num-1)) == 0){
        //     System.out.println(num + " is a power of 2");
        // }else{
        //     System.out.println(num + " is not a power of 2");
        // }

        // sc.close();

        System.out.println("Enter a number (n): ");
        int n = sc.nextInt();

        System.out.println("Enter position to toggle (0 -indexed)");
        int pos =sc.nextInt();

        int bitMask = 1<< pos;

        int toggledNumber = n ^ bitMask;

         System.out.println("Original number (binary): " + Integer.toBinaryString(n));
        System.out.println("Toggled  number (binary): " + Integer.toBinaryString(toggledNumber));
        System.out.println("Toggled number (decimal): " + toggledNumber);

        sc.close();

    }
}

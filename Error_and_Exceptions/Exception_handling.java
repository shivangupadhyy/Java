package Error_and_Exceptions;

import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arry index");
        int ind = sc.nextInt();

        System.out.println("Enter the Number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("the value at arry index entered is : " + marks[ind]);
            System.out.println("The value of array-value/number is " + marks[ind]/number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occured!");
            System.out.println(e);
        }
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured!");
            System.out.println(e);
        }
         catch (Exception e) {
            System.out.println("Some exception Occured!");
            System.out.println(e);
        }
    }
}

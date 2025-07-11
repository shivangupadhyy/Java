package Error_and_Exceptions;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return " i am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return " age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the vlaue of age entered correct";
    }
}

public class Exception_Class {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a < 9) {
            try {
                // throw new MyException();
                throw new ArithmeticException("this is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("yes Finished");

        }
    }
}

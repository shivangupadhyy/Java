package Error_and_Exceptions;

public class Try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // without try

        int c = a / b;
        System.out.println("The Result is " + c);

        // with try
        // try {

        // int c= a/b;
        // System.out.println("The Result is " + c);

        // } catch (Exception e) {
        // System.out.println("There is any problem in this code Reason : ");
        // System.out.println(e);
        // }
        System.out.println("End of the program");
    }
}

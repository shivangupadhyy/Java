import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // if(n == 0){
        //     System.out.println("Zero");
        // } else if(n < 0){
        //     System.out.println("Negative Number");
        // } else {
        //     System.out.println("Positive Number");
        // }

        //q2 2.	Write a program that accepts a character and checks whether it is a vowel, consonant, digit, or special character.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your age:  ");
        // int age = sc.nextInt();
        // System.out.println("Enter your Salary: ");
        // double salary = sc.nextDouble();
        // System.out.println("Enter your Credit Score: ");
        // int creditScore = sc.nextInt();

        // if(age >= 21 && salary > 25000 && creditScore > 700){
        //     System.out.println("Eligible for Loan");
        // } else {
        //     System.out.println("Not Eligible for Loan");
        // }

        
        //Q3. 4.	Write a program to check if a number is Armstrong (e.g., 153 → 1³ + 5³ + 3³ = 153).

        int n = 152;
        int result  = 0;
        int originalNumber = n;
        while(originalNumber != 0){
            result  += Math.pow(originalNumber%10, 3);
            originalNumber = originalNumber/10;
        }
        if(result == n){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

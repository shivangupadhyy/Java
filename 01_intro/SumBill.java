import java.util.Scanner;
import java.util.*;

public class SumBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();
        double total = 0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.print("Enter the price of item " + i + ": ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("The total bill is: " + total);
    }
}

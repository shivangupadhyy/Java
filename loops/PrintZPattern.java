package loops;

import java.util.Scanner;

public class PrintZPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Input n

        // Check constraint
        if (n <= 2 || n > 20) {
            System.out.println("Invalid input. n must be > 2 and <= 20.");
            return;
        }

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // First or last row: print all '*'
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                // Middle rows: print spaces and one '*'
                for (int j = 0; j < n; j++) {
                    if (j == n - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Go to next line
        }

        sc.close();
    }
}

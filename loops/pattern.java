package loops;

public class pattern {
    public static void main(String[] args) {

        // Pattern 1: Solid Rectangle
        // int n = 4;
        // int m = 5;
        // for(int i = 1; i<= n; i++){           // Outer loop for rows
        //     for(int j =1; j<=m; j++){         // Inner loop for columns
        //         System.out.print("*");        // Print star
        //     }
        //     System.out.println();             // Move to next line after each row
        // }
        // Note: Prints a solid rectangle of stars with n rows and m columns.

        // Pattern 2: Hollow Rectangle
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {       // Outer loop for rows
        //     for (int j = 1; j <= m; j++) {   // Inner loop for columns
        //         if (i ==1 || j == 1 || i == n || j == m ) {
        //             System.out.print("*");    // Print star at border
        //         }else{
        //             System.out.print(" ");    // Print space inside
        //         }
        //     }
        //     System.out.println();
        // }
        // Note: Prints a rectangle with stars only on the border.

        // Pattern 3: Half Pyramid (Inverted)
        // int n = 4;
        // for(int i = n; i >= 1; i--){         // Outer loop for rows (decreasing)
        //     for(int j = 1; j <=i;j++){       // Inner loop for stars
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // Note: Prints an inverted half pyramid of stars.

        // Pattern 4: Number Pyramid
        // int n = 5 ;
        // for(int i=1; i<=n; i++){             // Outer loop for rows
        //    for(int j=1; j<=n-i+1; j++){      // Inner loop for numbers
        //     System.out.print(j);             // Print numbers from 1 up to n-i+1
        //    }
        //    System.out.println();
        // }
        // Note: Prints numbers in decreasing order per row.

        // Pattern 5: Floyd's Triangle
        // int n = 5 ;
        // int number = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(number+" "); // Print current number
        //         number++;                     // Increment number
        //     }
        //     System.out.println();
        // }
        // Note: Prints Floyd's triangle (consecutive numbers in a triangle).

        // Pattern 6: 0-1 Triangle
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        // Note: Prints a triangle of 0s and 1s, where the value depends on the sum of row and column indices.

    }
}

// /*
// GENERAL NOTES:
// - Use // for single-line comments and /* ... */ for multi-line comments.
// - Outer loops are usually for rows, inner loops for columns or elements in a row.
// - System.out.print() prints on the same line, System.out.println() moves to the next line.
// - Patterns are a great way to practice nested loops and logic in Java.
// - You can uncomment any section above to test that pattern.
// - Try changing the values of n and m to see different pattern sizes.
// */
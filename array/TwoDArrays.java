package array;

import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int col = sc.nextInt();
        // int[][] numbers = new int[rows][col];

        // // input
        // // rows
        // for (int i = 0; i < rows; i++) {
        //     // column
        //     for (int j = 0; j < col; j++) {
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }
        // int x = sc.nextInt();

        // output
        // for(int i=0; i<rows;i++){
        // for(int j=0; j<col;j++){
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < col; j++) {
        //         // compare with x
        //         if (numbers[i][j] == x) {
        //             System.out.println("x found at location( " + i + "," + j + ")");
        //         }
        //     }
        // }

        
      int n = sc.nextInt();
      int m = sc.nextInt();


      int matrix[][] = new int[n][m];
      for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               matrix[i][j] = sc.nextInt();
           }
      }

      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<m ;j++) {
          for(int i=0; i<n; i++) {
              System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }



    }
}

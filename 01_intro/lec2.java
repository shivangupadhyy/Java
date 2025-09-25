import java.util.Scanner;

public class lec2 {

    public static void sum(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("The sum of array is: "+ sum);
    }
    
    public static void main(String[] args) {
        /// Taking input from user  
        // Scanner sc = new Scanner(System.in);
        // String w = sc.nextLine();
        // int n  = sc.nextInt();
        // System.out.println("My name is : "+w);
        // System.out.println("multiplaication number is : "+ n * n);
        // sc.close();

        // Array `in Java
        // int marks[] = new int [5]; // Array declaration
        // marks[0] = 97;
        // marks[1] = 98;  
        // marks[2] = 95;
        // marks[3] = 96;
        // marks[4] = 99;
        // // marks[5] = 100; // Array index out of bound Exception
        // for(int i = 0; i<marks.length; i++){
        //     System.out.println("Marks are: "+ marks[i]);
        // }

        int arr[] = {1,2,3,4,5}; // Another way to declare and initialize an array

        sum(arr);        
        }
}

import java.util.Scanner;

class FindMax {
    // Method to find maximum element in array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class SumBill {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Create object of FindMax class
        FindMax obj1 = new FindMax();
        
        // Call method and get result
        int maximum = obj1.findMax(numbers);
        System.out.println("Maximum element in the array is: " + maximum);
        
        // Alternative: You can also make findMax static and call directly
        System.out.println("Maximum using static method: " + findMaxStatic(numbers));
    }
    
    // Static method to find maximum (alternative approach)
    public static int findMaxStatic(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

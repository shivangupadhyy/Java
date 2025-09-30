import java.util.*;

public class Demo{

    static class Car {
        String model ;
        String company;
        int price ;

        public void setModel(String model){
            this.model = model;
            System.out.println("Model of the car is : " + model);
        }

        public void setCompany(String company){
            this.company = company;
            System.out.println("Company of the car is : " + company);
        }
        public void setPrice(int price){
            this.price = price;
            System.out.println("Price of the car is : " + price);
        }
    }

    public static void main(String args []){

        // Scanner sc = new Scanner(System.in);
        // String model;
        // String company;
        // int price;
        // System.out.println("Enter the model of the car : ");
        // model = sc.nextLine();
        // Car car1 = new Car();
        // car1.setModel(model);

        // System.out.println("Enter the company of the car : ");
        // company = sc.nextLine();
        // car1.setCompany(company);

        // System.out.println("Enter the price of the car : ");
        // price = sc.nextInt();
        // car1.setPrice(price);
        // sc.close();


       int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        for(int i =0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of array elements is: " + sum);
        // task 1: Print your age
        // int age = 21; // Declare an integer variable
        // System.out.println("My age is " + age); // Print age to the console
        // int age = 21;
        // System.out.println("My age is : " + age);

        // task 2: Calculate area and circumference of a circle
        // Scanner sc = new Scanner(System.in); // Create Scanner for input
        // System.out.println("enter the radius of the circle: "); // Prompt user
        // double radius = sc.nextDouble(); // Read radius from user

        // final double PI = Math.PI; // Constant for PI
        // double circumference = 2 * PI * radius; // Calculate circumference
        // double area = PI * radius * radius; // Calculate area

        // System.out.printf("circumference of the circle : %.2f\n", circumference); // Print circumference
        // System.out.printf("Area of the circle : %.2f\n", area); // Print area
        // sc.close(); // Close Scanner

        // task 3: Print multiplication table for a number
        // Scanner sc = new Scanner(System.in); // Create Scanner for input
        // int a = sc.nextInt(); // Read number from user
        // System.out.println(a * 1); // Print a x 1
        // System.out.println(a * 2); // Print a x 2
        // System.out.println(a * 3); // Print a x 3
        // System.out.println(a * 4); // Print a x 4
        // System.out.println(a * 5); // Print a x 5
        // System.out.println(a * 6); // Print a x 6
        // System.out.println(a * 7); // Print a x 7
        // System.out.println(a * 8); // Print a x 8
        // System.out.println(a * 9); // Print a x 9
        // System.out.println(a * 10); // Print a x 10
        // sc.close(); // Close Scanner

        // NOTES:
        // - Use // for single-line comments and /* ... */ for multi-line comments.
        // - System.out.println() prints output to the console.
        // - System.out.printf() prints formatted output.
        // - Scanner is used for user input (import java.util.*;).
        // - Variables must be declared with a type (int, double, etc.).
        // - Use + to join strings and variables in output.
        // - Always close Scanner after use.
        // - Java statements end with a semicolon (;).
        // - Comments help explain code and are ignored by the compiler.
        // - You can uncomment any section above to test that part of the code.

    }
}
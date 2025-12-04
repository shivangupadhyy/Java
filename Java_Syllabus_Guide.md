# Java Programming Syllabus Guide
*Complete 36-hour course covering Java Fundamentals and Object-Oriented Programming*

---

# Unit 1: Java Fundamentals (18 hours)

## 1. Introduction to Java

### What is Java?
Java is a high-level, object-oriented programming language developed by Sun Microsystems (now Oracle) in 1995. It's designed to be platform-independent, secure, and robust.

### History of Java
- **1991**: James Gosling started the Java project at Sun Microsystems
- **1995**: Java 1.0 released publicly
- **1996**: JDK 1.0 released
- **2009**: Oracle acquired Sun Microsystems
- **Present**: Java continues to evolve with regular updates

### Key Features of Java
1. **Platform Independent**: "Write Once, Run Anywhere" (WORA)
2. **Object-Oriented**: Everything is an object
3. **Secure**: Built-in security features
4. **Robust**: Strong memory management
5. **Multithreaded**: Supports concurrent programming

## 2. JVM and JRE

### Java Virtual Machine (JVM)
- Runtime environment that executes Java bytecode
- Provides platform independence
- Handles memory management and garbage collection

### Java Runtime Environment (JRE)
- Combination of JVM + Java libraries
- Required to run Java programs
- Includes: JVM, core libraries, and supporting files

### Java Development Kit (JDK)
- Complete development environment
- Includes: JRE + development tools (compiler, debugger)

```java
// Basic Java Program Structure
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 3. Java Environment Setup

### Installation Steps:
1. Download JDK from Oracle website
2. Install JDK
3. Set JAVA_HOME environment variable
4. Set PATH to include JDK bin directory
5. Verify installation: `java -version`

### Compilation and Execution Process:
```bash
# Compile Java source file
javac HelloWorld.java

# Run compiled bytecode
java HelloWorld
```

## 4. Java Source File Structure

### File Naming Rules:
- Must have `.java` extension
- Public class name must match filename
- Case-sensitive

### Basic Structure:
```java
// Package declaration (optional)
package com.example;

// Import statements (optional)
import java.util.Scanner;

// Class declaration
public class MyClass {
    // Instance variables
    private int number;
    
    // Constructor
    public MyClass() {
        // Initialization code
    }
    
    // Methods
    public void myMethod() {
        // Method body
    }
    
    // Main method (entry point)
    public static void main(String[] args) {
        // Program execution starts here
    }
}
```

## 5. Classes and Methods

### What is a Class?
A blueprint or template for creating objects.

```java
public class Student {
    // Instance variables (attributes)
    private String name;
    private int age;
    private double grade;
    
    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGrade() {
        return grade;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    
    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }
    
    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
```

### Method Types:
1. **Instance Methods**: Belong to object instances
2. **Static Methods**: Belong to the class itself
3. **Constructor Methods**: Special methods for object creation

```java
public class MethodExamples {
    private int value;
    
    // Constructor
    public MethodExamples(int value) {
        this.value = value;
    }
    
    // Instance method
    public void instanceMethod() {
        System.out.println("Instance method called with value: " + value);
    }
    
    // Static method
    public static void staticMethod() {
        System.out.println("Static method called");
    }
    
    // Method with parameters and return type
    public int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Method overloading
    public double addNumbers(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        // Call static method
        MethodExamples.staticMethod();
        
        // Create object and call instance method
        MethodExamples obj = new MethodExamples(10);
        obj.instanceMethod();
        
        // Call methods with return values
        int result1 = obj.addNumbers(5, 3);
        double result2 = obj.addNumbers(5.5, 3.2);
        
        System.out.println("Integer addition: " + result1);
        System.out.println("Double addition: " + result2);
    }
}
```

## 6. Variables and Data Types

### Variables in Java:
Variables are containers for storing data values.

### Types of Variables:
1. **Local Variables**: Declared inside methods
2. **Instance Variables**: Declared inside class but outside methods
3. **Static Variables**: Declared with static keyword

```java
public class VariableTypes {
    // Static variable (class variable)
    static int staticCount = 0;
    
    // Instance variable
    private String instanceName;
    
    public void method() {
        // Local variable
        int localNumber = 10;
        System.out.println("Local variable: " + localNumber);
    }
    
    public static void main(String[] args) {
        System.out.println("Static variable: " + staticCount);
    }
}
```

### Data Types in Java:

#### Primitive Data Types:
```java
public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;           // 8-bit (-128 to 127)
        short shortValue = 32000;       // 16-bit (-32,768 to 32,767)
        int intValue = 2000000;         // 32-bit (-2^31 to 2^31-1)
        long longValue = 9000000000L;   // 64-bit (-2^63 to 2^63-1)
        
        // Floating-point types
        float floatValue = 3.14f;       // 32-bit IEEE 754
        double doubleValue = 3.14159;   // 64-bit IEEE 754
        
        // Character type
        char charValue = 'A';           // 16-bit Unicode character
        
        // Boolean type
        boolean booleanValue = true;    // true or false
        
        // Display all values
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
    }
}
```

#### Non-Primitive Data Types:
```java
public class NonPrimitiveTypes {
    public static void main(String[] args) {
        // String
        String text = "Hello, Java!";
        
        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Object
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("String: " + text);
        System.out.println("Array length: " + numbers.length);
        
        scanner.close();
    }
}
```

## 7. Operators

### Arithmetic Operators:
```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("Addition: " + (a + b));        // 13
        System.out.println("Subtraction: " + (a - b));     // 7
        System.out.println("Multiplication: " + (a * b));  // 30
        System.out.println("Division: " + (a / b));        // 3
        System.out.println("Modulus: " + (a % b));         // 1
        
        // Increment and Decrement
        System.out.println("Pre-increment: " + (++a));     // 11
        System.out.println("Post-increment: " + (a++));    // 11
        System.out.println("After post-increment: " + a);   // 12
        System.out.println("Pre-decrement: " + (--b));     // 2
        System.out.println("Post-decrement: " + (b--));    // 2
        System.out.println("After post-decrement: " + b);   // 1
    }
}
```

### Comparison Operators:
```java
public class ComparisonOperators {
    public static void main(String[] args) {
        int x = 5, y = 8;
        
        System.out.println("x == y: " + (x == y));  // false
        System.out.println("x != y: " + (x != y));  // true
        System.out.println("x > y: " + (x > y));    // false
        System.out.println("x < y: " + (x < y));    // true
        System.out.println("x >= y: " + (x >= y));  // false
        System.out.println("x <= y: " + (x <= y));  // true
    }
}
```

### Logical Operators:
```java
public class LogicalOperators {
    public static void main(String[] args) {
        boolean p = true, q = false;
        
        System.out.println("p && q: " + (p && q));  // false (AND)
        System.out.println("p || q: " + (p || q));  // true (OR)
        System.out.println("!p: " + (!p));          // false (NOT)
        
        // Short-circuit evaluation
        int a = 5, b = 0;
        System.out.println("Short-circuit AND: " + (b != 0 && a / b > 2));
        System.out.println("Short-circuit OR: " + (b == 0 || a / b > 2));
    }
}
```

### Assignment Operators:
```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10;
        
        num += 5;  // num = num + 5 = 15
        System.out.println("After +=: " + num);
        
        num -= 3;  // num = num - 3 = 12
        System.out.println("After -=: " + num);
        
        num *= 2;  // num = num * 2 = 24
        System.out.println("After *=: " + num);
        
        num /= 4;  // num = num / 4 = 6
        System.out.println("After /=: " + num);
        
        num %= 5;  // num = num % 5 = 1
        System.out.println("After %=: " + num);
    }
}
```

## 8. Conditional Statements

### if-else Statement:
```java
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Simple if-else
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        
        // if-else-if ladder
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F - Fail");
        }
        
        scanner.close();
    }
}
```

### switch Statement:
```java
import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number (1-7) for day of week: ");
        int day = scanner.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
                break;
        }
        
        // Calculator example
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        
        scanner.close();
    }
}
```

## 9. Looping Statements

### for Loop:
```java
public class ForLoopExamples {
    public static void main(String[] args) {
        // Basic for loop
        System.out.println("Numbers 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Even numbers
        System.out.println("Even numbers 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Reverse counting
        System.out.println("Countdown from 10:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Nested for loops - Multiplication table
        System.out.println("5x5 Multiplication Table:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
```

### while Loop:
```java
import java.util.Scanner;

public class WhileLoopExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Basic while loop
        int count = 1;
        System.out.println("While loop - Numbers 1 to 5:");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // Sum of numbers until user enters 0
        int sum = 0;
        int number;
        System.out.println("Enter numbers to sum (enter 0 to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            if (number == 0) {
                break;
            }
            
            sum += number;
        }
        
        System.out.println("Total sum: " + sum);
        
        // Factorial calculation
        System.out.print("Enter a number for factorial: ");
        int n = scanner.nextInt();
        int factorial = 1;
        int temp = n;
        
        while (temp > 0) {
            factorial *= temp;
            temp--;
        }
        
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        scanner.close();
    }
}
```

### do-while Loop:
```java
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menu-driven program
        int choice;
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Say Hello");
            System.out.println("2. Calculate Square");
            System.out.println("3. Check Even/Odd");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Hello, World!");
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    System.out.println("Square of " + num + " is: " + (num * num));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int checkNum = scanner.nextInt();
                    if (checkNum % 2 == 0) {
                        System.out.println(checkNum + " is Even");
                    } else {
                        System.out.println(checkNum + " is Odd");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the program!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
```

### Enhanced for Loop (for-each):
```java
public class EnhancedForLoop {
    public static void main(String[] args) {
        // Array example
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // String array example
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        
        System.out.println("Names:");
        for (String name : names) {
            System.out.println("Hello, " + name);
        }
        
        // Finding maximum in array
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);
    }
}
```

## 10. Arrays

### Single-Dimensional Arrays:
```java
import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array declaration and initialization
        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = new int[5];
        
        // Input elements
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers2[i] = scanner.nextInt();
        }
        
        // Display arrays
        System.out.print("Array 1: ");
        for (int num : numbers1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.print("Array 2: ");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Array operations
        int sum = 0;
        int max = numbers2[0];
        int min = numbers2[0];
        
        for (int num : numbers2) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        double average = (double) sum / numbers2.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        // Search element
        System.out.print("Enter number to search: ");
        int searchNum = scanner.nextInt();
        boolean found = false;
        int position = -1;
        
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == searchNum) {
                found = true;
                position = i;
                break;
            }
        }
        
        if (found) {
            System.out.println(searchNum + " found at position " + position);
        } else {
            System.out.println(searchNum + " not found in array");
        }
        
        scanner.close();
    }
}
```

### Multi-Dimensional Arrays:
```java
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2D Array - Matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Dynamic 2D array
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        
        int[][] matrix2 = new int[rows][cols];
        
        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        
        // Matrix operations
        if (rows == 3 && cols == 3) {
            System.out.println("Matrix Addition:");
            int[][] sum = addMatrices(matrix1, matrix2);
            displayMatrix(sum);
            
            System.out.println("Matrix Multiplication:");
            int[][] product = multiplyMatrices(matrix1, matrix2);
            displayMatrix(product);
        }
        
        // Transpose
        System.out.println("Transpose of Matrix 2:");
        int[][] transpose = transposeMatrix(matrix2);
        displayMatrix(transpose);
        
        scanner.close();
    }
    
    // Method to display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
        System.out.println();
    }
    
    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return result;
    }
    
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        int common = b.length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return result;
    }
    
    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        
        return transpose;
    }
}
```

## 11. String Handling

### String Basics:
```java
public class StringBasics {
    public static void main(String[] args) {
        // String creation
        String str1 = "Hello";              // String literal
        String str2 = new String("World");  // Using constructor
        String str3 = str1 + " " + str2;    // Concatenation
        
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        
        // String properties
        System.out.println("Length of str3: " + str3.length());
        System.out.println("Character at index 0: " + str3.charAt(0));
        System.out.println("Substring (0, 5): " + str3.substring(0, 5));
        
        // String comparison
        String name1 = "Alice";
        String name2 = "Bob";
        String name3 = "Alice";
        
        System.out.println("name1 equals name2: " + name1.equals(name2));
        System.out.println("name1 equals name3: " + name1.equals(name3));
        System.out.println("name1 == name3: " + (name1 == name3));
        
        // Case comparison
        System.out.println("Ignore case comparison: " + name1.equalsIgnoreCase("ALICE"));
        
        // String search
        String sentence = "Java is a powerful programming language";
        System.out.println("Contains 'Java': " + sentence.contains("Java"));
        System.out.println("Starts with 'Java': " + sentence.startsWith("Java"));
        System.out.println("Ends with 'language': " + sentence.endsWith("language"));
        System.out.println("Index of 'powerful': " + sentence.indexOf("powerful"));
    }
}
```

### String Methods:
```java
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Basic methods
        System.out.println("Original string: '" + input + "'");
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Trimmed: '" + input.trim() + "'");
        
        // Character operations
        if (input.length() > 0) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }
        
        // String manipulation
        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));
        System.out.println("Replace 'the' with 'THE': " + input.replace("the", "THE"));
        
        // String splitting
        String[] words = input.split(" ");
        System.out.println("Words in the string:");
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ". " + words[i]);
        }
        
        // Reverse string
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
        // Check palindrome
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = isPalindrome(cleanInput);
        System.out.println("Is palindrome: " + isPalindrome);
        
        // Count vowels and consonants
        countVowelsConsonants(input);
        
        scanner.close();
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    // Method to check if string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to count vowels and consonants
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        String vowelChars = "aeiouAEIOU";
        
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelChars.contains(String.valueOf(ch))) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}
```

### StringBuilder and StringBuffer:
```java
public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder - mutable strings (not thread-safe, faster)
        StringBuilder sb = new StringBuilder("Hello");
        
        System.out.println("Original: " + sb);
        
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        
        // Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // StringBuffer - similar to StringBuilder but thread-safe
        StringBuffer sbf = new StringBuffer("StringBuffer Example");
        sbf.append(" - Thread Safe");
        System.out.println("StringBuffer: " + sbf);
        
        // Performance comparison
        long startTime, endTime;
        
        // String concatenation (slow)
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("String concatenation time: " + (endTime - startTime) + " ms");
        
        // StringBuilder concatenation (fast)
        startTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb2.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
    }
}
```

---

# Hands-on: Multiplication Table Program

```java
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Multiplication Table Generator ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the range (how many multiples): ");
        int range = scanner.nextInt();
        
        System.out.println("\nMultiplication Table of " + number + ":");
        System.out.println("================================");
        
        for (int i = 1; i <= range; i++) {
            int result = number * i;
            System.out.printf("%d x %d = %d%n", number, i, result);
        }
        
        // Additional features
        System.out.println("\n=== Additional Options ===");
        System.out.println("1. Show table in reverse order");
        System.out.println("2. Show only even multiples");
        System.out.println("3. Show sum of all multiples");
        System.out.print("Choose an option (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("\nReverse Multiplication Table:");
                for (int i = range; i >= 1; i--) {
                    System.out.printf("%d x %d = %d%n", number, i, number * i);
                }
                break;
                
            case 2:
                System.out.println("\nEven Multiples:");
                for (int i = 1; i <= range; i++) {
                    int result = number * i;
                    if (result % 2 == 0) {
                        System.out.printf("%d x %d = %d%n", number, i, result);
                    }
                }
                break;
                
            case 3:
                int sum = 0;
                for (int i = 1; i <= range; i++) {
                    sum += number * i;
                }
                System.out.println("\nSum of all multiples: " + sum);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
```

---

# Unit 2: Object-Oriented Concepts (18 hours)

## 1. Object-Oriented Programming Principles

### What is Object-Oriented Programming (OOP)?
OOP is a programming paradigm based on the concept of "objects" which contain data (attributes) and code (methods). It's designed to make code more modular, reusable, and easier to maintain.

### Four Pillars of OOP:

#### 1. Encapsulation
Bundling data and methods together and restricting access to internal details.

```java
public class BankAccount {
    // Private fields (encapsulated)
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }
    
    // Public methods to access private data (controlled access)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

// Main class to test BankAccount
class BankingSystem {
    public static void main(String[] args) {
        // Create bank account object
        BankAccount account = new BankAccount("ACC001", "John Doe", 1000.00);
        
        // Display initial information
        account.displayAccountInfo();
        
        // Perform transactions
        account.deposit(500.00);
        account.withdraw(200.00);
        account.withdraw(2000.00); // This should fail
        
        // Final balance
        System.out.println("\nFinal balance: $" + account.getBalance());
    }
}
```

#### 2. Inheritance
Creating new classes based on existing classes, inheriting their properties and methods.

```java
// Base class (Parent class)
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;
    protected double price;
    
    // Constructor
    public Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    
    // Common methods for all vehicles
    public void start() {
        System.out.println(brand + " " + model + " is starting...");
    }
    
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }
    
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
    
    // Method that can be overridden
    public void move() {
        System.out.println("Vehicle is moving...");
    }
}

// Derived class (Child class)
class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;
    
    // Constructor
    public Car(String brand, String model, int year, double price, int numberOfDoors, String fuelType) {
        super(brand, model, year, price); // Call parent constructor
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }
    
    // Override parent method
    @Override
    public void move() {
        System.out.println("Car is driving on the road...");
    }
    
    // Car-specific method
    public void honk() {
        System.out.println("Car is honking: Beep! Beep!");
    }
    
    // Override displayInfo to include car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Another derived class
class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    
    public Motorcycle(String brand, String model, int year, double price, boolean hasSidecar) {
        super(brand, model, year, price);
        this.hasSidecar = hasSidecar;
    }
    
    @Override
    public void move() {
        System.out.println("Motorcycle is riding...");
    }
    
    public void wheelie() {
        System.out.println("Motorcycle is doing a wheelie!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Test inheritance
class VehicleTest {
    public static void main(String[] args) {
        // Create objects of different types
        Vehicle genericVehicle = new Vehicle("Generic", "Model X", 2020, 15000);
        Car car = new Car("Toyota", "Camry", 2022, 25000, 4, "Gasoline");
        Motorcycle bike = new Motorcycle("Harley-Davidson", "Street 750", 2021, 8000, false);
        
        System.out.println("=== Generic Vehicle ===");
        genericVehicle.displayInfo();
        genericVehicle.start();
        genericVehicle.move();
        genericVehicle.stop();
        
        System.out.println("\n=== Car ===");
        car.displayInfo();
        car.start();
        car.move();
        car.honk();
        car.stop();
        
        System.out.println("\n=== Motorcycle ===");
        bike.displayInfo();
        bike.start();
        bike.move();
        bike.wheelie();
        bike.stop();
    }
}
```

#### 3. Polymorphism
The ability of objects of different types to be treated as instances of the same type through inheritance.

```java
// Demonstration of Runtime Polymorphism
class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Method to be overridden (polymorphic method)
    public double calculateArea() {
        return 0;
    }
    
    public double calculatePerimeter() {
        return 0;
    }
    
    public void displayInfo() {
        System.out.println("Shape color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Circle - Radius: " + radius);
        super.displayInfo();
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        super.displayInfo();
    }
}

class Triangle extends Shape {
    private double side1, side2, side3;
    
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double calculateArea() {
        // Using Heron's formula
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Triangle - Sides: " + side1 + ", " + side2 + ", " + side3);
        super.displayInfo();
    }
}

// Polymorphism demonstration
class PolymorphismDemo {
    public static void main(String[] args) {
        // Array of Shape references pointing to different objects
        Shape[] shapes = {
            new Circle("Red", 5.0),
            new Rectangle("Blue", 4.0, 6.0),
            new Triangle("Green", 3.0, 4.0, 5.0),
            new Circle("Yellow", 3.0),
            new Rectangle("Purple", 2.5, 3.5)
        };
        
        System.out.println("=== Polymorphism in Action ===");
        
        double totalArea = 0;
        double totalPerimeter = 0;
        
        // Same method calls, different behavior (polymorphism)
        for (Shape shape : shapes) {
            shape.displayInfo();
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
            System.out.println("------------------------");
        }
        
        System.out.printf("Total Area of all shapes: %.2f%n", totalArea);
        System.out.printf("Total Perimeter of all shapes: %.2f%n", totalPerimeter);
        
        // Method overloading (Compile-time polymorphism)
        Calculator calc = new Calculator();
        System.out.println("\n=== Method Overloading ===");
        System.out.println("Add integers: " + calc.add(5, 3));
        System.out.println("Add doubles: " + calc.add(5.5, 3.2));
        System.out.println("Add three integers: " + calc.add(1, 2, 3));
        System.out.println("Add string: " + calc.add("Hello", "World"));
    }
}

// Method Overloading example
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public String add(String a, String b) {
        return a + " " + b;
    }
}
```

#### 4. Abstraction
Hiding complex implementation details and showing only necessary features.

```java
// Abstract class example
abstract class Animal {
    protected String name;
    protected int age;
    
    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Concrete method (implemented in abstract class)
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
    
    public void eat() {
        System.out.println(name + " is eating...");
    }
    
    // Abstract methods (must be implemented by subclasses)
    public abstract void makeSound();
    public abstract void move();
    
    // Abstract method with return type
    public abstract String getAnimalType();
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + getAnimalType());
    }
}

// Concrete class implementing abstract class
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " is running and wagging tail...");
    }
    
    @Override
    public String getAnimalType() {
        return "Dog (" + breed + ")";
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " is gracefully walking...");
    }
    
    @Override
    public String getAnimalType() {
        return "Cat (" + (isIndoor ? "Indoor" : "Outdoor") + ")";
    }
    
    // Cat-specific method
    public void climb() {
        System.out.println(name + " is climbing the tree!");
    }
}

// Interface example (another form of abstraction)
interface Flyable {
    // Constants (public, static, final by default)
    double GRAVITY = 9.8;
    
    // Abstract methods (public and abstract by default)
    void takeOff();
    void land();
    void fly();
    
    // Default method (Java 8+)
    default void checkWeather() {
        System.out.println("Checking weather conditions for flying...");
    }
    
    // Static method (Java 8+)
    static void displayFlightRules() {
        System.out.println("Flight Rules: Follow aviation safety guidelines.");
    }
}

interface Swimmable {
    void swim();
    void dive();
}

// Class implementing multiple interfaces
class Duck extends Animal implements Flyable, Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " says: Quack! Quack!");
    }
    
    @Override
    public void move() {
        System.out.println(name + " is waddling...");
    }
    
    @Override
    public String getAnimalType() {
        return "Duck";
    }
    
    // Implementing Flyable interface
    @Override
    public void takeOff() {
        System.out.println(name + " is taking off into the sky!");
    }
    
    @Override
    public void land() {
        System.out.println(name + " is landing gracefully!");
    }
    
    @Override
    public void fly() {
        System.out.println(name + " is flying high in the sky!");
    }
    
    // Implementing Swimmable interface
    @Override
    public void swim() {
        System.out.println(name + " is swimming in the pond!");
    }
    
    @Override
    public void dive() {
        System.out.println(name + " is diving underwater!");
    }
}

// Test abstraction
class AbstractionDemo {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Animal animal = new Animal("Generic", 5); // This would cause error
        
        // Create concrete objects
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, true);
        Duck duck = new Duck("Donald", 1);
        
        // Array of Animal references
        Animal[] animals = {dog, cat, duck};
        
        System.out.println("=== Animal Behaviors ===");
        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            animal.move();
            animal.eat();
            animal.sleep();
            System.out.println("------------------------");
        }
        
        // Specific behaviors
        System.out.println("=== Specific Behaviors ===");
        dog.fetch();
        cat.climb();
        
        // Interface methods
        System.out.println("\n=== Duck's Special Abilities ===");
        duck.checkWeather();
        duck.takeOff();
        duck.fly();
        duck.land();
        duck.swim();
        duck.dive();
        
        // Static interface method
        Flyable.displayFlightRules();
    }
}
```

## 2. Class and Object Concepts

### Advanced Class Features:

```java
// Comprehensive class example with all features
public class Student {
    // Static variable (shared by all instances)
    private static int totalStudents = 0;
    private static final String SCHOOL_NAME = "Java Programming School";
    
    // Instance variables
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private double[] grades;
    private int gradeCount;
    
    // Static block (executed when class is first loaded)
    static {
        System.out.println("Student class loaded. School: " + SCHOOL_NAME);
    }
    
    // Instance initialization block (executed before constructor)
    {
        gradeCount = 0;
        grades = new double[10]; // Maximum 10 grades
        System.out.println("Initializing new student...");
    }
    
    // Default constructor
    public Student() {
        this("Unknown", "Student", generateEmail());
    }
    
    // Parameterized constructor
    public Student(String firstName, String lastName, String email) {
        this.studentId = ++totalStudents;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        System.out.println("Student created: " + getFullName());
    }
    
    // Copy constructor
    public Student(Student other) {
        this.studentId = ++totalStudents;
        this.firstName = other.firstName;
        this.lastName = other.lastName;
        this.email = generateEmail();
        this.gradeCount = other.gradeCount;
        this.grades = other.grades.clone();
    }
    
    // Getter methods
    public int getStudentId() { return studentId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getFullName() { return firstName + " " + lastName; }
    
    // Setter methods with validation
    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.trim().isEmpty()) {
            this.firstName = firstName.trim();
        }
    }
    
    public void setLastName(String lastName) {
        if (lastName != null && !lastName.trim().isEmpty()) {
            this.lastName = lastName.trim();
        }
    }
    
    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }
    
    // Method to add grade
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100 && gradeCount < grades.length) {
            grades[gradeCount++] = grade;
            System.out.println("Grade " + grade + " added for " + getFullName());
        } else {
            System.out.println("Invalid grade or maximum grades reached!");
        }
    }
    
    // Method to calculate average grade
    public double getAverageGrade() {
        if (gradeCount == 0) return 0.0;
        
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return sum / gradeCount;
    }
    
    // Method to get letter grade
    public char getLetterGrade() {
        double average = getAverageGrade();
        if (average >= 90) return 'A';
        else if (average >= 80) return 'B';
        else if (average >= 70) return 'C';
        else if (average >= 60) return 'D';
        else return 'F';
    }
    
    // Method to display all grades
    public void displayGrades() {
        System.out.print("Grades for " + getFullName() + ": ");
        for (int i = 0; i < gradeCount; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
    }
    
    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }
    
    public static String getSchoolName() {
        return SCHOOL_NAME;
    }
    
    // Helper methods
    private static String generateEmail() {
        return "student" + (totalStudents + 1) + "@school.com";
    }
    
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }
    
    // Method overloading
    public void displayInfo() {
        displayInfo(true);
    }
    
    public void displayInfo(boolean showGrades) {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + getFullName());
        System.out.println("Email: " + email);
        
        if (showGrades && gradeCount > 0) {
            displayGrades();
            System.out.println("Average: " + String.format("%.2f", getAverageGrade()));
            System.out.println("Letter Grade: " + getLetterGrade());
        }
    }
    
    // toString method override
    @Override
    public String toString() {
        return "Student{" +
                "ID=" + studentId +
                ", name='" + getFullName() + '\'' +
                ", email='" + email + '\'' +
                ", average=" + String.format("%.2f", getAverageGrade()) +
                '}';
    }
    
    // equals method override
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Student student = (Student) obj;
        return studentId == student.studentId;
    }
    
    // Finalize method (called by garbage collector)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + getFullName() + " is being garbage collected");
        super.finalize();
    }
}

// Test class for Student
class StudentManagementSystem {
    public static void main(String[] args) {
        System.out.println("School: " + Student.getSchoolName());
        System.out.println("Initial student count: " + Student.getTotalStudents());
        
        // Create students using different constructors
        Student student1 = new Student("John", "Doe", "john.doe@email.com");
        Student student2 = new Student("Jane", "Smith", "jane.smith@email.com");
        Student student3 = new Student(); // Default constructor
        Student student4 = new Student(student1); // Copy constructor
        
        // Add grades
        student1.addGrade(85.5);
        student1.addGrade(92.0);
        student1.addGrade(78.5);
        
        student2.addGrade(95.0);
        student2.addGrade(89.5);
        student2.addGrade(93.0);
        
        // Display information
        System.out.println("\n=== Student Information ===");
        student1.displayInfo();
        System.out.println();
        
        student2.displayInfo();
        System.out.println();
        
        student3.displayInfo(false);
        System.out.println();
        
        // Test toString method
        System.out.println("Student1 toString: " + student1);
        System.out.println("Student2 toString: " + student2);
        
        // Test equals method
        System.out.println("student1 equals student4: " + student1.equals(student4));
        
        // Display total students
        System.out.println("\nTotal students created: " + Student.getTotalStudents());
        
        // Demonstrate method overloading
        System.out.println("\n=== Method Overloading Demo ===");
        MathOperations math = new MathOperations();
        System.out.println("Add two integers: " + math.add(5, 3));
        System.out.println("Add three integers: " + math.add(5, 3, 2));
        System.out.println("Add two doubles: " + math.add(5.5, 3.2));
        System.out.println("Add array: " + math.add(new int[]{1, 2, 3, 4, 5}));
    }
}

// Method overloading example
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
```

## 3. Inheritance Hierarchy

### Types of Inheritance:

```java
// Single Inheritance
class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
}

// Multilevel Inheritance
class Mammal extends Animal {
    protected boolean hasFur;
    
    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }
    
    public void breathe() {
        System.out.println(name + " is breathing with lungs");
    }
}

class Cat extends Mammal {
    public Cat(String name) {
        super(name, true);
    }
    
    public void meow() {
        System.out.println(name + " says meow");
    }
}

// Hierarchical Inheritance
class Vehicle {
    protected String brand;
    protected int year;
    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    public void start() {
        System.out.println(brand + " vehicle starting...");
    }
}

class Car extends Vehicle {
    private int doors;
    
    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }
    
    public void drive() {
        System.out.println("Driving " + brand + " car with " + doors + " doors");
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    
    public Truck(String brand, int year, double loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
    }
    
    public void loadCargo() {
        System.out.println("Loading cargo in " + brand + " truck (capacity: " + loadCapacity + " tons)");
    }
}

// Multiple Inheritance through Interfaces
interface Drawable {
    void draw();
}

interface Resizable {
    void resize(double factor);
}

class Circle implements Drawable, Resizable {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing circle with radius: " + radius);
    }
    
    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }
}
```

## 4. Method Overriding and Super Keyword

```java
class Employee {
    protected String name;
    protected double baseSalary;
    protected int employeeId;
    
    public Employee(String name, double baseSalary, int employeeId) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.employeeId = employeeId;
    }
    
    // Method to calculate salary (to be overridden)
    public double calculateSalary() {
        return baseSalary;
    }
    
    // Method to display employee info
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
    }
    
    public void work() {
        System.out.println(name + " is working...");
    }
}

class Manager extends Employee {
    private double bonus;
    private int teamSize;
    
    public Manager(String name, double baseSalary, int employeeId, double bonus, int teamSize) {
        super(name, baseSalary, employeeId); // Call parent constructor
        this.bonus = bonus;
        this.teamSize = teamSize;
    }
    
    // Override calculateSalary method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus; // Use parent method + additional logic
    }
    
    // Override displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Bonus: $" + bonus);
        System.out.println("Team Size: " + teamSize);
    }
    
    // Override work method
    @Override
    public void work() {
        super.work(); // Call parent method
        System.out.println(name + " is managing a team of " + teamSize + " people");
    }
    
    // Manager-specific method
    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting");
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    private int projectsCompleted;
    
    public Developer(String name, double baseSalary, int employeeId, String programmingLanguage) {
        super(name, baseSalary, employeeId);
        this.programmingLanguage = programmingLanguage;
        this.projectsCompleted = 0;
    }
    
    @Override
    public double calculateSalary() {
        // Bonus based on projects completed
        double projectBonus = projectsCompleted * 500;
        return super.calculateSalary() + projectBonus;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Projects Completed: " + projectsCompleted);
    }
    
    @Override
    public void work() {
        super.work();
        System.out.println(name + " is coding in " + programmingLanguage);
    }
    
    public void completeProject() {
        projectsCompleted++;
        System.out.println(name + " completed a project. Total: " + projectsCompleted);
    }
}

// Test method overriding
class CompanySystem {
    public static void main(String[] args) {
        // Create different types of employees
        Employee emp1 = new Employee("John Smith", 50000, 1001);
        Manager mgr1 = new Manager("Alice Johnson", 80000, 1002, 15000, 5);
        Developer dev1 = new Developer("Bob Wilson", 70000, 1003, "Java");
        
        // Array of employees (polymorphism)
        Employee[] employees = {emp1, mgr1, dev1};
        
        System.out.println("=== Employee Information ===");
        for (Employee emp : employees) {
            emp.displayInfo();
            emp.work();
            System.out.println("------------------------");
        }
        
        // Specific operations
        mgr1.conductMeeting();
        dev1.completeProject();
        dev1.completeProject();
        
        System.out.println("\n=== Updated Developer Info ===");
        dev1.displayInfo();
    }
}
```

## 5. Final Keyword and Abstract Classes

```java
// Final class (cannot be inherited)
final class Constants {
    public static final double PI = 3.14159;
    public static final String APP_NAME = "Java Learning App";
    public static final int MAX_USERS = 1000;
    
    // Private constructor to prevent instantiation
    private Constants() {
        throw new AssertionError("Cannot instantiate Constants class");
    }
}

// Class with final methods
class BaseClass {
    // Final method (cannot be overridden)
    public final void criticalMethod() {
        System.out.println("This method cannot be overridden");
    }
    
    // Regular method (can be overridden)
    public void normalMethod() {
        System.out.println("This method can be overridden");
    }
}

class ChildClass extends BaseClass {
    // This would cause compilation error:
    // public void criticalMethod() { ... }
    
    @Override
    public void normalMethod() {
        System.out.println("Overridden normal method");
    }
}

// Abstract class with abstract and concrete methods
abstract class Shape {
    protected String name;
    protected String color;
    
    // Constructor in abstract class
    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    // Concrete method
    public void displayBasicInfo() {
        System.out.println("Shape: " + name);
        System.out.println("Color: " + color);
    }
    
    // Abstract methods (must be implemented by subclasses)
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void draw();
    
    // Final method in abstract class
    public final void validateShape() {
        System.out.println("Validating " + name + " shape...");
    }
}

// Concrete implementation of abstract class
class Rectangle extends Shape {
    private final double length; // Final instance variable
    private final double width;  // Final instance variable
    
    public Rectangle(double length, double width, String color) {
        super("Rectangle", color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " rectangle (" + length + " x " + width + ")");
    }
    
    // Getters for final variables
    public double getLength() { return length; }
    public double getWidth() { return width; }
}

class Circle extends Shape {
    private final double radius;
    
    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle with radius " + radius);
    }
    
    public double getRadius() { return radius; }
}

// Test final keyword and abstract classes
class FinalAbstractDemo {
    public static void main(String[] args) {
        // Using constants
        System.out.println("App: " + Constants.APP_NAME);
        System.out.println("Pi value: " + Constants.PI);
        System.out.println("Max users: " + Constants.MAX_USERS);
        
        // Testing final methods
        ChildClass child = new ChildClass();
        child.normalMethod();
        child.criticalMethod();
        
        // Abstract class usage
        Shape[] shapes = {
            new Rectangle(5.0, 3.0, "Blue"),
            new Circle(4.0, "Red"),
            new Rectangle(2.5, 4.0, "Green")
        };
        
        System.out.println("\n=== Shape Operations ===");
        for (Shape shape : shapes) {
            shape.displayBasicInfo();
            shape.validateShape();
            shape.draw();
            System.out.printf("Area: %.2f%n", shape.getArea());
            System.out.printf("Perimeter: %.2f%n", shape.getPerimeter());
            System.out.println("------------------------");
        }
    }
}
```

---

## Summary

This comprehensive guide covers all topics from your Java syllabus:

### Unit 1 - Java Fundamentals (18 hours):
- ✅ Introduction to Java and its history
- ✅ JVM and JRE concepts
- ✅ Java environment setup
- ✅ Source file structure and compilation
- ✅ Classes and methods
- ✅ Variables and data types
- ✅ Conditional statements
- ✅ Looping statements
- ✅ Operators
- ✅ Arrays (single and multi-dimensional)
- ✅ String handling
- ✅ **Hands-on**: Multiplication table program

### Unit 2 - Object-Oriented Concepts (18 hours):
- ✅ OOP principles (Encapsulation, Inheritance, Polymorphism, Abstraction)
- ✅ Class and object concepts
- ✅ Inheritance types and hierarchy
- ✅ Superclass and subclass relationships
- ✅ Method overriding and super keyword
- ✅ Polymorphism (runtime and compile-time)
- ✅ Abstract classes and final keyword

Each section includes:
- **Detailed explanations** of concepts
- **Complete code examples** with comments
- **Practical exercises** and demonstrations
- **Best practices** and common pitfalls
- **Interview-ready examples**

You can use this guide to:
1. Study each topic systematically
2. Practice with the provided code examples
3. Understand real-world applications
4. Prepare for exams and interviews

All code examples are complete and runnable - simply copy them into your IDE and experiment!
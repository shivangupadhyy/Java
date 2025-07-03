package oops;

// Base class ekClass
class ekClass{
    int a; // Field to store value

    // Getter for 'a'
    public int getA(){
        return a;
    }

    // Constructor using 'this' keyword to distinguish between field and parameter
    ekClass(int a){
        this.a = a; // 'this.a' refers to the field, 'a' is the parameter
    }

    // Method returning 1
    public int returnOne(){
        return 1;
    }
}
    
// Derived class DoClass extends ekClass
class DoClass extends ekClass{
    // Constructor for DoClass uses 'super' to call parent constructor
    DoClass(int c){
        super(c); // Calls ekClass(int a) constructor
        System.out.println("main ek constructor hu"); // Prints message after parent constructor
    }
}

// Main class to demonstrate 'this' and 'super' keywords
public class This_Super {
    public static void main(String[] args) {
        // Creating ekClass object with value 5
        ekClass e = new ekClass(5);
        // Creating DoClass object with value 65 (calls ekClass constructor first)
        DoClass c = new DoClass(65);
        // Printing value of 'a' from ekClass object
        System.out.println(e.getA()); // Output: 5
    }
}

/*
Code Explanation:
- 'this' keyword is used to refer to the current object's field when parameter names are the same.
- 'super' keyword is used in the derived class constructor to call the parent class constructor.
- When creating a DoClass object, the ekClass constructor runs first (due to 'super'), then DoClass's constructor body executes.
- Demonstrates constructor chaining and the use of 'this' and 'super' in Java inheritance.
*/

package oops;
// Base class with a constructor
class base1{
    // This constructor runs when a base1 or derived1 object is created
    base1(){
        System.out.println("mai ek constuctor hu"); // Prints when base1 constructor is called
    }
}

// Derived class extending base1
class derived1 extends base1 {
    // Constructor for derived1
    derived1() {
        // The base1 constructor is called automatically before this
        System.out.println(" i am a drived class constructor"); // Prints when derived1 constructor is called
    }
}

// Main class to demonstrate constructor chaining in inheritance
public class Constructor_in_inheritance {
    public static void main(String[] args) {
        // Creating a base1 object: only base1 constructor runs
        base1 b = new base1();

        // Creating a derived1 object: base1 constructor runs first, then derived1 constructor
        derived1 d = new derived1();
    }
}

/*
Code Explanation:
- When a derived class object is created, the base class constructor is called first, then the derived class constructor.
- Output when creating derived1: 
  mai ek constuctor hu
   i am a drived class constructor
- This demonstrates constructor chaining in Java inheritance.
*/

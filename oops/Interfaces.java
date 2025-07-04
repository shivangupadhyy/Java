package oops;

// Interface Bicyle defines contract for bicycle behavior
interface Bicyle{
    int a = 45; // Interface variables are public, static, and final by default
    void applybrake(int decrement); // Abstract method
    void speedUp(int increment);    // Abstract method
}

// Interface HornBicyle defines contract for horn behavior
interface HornBicyle{
    void blowHornayu();
    void blowhornShiv();
}

// avoncycle implements both Bicyle and HornBicyle interfaces
class avoncycle implements Bicyle, HornBicyle{
    // Additional method not in interface
    void blowHorn(){
        System.out.println("pee pee poo poo");
    }
    // Implementing Bicyle methods
    public void applybrake(int decrement){
        System.out.println("appplying brake");
    }
    public void speedUp(int increment){
        System.out.println("applying speedUP");
    }
    // Implementing HornBicyle methods
    public void blowHornayu(){
        System.out.println("kabhi khudhi kabhi kghum");
    }
    public void blowhornShiv(){
        System.out.println("har har mahadev");
    }
}

// Main class to demonstrate interface usage
public class Interfaces {
    public static void main(String[] args) {
        avoncycle cycleShiv = new avoncycle();
        cycleShiv.applybrake(1); // Calls implemented method
        // You can access interface properties (they are static and final)
        System.out.println(cycleShiv.a); // Prints 45
        // You cannot modify interface properties (uncommenting below will cause error)
        // cycleShiv.a = 445;
        // System.out.println(cycleShiv.a);
        cycleShiv.blowHornayu(); // Calls implemented method
        cycleShiv.blowhornShiv(); // Calls implemented method
    }
}

/*
Notes for Better Understanding:
- Interfaces in Java define a contract (set of methods) that implementing classes must fulfill.
- All fields in interfaces are public, static, and final by default (constants).
- All methods in interfaces are abstract (unless default/static methods in Java 8+).
- A class can implement multiple interfaces, allowing for multiple inheritance of type.
- You cannot instantiate an interface directly, but you can reference an object via its interface type.
- Interface variables cannot be changed (they are final constants).
- Implementing classes must provide concrete implementations for all interface methods.
- This example shows a class implementing two interfaces and providing all required methods.
*/



/*Multiple inheritance (a class inheriting from more than one class) is not supported in Java to avoid ambiguity and complexity, especially the "Diamond Problem."

Diamond Problem Example:
If two parent classes have a method with the same name, and a child class inherits from both, the compiler cannot decide which method to use. This leads to ambiguity.

Java’s Solution:

Java allows multiple inheritance of type through interfaces, not classes.
A class can implement multiple interfaces, but can only extend one class.
This keeps the language simple, avoids ambiguity, and makes code easier to maintain.
Summary:
Multiple inheritance is not supported in Java to prevent confusion and errors from ambiguous method inheritance. Interfaces provide a safe way to achieve similar flexibility. */

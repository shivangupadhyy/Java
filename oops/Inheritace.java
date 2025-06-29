package oops;

// Base class demonstrating inheritance
class base{
    int x; // Field in base class

    // Getter for x with a print statement
    public int getX(){
        System.out.println("i am getting x from base class");
        return x;
    }

    // Setter for x with a print statement
    public void setX(int x){
        System.out.println("setting the x base class");
        this.x = x;
    }

    // Method in base class
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

// Derived class inherits from base
class Derived extends base{
    int y; // Additional field in derived class

    // Getter for y
    public int getY(){
        return y;
    }

    // Setter for y
    public void setY(int y){
        this.y = y;
    }
}

// Main class to demonstrate inheritance
public class Inheritace {
    public static void main(String[] args) {
        // Creating an object of base class
        // base b = new base();
        // b.setX(4); // Set value of x in base class
        // System.out.println(b.getX()); // Get value of x from base class

        // Creating an object of derived class
        // Derived d = new Derived();
        // d.setX(4); // Inherited method from base class
        // System.out.println(d.getX()); // Inherited method from base class
        // d.setY(10); // Method from derived class
        // System.out.println(d.getY()); // Method from derived class
    }
}

/*
Code Explanation:
- The 'base' class defines a field and methods for x.
- The 'Derived' class extends 'base', inheriting its fields and methods, and adds its own field y.
- In main, you can create objects of both classes. The derived class object can use both base and derived class methods.
- This demonstrates the concept of inheritance in Java, which promotes code reuse and logical hierarchy.


Java Inheritance – Key Notes

Inheritance Basics:

Inheritance allows a class (child/derived) to acquire properties and methods of another class (parent/base).
The Derived class extends the base class, so it inherits all fields and methods of base.
Base Class (base):

Contains an integer field x.
Provides getter (getX) and setter (setX) methods for x, with print statements to show when they're called.
Has a method printMe() to demonstrate a method in the base class.
Derived Class (Derived):

Inherits all members of base.
Adds its own field y with getter (getY) and setter (setY) methods.
Object Creation:

You can create an object of the base class and use its methods.
You can create an object of the derived class, which can use both its own methods and those inherited from the base class.
Usage Example:

Derived d = new Derived();
d.setX(4); // Inherited from base
System.out.println(d.getX()); // Inherited from base
d.setY(10); // Defined in Derived
System.out.println(d.getY()); // Defined in Derived
Takeaway:

Inheritance promotes code reuse and logical hierarchy.
The derived class can use and override base class methods.
Constructors are not inherited, but the derived class can call the base class constructor.
Let me know if you want more details or a different format!
*/

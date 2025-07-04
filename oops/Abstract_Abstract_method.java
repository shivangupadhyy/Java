package oops;

// Abstract base class with a constructor, a concrete method, and an abstract method
abstract class base{
    public base(){
        System.out.println("mai base 2 ka constructor hu");
    }

    public void sayHello(){
        System.out.println("hello World");
    }

    // Abstract method: must be implemented by subclasses
    abstract public void greet();
}

// Concrete subclass that implements the abstract method
class child extends base{
    @Override
    public void greet() {
        System.out.println("Greetings from child class");
    }
}

// Abstract subclass: does not implement greet(), so remains abstract
abstract class child2 extends base{
    // No implementation for greet(), so this class is still abstract
}

public class Abstract_Abstract_method {
    public static void main(String[] args) {
        // base b = new base(); // --error: cannot instantiate abstract class
        base b = new child(); // Allowed: child implements all abstract methods

        // child2 c = new child2(); // --error: cannot instantiate abstract class
    }
}

/*
Notes on Abstract Classes and Methods:
- An abstract class cannot be instantiated directly (cannot create 'new base()').
- Abstract methods have no body and must be implemented by concrete subclasses.
- If a subclass does not implement all abstract methods, it must also be declared abstract.
- You can use an abstract class reference to refer to a concrete subclass object (e.g., 'base b = new child();').
- Abstract classes can have constructors and concrete (non-abstract) methods.
- Attempting to instantiate an abstract class (like 'base' or 'child2') will result in a compile-time error.
*/

package oops;

// Base class Phone
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void on(){
        System.out.println("Turing on the Phone");
    }
}

// Derived class SmartPhone extends Phone
class SmartPhone extends Phone{
    public void sawat(){
        System.out.println("Apka sawagat hai");
    }

    // Overriding the on() method
    public void on(){
        System.out.println("Turing on samrtPhone");
    }
}

// Main class to demonstrate dynamic method dispatch
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        // Phone obj = new Phone(); // Allowed: reference and object are same type
        // SmartPhone pho = new SmartPhone(); // Allowed: reference and object are same type

        Phone obj = new SmartPhone(); // Allowed: reference of parent, object of child
        // SmartPhone ob2 = new Phone(); // Not allowed: cannot assign parent object to child reference

        obj.greet(); // Calls greet() from Phone (not overridden)
        obj.on();    // Calls on() from SmartPhone (overridden)
    }
}

/*
Notes on Dynamic Method Dispatch (Runtime Polymorphism):
- Dynamic method dispatch allows a superclass reference to refer to a subclass object.
- At runtime, Java determines which method implementation to execute based on the actual object type (not the reference type).
- Only overridden methods are dynamically dispatched. Non-overridden methods (or new methods in subclass) are not accessible via the superclass reference.
- In this example, obj.on() calls SmartPhone's version of on(), but obj.greet() calls Phone's version because it is not overridden.
- You cannot call methods that are only in the subclass (like sawat()) using a superclass reference.
- This is a key feature for achieving runtime polymorphism in Java.
*/

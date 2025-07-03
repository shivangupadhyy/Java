package oops;


// Class A with a method to be overridden
class A{
    public int a;

    public int harry(){
        return 4;
    }

    // Method to be overridden in subclass
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

// Class B extends A and overrides meth2
class B extends A{
    // Overriding meth2 from class A
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    // Additional method in class B
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

// Main class to demonstrate method overriding
public class Method_OverRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2(); // Calls meth2 from class A

        B b = new B();
        b.meth3(); // Calls meth3 from class B
        b.meth2(); // Calls overridden meth2 from class B
    }
}

/*
Notes on Method Overriding:
- Method overriding occurs when a subclass provides a specific implementation for a method already defined in its superclass.
- The method in the subclass must have the same name, return type, and parameters as in the superclass.
- Overriding allows runtime polymorphism: the method of the actual object's class is called.
- In the example, B overrides meth2() from A. When called on a B object, B's version runs.

Rules when it is NOT overriding:
- If the method signature (name, parameters, or return type) is different, it is not overriding (it is overloading or a new method).
- If the method in the subclass is static, it hides the superclass method, not overrides it.
- Private, final, or static methods cannot be overridden.
- The access level of the overriding method cannot be more restrictive than the overridden method.
*/

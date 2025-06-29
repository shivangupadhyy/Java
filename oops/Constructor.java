package oops;

// This class demonstrates the use of constructors and encapsulation in Java
class MyMainEmployee {
    // Private fields: only accessible within this class
    private int id;
    private String name;

    // Parameterized constructor: allows setting initial values for name and id
    public MyMainEmployee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    // Getter for name: provides read access to the private field 'name'
    public String getName() {
        return name;
    }

    // Setter for name: allows controlled modification of 'name'
    public void setName(String n) {
        this.name = n;
    }

    // Setter for id: allows controlled modification of 'id'
    public void setId(int i) {
        this.id = i;
    }

    // Getter for id: provides read access to the private field 'id'
    public int getId() {
        return id;
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Creating an object of MyMainEmployee using the parameterized constructor
        MyMainEmployee harry = new MyMainEmployee("ShivangUpadhyay", 14);
        // You can also set values later using setters:
        // harry.setName("Shivang");
        // harry.setId(22);

        // Printing the id and name using getter methods
        System.out.println(harry.getId());   // Output: 14
        System.out.println(harry.getName()); // Output: ShivangUpadhyay
    }
}

/*
Code Explanation:
- The MyMainEmployee class uses private fields for encapsulation, so data is protected from direct access.
- The parameterized constructor allows you to set the name and id at the time of object creation.
- Getter and setter methods provide controlled access to the fields.
- In main, an object is created and initialized, and its data is accessed using getters.
- This approach is a best practice in Java for secure and maintainable code.
*/



// Java Constructors and Encapsulation – Key Notes

// Constructor Basics:

// A constructor is a special method used to initialize objects.
// It has the same name as the class and no return type.
// In this example, MyMainEmployee has a parameterized constructor:
// public MyMainEmployee(String myName, int myId)
// This allows setting the name and id fields when creating an object.
// Encapsulation:

// Fields id and name are marked private, so they cannot be accessed directly from outside the class.
// Public getter and setter methods (getName, setName, getId, setId) provide controlled access to these fields.
// Object Creation:

// In main, an object is created with:
// MyMainEmployee harry = new MyMainEmployee("ShivangUpadhyay", 14);
// The constructor sets the initial values for name and id.
// Usage:

// You can retrieve values using getters:
// System.out.println(harry.getId());
// System.out.println(harry.getName());
// You can change values later using setters if needed.
// Default Constructor:

// If you define any constructor, Java does not provide a default (no-argument) constructor unless you explicitly write one.
// The commented-out default constructor in your code shows how to set default values.
// Takeaway:
// Constructors are essential for initializing objects with specific values. Encapsulation ensures data security and flexibility by using private fields and public methods for access.

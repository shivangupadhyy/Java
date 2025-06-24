package oops;

// Class demonstrating encapsulation and access modifiers in Java
class MyEmpolyee {
    // Private fields: only accessible within this class
    private int id;
    private String name;

    // Getter for 'name' (public: accessible from outside)
    public String getName() {
        return name;
    }

    // Setter for 'name' (public: allows controlled modification)
    public void setName(String n) {
        name = n;
    }

    // Setter for 'id' (public: allows controlled modification)
    public void setId(int i) {
        id = i;
    }

    // Getter for 'id' (public: accessible from outside)
    public int getId() {
        return id;
    }
}

public class Access {
    public static void main(String[] args) {
        // Create an object of MyEmpolyee
        MyEmpolyee shivang = new MyEmpolyee();

        // Direct access to private fields is not allowed (uncommenting below lines will cause error)
        // shivang.id = 14;
        // shivang.name = "codewithHarry";
        // This demonstrates the use of the 'private' access modifier for encapsulation

        // Set values using setter methods (encapsulation: controlled access)
        shivang.setName("ShivangUpadhyya");
        shivang.setId(14);

        // Get values using getter methods
        System.out.println(shivang.getName()); // Prints the name
        System.out.println(shivang.getId());   // Prints the id
    }
}

/*
INTERVIEW & LEARNING NOTES:
- Encapsulation: Wrapping data (fields) and methods (getters/setters) together, restricting direct access to fields.
- 'private' keyword: Fields are only accessible within the class, not from outside.
- Getters and Setters: Public methods to read (get) and modify (set) private fields safely.
- Why use encapsulation? To protect data, provide controlled access, and maintain code flexibility and security.
- In main, you must use setters/getters to interact with private fields.
- This is a common Java interview question: "How do you achieve encapsulation in Java?"
- Always use System.out.println() to print values; calling a getter without printing will not show output.
*/

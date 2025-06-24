package oops;

// Class representing an employee with id, name, salary, and age
class Employe {
    int id;      // Employee's id
    String name; // Employee's name
    int salary;  // Employee's salary
    int age;     // Employee's age

    // Prints id and name of the employee
    public void printDetails() {
        System.out.println("My id  is : " + id);
        System.out.println("My Name is : " + name);
    }

    // Returns the salary of the employee
    public int getSalary() {
        return salary;
    }

    // Prints all details of the employee
    public void getDetails() {
        System.out.println("My name is : " + name);
        System.out.println("My id :" + id);
        System.out.println("salary : " + salary);
        System.out.println("my age is : " + age);
    }
}

public class Oops {
    public static void main(String[] args) {
        System.out.println("this is our custom class");

        // Creating two employee objects
        Employe shivang = new Employe(); // Instantiating a new employee object
        Employe john = new Employe();

        // Setting attributes for shivang
        shivang.id = 14;
        shivang.name = "CodeWithShivang";
        shivang.salary = 150000;
        shivang.age = 21;

        // Setting attributes for john
        john.id = 25;
        john.name = "Ayushi";
        john.salary = 165000;
        john.age = 21;

        // Printing the attributes using different methods
        // shivang.printDetails(); // Prints id and name
        // john.printDetails();    // Prints id and name

        // shivang.getSalary();    // Returns salary (not printed)

        // int salary = john.getSalary();
        // System.out.println(salary); // Prints salary of john

        shivang.getDetails(); // Prints all details of shivang
    }
}

/*
NOTES:
- This file demonstrates how to define a custom class in Java with fields and methods.
- You can create multiple objects (instances) of the class, each with its own data.
- Methods like printDetails() and getDetails() are used to display information about the object.
- The getSalary() method returns the salary, which can be printed or used in calculations.
- For interviews: Be ready to explain how to create classes, instantiate objects, set fields, and call methods.
- Good practice: Use meaningful names and keep each class focused on a single concept.
*/

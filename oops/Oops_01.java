package oops;

// Class representing an employee with salary and name
class employe {
    int salary; // Employee's salary
    String name; // Employee's name

    public int getSalary() {
        return salary; // Returns the salary
    }
    public String getName() {
        return name; // Returns the name
    }
    public void setName(String n) {
        name = n; // Sets the name
    }
}

// Class representing a simple cell phone with actions
class cellPhone {
    public void ring() {
        System.out.println("Ringing....");
    }
    public void vibrate() {
        System.out.println("vibrating...");
    }
    public void callFriend() {
        System.out.println("calling Shivang...");
    }
}

// Class representing a square with methods for area and perimeter
class Square {
    int side; // Side length of the square
    public int area() {
        return side * side; // Returns area
    }
    public int parameter() {
        return 4 * side; // Returns perimeter
    }
}

// Class representing a player (Tommy) with actions
class Tommy {
    public void hit() {
        System.out.println("Hiting...");
    }
    public void run() {
        System.out.println("Running");
    }
    public void fir() {
        System.out.println("Firing");
    }
}

public class Oops_01 {
    public static void main(String[] args) {
        // Problem 1: Employee class usage
        // employe shivang = new employe();
        // shivang.salary = 120000;
        // shivang.name = "Shivang Upadhyay";
        // System.out.println(shivang.getSalary());
        // System.out.println(shivang.getName());
        // shivang.setName("codewithshivang");
        // System.out.println(shivang.getName());

        // Problem 2: cellPhone class usage
        // cellPhone asus = new cellPhone();
        // asus.ring();
        // asus.callFriend();
        // asus.vibrate();

        // Problem 3: Square class usage
        // Square sq = new Square();
        // sq.side = 3;
        // System.out.println(sq.area()); // Prints area of square
        // System.out.println(sq.parameter()); // Prints perimeter of square

        // Problem 4: Tommy class usage
        Tommy player_1 = new Tommy(); // Create a Tommy object
        player_1.fir(); // Call fir() method (prints "Firing")
        player_1.hit(); // Call hit() method (prints "Hiting...")
        player_1.run(); // Call run() method (prints "Running")
    }
}

/*
NOTES:
- This file demonstrates basic OOP concepts: classes, objects, methods, and encapsulation.
- Each class models a real-world entity (employee, phone, square, player) with fields and methods.
- You can uncomment code in main to test each class separately.
- For interviews: Be ready to explain how to create classes, instantiate objects, and call methods.
- Good practice: Use meaningful class and method names, and keep each class focused on a single concept.
*/

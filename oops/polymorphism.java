// Package declaration
package oops;

// ----------- INTERFACE: MyCamera2 ------------------

interface MyCamera2 {
    // Abstract methods (must be implemented by class)
    void takeSnap();
    void recordVideo();

    // Private method inside interface (Java 9+ feature)
    // Not accessible outside the interface; used for code reuse in default methods
    private void greet() {
        System.out.println("good morning");
    }

    // Default method: can be optionally overridden in implementing class
    default void record4kVideo() {
        greet(); // Calls private method inside the interface
        System.out.println("recording in 4k...");
    }
}

// ----------- INTERFACE: Mywifi ------------------

interface Mywifi {
    // Method to return available networks
    String[] getNetwork();

    // Method to connect to a specific network
    void connectToNetwork(String network);
}

// ----------- BASE CLASS: MycellPhone ------------------

class MycellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("calling.." + phoneNumber);
    }

    void pickCalll() {
        System.out.println("call picked connecting..");
    }
}

// ----------- CHILD CLASS: MySmartPhone ------------------
// Inherits MycellPhone and implements both interfaces: MyCamera2 & Mywifi

class MySmartPhone extends MycellPhone implements Mywifi, MyCamera2 {

    // Implementation of camera functionality
    public void takeSnap() {
        System.out.println("taking snap");
    }

    public void recordVideo() {
        System.out.println("recording video");
    }

    // Optional: You can override default method record4kVideo() if needed

    // Implementation of WiFi functionality
    public String[] getNetwork() {
        System.out.println("getting list of networks");
        String[] networkList = {"harry", "prashnath", "anjali5g"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connecting to " + network);
    }
}

// ----------- MAIN CLASS: polymorphism ------------------

public class polymorphism {
    public static void main(String[] args) {

        // Creating reference of interface MyCamera2
        // Polymorphism: Reference type is MyCamera2, object is MySmartPhone
        MyCamera2 cam1 = new MySmartPhone();

        // cam1.getNetwork(); ❌ Not allowed
        // Reason: cam1 is of type MyCamera2, which doesn’t have getNetwork()

        // Only MyCamera2 methods can be called using cam1
        cam1.record4kVideo(); // Uses default method from interface

        // Creating full object of MySmartPhone
        MySmartPhone s = new MySmartPhone();

        // Full access to all methods from interfaces and base class
        s.recordVideo();              // From MyCamera2
        s.getNetwork();               // From Mywifi
        s.callNumber(85);            // From MycellPhone
    }
}

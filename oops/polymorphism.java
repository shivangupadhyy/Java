package oops;

interface MyCamera2{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("good morning");
    }

    default void record4kVideo(){
        greet();
        System.out.println("recording in 4k...");
    }
}

interface Mywifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MycellPhone{
    void callNumber(int  PhoneNumber) {
        System.out.println("calling.." +  PhoneNumber);
    }

    void pickCalll(){
        System.out.println("call picked connecting..");
    }
}

class MySmartPhone extends MycellPhone implements Mywifi, MyCamera2{
    public void takeSnap(){
        System.out.println("taking snapp");
    }
    public void recordVideo(){
        System.out.println("rcoedeing video");
    }

    // public void record4kVideo(){
    //     System.out.println("taking snap and recording in 4k");
    // }

    public String[] getNetwork(){
        System.out.println("getting list og network");
        String  [] networkList = {"harry", "prashnath", "anjali5g"};
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("connectting" + network);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone();
        // cam1.getNetwork(); ==> not allowed\this is an smartphone but, use it as a camera
        cam1.record4kVideo();

        MySmartPhone s = new MySmartPhone();
        s.recordVideo();
        s.getNetwork();
        s.callNumber(85);
    }
}

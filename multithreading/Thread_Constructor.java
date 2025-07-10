package multithreading;



class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i  =34;
        System.out.println("Thank You");
        // while (true) {
        //     System.out.println("'i am a thread'");
        // }
    }
}

public class Thread_Constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("shivang");
        MyThr t2 = new MyThr("Ram Chandr");
        t1.start();
        t2.start();

        System.out.println("the id of the thread is " + t1.getId());
        System.out.println("the id of the thread is " + t1.getName());
        System.out.println("the id of the thread is " + t2.getId());
        System.out.println("the id of the thread is " + t2.getName());
    }
}

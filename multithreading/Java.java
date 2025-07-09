package multithreading;

class MyThread extends Thread{
    public void run(){
        int i= 0;
        while (i<40000) {
            System.out.println("My cooking thread is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int i= 0;
        while (i<40000) {
            System.out.println("Chatting with her ");
            System.out.println(" i am sad");
            i++;
        }
    }
}

public class Java {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}

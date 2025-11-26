// class MyThread extends Thread{
// public void run(){
//  System.out.println("thread is Running...");
// }
// }

// public class Demo3{
// public static void main(String[] args){
// MyThread t = new MyThread();
// t.start();
// }
// }


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is Running...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " has Finished Execution");
    }
}

public class Demo3 {

public static void main(String[] args) {
    Thread t = new Thread(() -> {
        System.out.println("thread is Running...");
    });
    t.start();
}
}
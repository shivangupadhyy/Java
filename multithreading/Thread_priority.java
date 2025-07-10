package multithreading;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thank You " + getName());
            try {
                Thread.sleep(100); // delay for readability
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread_priority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Shivang 1");
        MyThr1 t2 = new MyThr1("Ram Chandr2");
        MyThr1 t3 = new MyThr1("Ram Chandr3");
        MyThr1 t4 = new MyThr1("Ram Chandr4");
        MyThr1 t5 = new MyThr1("Ram Chandr5");
        MyThr1 t6 = new MyThr1("Ram Chandr6 (Most Important)");

        // Set priorities
        t6.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        // Start threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}

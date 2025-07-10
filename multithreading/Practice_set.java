package multithreading;

class Practice extends Thread{
    public void run(){
        // while(false){
        //     // try {
        //     //     Thread.sleep(200);
        //     // } catch (Exception e) {
                
        //     //     System.out.println(e);
        //     // }
        //     System.out.println("Good Morning");
        // }
    }
}
class Practice1 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                
                System.out.println(e);
            }
            
            System.out.println("Thank You");
        }
    }
}

public class Practice_set {
    public static void main(String[] args) {
        Practice p = new Practice();
        Practice1 p1 = new Practice1();
        // p1.setPriority(6);
        // p.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p.getPriority());
        System.out.println(p.getState());
    //    p1.start();
       p.start();
       System.out.println(p.getState());
       System.out.println(Thread.currentThread().getState());
    }
}

package oops;
  class base1{

    base1(){
        System.out.println("mai ek constuctor hu");
    }

  }

  class derived1 extends base1 {


    derived1() {
        System.out.println(" i am a drived class constructor");
    }
  }


public class Constructor_in_inheritance {

    public static void main(String[] args) {
         base1 b =new base1();

         derived1 d  = new derived1();
    }
    
}

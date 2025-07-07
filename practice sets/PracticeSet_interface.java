

abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");
    }

    void changeNib(){
        System.out.println("changing the nib");
    }
}

abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends telePhone{
    void ring(){
        System.out.println("ringing...");
    }
    void lift(){
        System.out.println("lifting...");
    }

    void disconnect(){
        System.out.println("disconnecting...");
    }
}

class Monkey{
    void jump(){
        System.out.println("Monkey is jumping");
    }

    void bite(){
        System.out.println("monkey is biting");
    }
}

interface basicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements basicAnimal{
    void speak(){
        System.out.println("Speaking..");
    }

     public void eat(){
        System.out.println("eating");
    }

     public void sleep(){
        System.out.println("sleeping");
    }
}
public class PracticeSet_interface {
    public static void main(String[] args) {
        //q1+2
        fountainPen pen = new fountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();

        //q3

        Human insaan = new Human();
        insaan.bite();
        insaan.eat();
        insaan.sleep();
        insaan.jump();
        insaan.speak();

        //q5

        Monkey m1 = new Human();
        m1.bite();
        // m1.sleep();//not allowed cannot use speak method becuse the reference is monkey which does not have speak method

        telePhone s1 = new SmartTelephone();
        s1.ring();
        s1.disconnect();
        s1.lift();
    }
}

package packagess;

class c1{

}

class m2{
    public int x =5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Access_modifiers {
    public static void main(String[] args) {
        m2 m = new m2();
        m.meth1();

        System.out.println(m.x);
        // System.out.println(m.a);
    }
}

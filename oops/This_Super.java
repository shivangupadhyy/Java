package oops;

class ekClass{
    int a;

    public int getA(){
        return a;
    }

    

    ekClass(int v){
        this.a = v;
    }
    public int returnOne(){
        return 1;
    }
}

public class This_Super {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        System.out.println(e.getA());
    }
}

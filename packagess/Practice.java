package calc;

class Calculator{
    public void calculator(int a, int b){
        System.out.println("your result is : "+ a+b);
    }
}
class HyCalculator{
    public void calculator(int a, int b){
        System.out.println("your result is : "+ a+b);
        System.out.println("your result is : "+ Math.sin(a+b));
    }
}
class ScCalculator{
    public void calculator(int a, int b){
        System.out.println("your result is : "+ Math.sin(a+b));
    }
}

public class Practice {
    public static void main(String[] args) {
        System.out.println("i am main method!");
    }
    
}

package excersise;

class InvalidInputException extends Exception{
    public String toString(){
        return "Enter Correct Value";
    }

    public String getMessage(){
        return "I am getMessage()";
    }
}
class CannotDivideByZero extends Exception{
    public String toString(){
        return "Cannot divide by Zero";
    }

    public String getMessage(){
        return "I am getMessage()";
    }
}

    class CustomCalculator{
    double add(double a, double b) throws InvalidInputException{
        if(a == 8 || b ==9){
            throw new InvalidInputException();
        }
        return a + b;
        
    }
    double subtraction(double a, double b){
        return a - b;
    }
    double multiply(double a, double b){
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZero{
        if(b==0){
            throw new CannotDivideByZero();
        }
        return a / b;
    }
}

public class Excersise6 {
    public static void main(String[] args) throws InvalidInputException, CannotDivideByZero {
       CustomCalculator c = new CustomCalculator();
    //    c.add(8, 9);
       c.divide(6, 0);
    }   
}

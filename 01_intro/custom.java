
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class custom {

    
    static void checkNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            
            throw new NegativeNumberException("Number is Negative!");
        } else if (num > 0) {
            System.out.println("Number is Positive.");
        } else {
            System.out.println("Number is Zero.");
        }
    }

    public static void main(String[] args) {

        try {
            checkNumber(5);      
        }
        catch (NegativeNumberException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

    }
}


package Error_and_Exceptions;

public class _finally {

    public static int greet(){
         try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        // finally{
        //     System.out.println("Cleaning up resourses....,This is the end of the program");
        // }
        return -1;
    }
    public static void main(String[] args) {
    //    int  k = greet();
    //    System.out.println(k);
       int a = 7;
       int b = 9;
       while (true) {
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
            break;
        }finally{
            System.out.println("i am finally for value of b = " + b);
        }
        b--;
       }
    }
}

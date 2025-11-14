import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class lec6 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("G4xjlH7XQAAfwSN.jpg");
            FileOutputStream fos = new FileOutputStream("G4xjlH7XQAAfwSN_copy.jpg");

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            fis.close();
            fos.close();
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

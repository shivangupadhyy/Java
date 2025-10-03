import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        checkCharacterType(ch);
        
        sc.close();
    }
    
    public static void checkCharacterType(char ch) {
        // Check if it's a digit
        if (Character.isDigit(ch)) {
            System.out.println("'" + ch + "' is a digit.");
        }
        // Check if it's a letter
        else if (Character.isLetter(ch)) {
            // Convert to lowercase for vowel checking
            char lowerCh = Character.toLowerCase(ch);
            
            // Check if it's a vowel
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || 
                lowerCh == 'o' || lowerCh == 'u') {
                System.out.println("'" + ch + "' is a vowel.");
            }
            // It's a consonant
            else {
                System.out.println("'" + ch + "' is a consonant.");
            }
        }
        // It's a special character
        else {
            System.out.println("'" + ch + "' is a special character.");
        }
    }
}
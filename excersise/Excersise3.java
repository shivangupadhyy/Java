package excersise;

import java.util.Random;
import java.util.Scanner;

// Game class encapsulates the logic for the Guess the Number game
class Game {
    public int number;         // The number to be guessed (randomly generated)
    public int inputNumber;    // The user's current guess
    public int noOfGuesses = 0; // Counter for number of guesses

    // Getter for number of guesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for number of guesses
    public void setNoOfGusses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor: generates a random number between 0 and 99
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    // Prompts the user to enter a guess
    void takeUserInput() {
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        // Note: Scanner is not closed here to avoid closing System.in
    }

    // Checks if the user's guess is correct, too low, or too high
    boolean isCorrectNumber() {
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yes you gusses it right, it was %d\n You gussesd it in %d attempts", number, noOfGuesses);
            return true; // Correct guess
        }else if(inputNumber < number){
            System.out.println("too Low");
        }else if(inputNumber > number){
            System.out.println("too high");
        }
        return false; // Not correct yet
    }
}

// Main class to run the game
public class Excersise3 {
    public static void main(String[] args) {
        Game g  = new Game(); // Create a new game instance
        boolean b = false;
        // Loop until the user guesses the correct number
        while (!b) {
            g.takeUserInput(); // Get user's guess
            b = g.isCorrectNumber(); // Check guess and print feedback
            System.out.println(b); // Print whether the guess was correct
        }
    }
}

/*
Notes for Better Understanding:
- The Game class handles all game logic: generating the number, taking input, and checking guesses.
- The user is prompted to guess a number between 0 and 99.
- After each guess, feedback is given: "too Low", "too high", or a success message with the number of attempts.
- The game continues looping until the user guesses the correct number.
- The number of guesses is tracked and can be accessed via getNoOfGuesses().
- Scanner is not closed in takeUserInput() to avoid closing System.in, which would prevent further input.
- This is a simple example of encapsulation, user input handling, and control flow in Java.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguessingame;

import java.util.Scanner;

/**
 *
 * @author 27659
 */
public class Numberguessingame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int lowerBound = 1;
        int upperBound = 100;
        int secretNumber = generateRandomNumber(lowerBound, upperBound);
        int maxAttempts = 5; 

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("Choose a number between  " + lowerBound + " and " + upperBound + ".");
        System.out.println("Try to guess it within " + maxAttempts + " attempts.");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt #" + attempt + ": Enter your guess: ");
            int userGuess = sc.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("The number is higher than " + userGuess + ".");
            } else {
                System.out.println("The number is lower than " + userGuess + ".");
            }

            if (attempt == maxAttempts) {
                System.out.println("You've exhausted all attempts.");
                System.out.println("The secret number was " + secretNumber + ".");
            

    }
    
}
    }

    private static int generateRandomNumber(int lower, int upper) {      
        return lower + (int) (Math.random() * (upper - lower + 1));
    }
    }
    
    

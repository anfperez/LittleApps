package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/30/2016.
 */
public class GuessNumber {

    public GuessNumber() {
        runGuessNumber();
    }

    private void runGuessNumber() {
        int numOfGuesses = 0;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean win = false;
        int userGuess;
        int randomNum = rand.nextInt(1000);

        System.out.println("I'm thinking of a number between 1 - 1000. Guess it!");

        while ( !win ) {
            userGuess = sc.nextInt();
            numOfGuesses++;
            System.out.println("You guessed " + userGuess + ".");

            if (userGuess == randomNum) {
                win = true;
            } else if (userGuess > randomNum) {
                System.out.println("Too high!");
            } else if (userGuess<randomNum) {
                System.out.println("Too low!");
            }

        }
        System.out.println("You won!");
        System.out.println("It took you " + numOfGuesses + " guesses.");
    }
}
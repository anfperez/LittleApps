package com.LittleApps;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("I'd like to play some games with you. What do you want to play?");

        do {
            System.out.println("We can play Reverse, Count Vowels, Pig Latin, Palindrome Check, Count Words, Guess the Number. Which one?");
            String userChoice = sc.nextLine();
            userChoice.toLowerCase();
            if (Objects.equals(userChoice, "Reverse")) {
                Reverse newReverse = new Reverse();
            } else if (Objects.equals(userChoice, "Count Vowels")) {
                CountVowels newCV = new CountVowels();
            } else if (Objects.equals(userChoice, "Pig Latin")) {
                PigLatin newPL = new PigLatin();
            } else if (Objects.equals(userChoice, "Palindrome Check")){
                Palindrome newPal = new Palindrome();
            }
            else if (Objects.equals(userChoice, "Count Words")){
                CountWords newCW = new CountWords();
            }
            else {
                GuessNumber NewGN = new GuessNumber();
            }
        } while (playAgain());
    }

    public static boolean playAgain() {
        boolean PlayAgainBool = false; //assume we do not play again
        System.out.println("Do you want to play again? y/n?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine().toLowerCase();
        if (answer.equals("y")) {
            System.out.println("Okay, let's play again!");
            PlayAgainBool = true;
        } else {
            System.out.println("Thanks for playing!");
        }
        return PlayAgainBool;
    }
}


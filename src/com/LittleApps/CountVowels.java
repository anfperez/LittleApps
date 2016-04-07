package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/30/2016.
 */
public class CountVowels {

    public CountVowels() {
        runCountVowels();
    }

    public void runCountVowels() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Give me a word and I'll count the vowels.");
        userInput = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < userInput.length(); i++) {
            switch (userInput.toLowerCase().charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
            }
        }
        if (vowelCount == 1) {
            System.out.println("There is 1 vowel in: " + userInput + ".");
        } else {
            System.out.println("There are " + vowelCount + " vowels in: " + userInput + ".");
        }
    }
}

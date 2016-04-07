package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/30/2016.
 */
public class PigLatin {

    public PigLatin() {

        runPigLatin();
    }

    public void runPigLatin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a word and I'll tell you what it is in Pig Latin.");
        String userInput = sc.nextLine().toLowerCase();
        String pigWord;
        char firstLetter = userInput.charAt(0);
        char secondLetter = userInput.charAt(1);

        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u') {
            pigWord = userInput + "-way";
        } else if ( secondLetter == 'h') {
            pigWord = userInput.substring(2) + "-" + firstLetter + secondLetter + "ay";
        } else {
            pigWord = userInput.substring(1) + "-" + firstLetter + "ay";
        }
        System.out.println(userInput + "? That word in Pig Latin is " + pigWord + ".");
    }
}

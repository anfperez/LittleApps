package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/31/2016.
 */
public class CountWords {

    public CountWords() {

        runCountWords();
    }
    Scanner sc = new Scanner(System.in);

    public void runCountWords() {
        System.out.println("Give me a phrase and I'll count the words.");
        String userInput = sc.nextLine();
        System.out.println("THere are " + userInput.split(" ").length + " words in that sentence.");
    }
}




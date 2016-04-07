package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/30/2016.
 */
public class Reverse {

    public Reverse() {
        runReverse();

        }
    private void runReverse() {
        Scanner sc = new Scanner(System.in);
        String userInput;
        System.out.println("Let's try reversing a word or phrase. Give me a word or phrase and I'll reverse it for you.");
        userInput = sc.nextLine();
        String reversedWord = new StringBuilder(userInput).reverse().toString();
        System.out.println(userInput + "? That word backwards is " + reversedWord);
    }
}

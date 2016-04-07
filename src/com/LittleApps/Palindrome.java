package com.LittleApps;

import java.util.*;

/**
 * Created by angela.perez on 3/31/2016.
 */
public class Palindrome {

    public Palindrome() {
        runPalindrome();
    }
    Scanner sc = new Scanner(System.in);

    public void runPalindrome() {

        String reverse = "";
        System.out.println("I can check a word to see if it's a palindrome. Give me a word.");
        String userInput = sc.nextLine().toLowerCase();
        int length = userInput.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + userInput.charAt(i);
            }
        if (userInput.equals(reverse)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
            }
        }
    }




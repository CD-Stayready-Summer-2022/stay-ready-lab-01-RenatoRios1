package com.codedifferently.strings;

import java.util.Scanner;

public class StringsExample {
    public static void main(String[] args) {
        //Todo: create a main method
        //Already Done?
        //Todo: inside the main method create a new Scanner Object
        Scanner sc = new Scanner(System.in);
        //Todo: prompt the user for their favorite number
        System.out.println("What is your favorite number? Enter your number now: ");
        //Todo: Use the scanner object to set the value of a int called number
        int input = sc.nextInt();
        //Todo: Prompt the user of the number they selected.
        System.out.println("Your input: " + input);
    }
}

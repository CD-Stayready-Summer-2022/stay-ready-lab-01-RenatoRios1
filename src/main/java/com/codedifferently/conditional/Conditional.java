package com.codedifferently.conditional;

import java.util.Scanner;

public class Conditional {
    //Todo: create a main method
    public static void main(String[] args) {
        //Todo: inside the main method create a new Scanner Object
        Scanner sc = new Scanner(System.in);
        //Todo: Create a variable called highTemp and set its value to 99.0
        float highTemp = 99.0f;
        //Todo: Create a variable called lowTemp and set its value to 71.0
        float lowTemp = 71.0f;
        //Todo: Prompt the user to enter a temperature in degrees
        System.out.println("Enter the temperature in degrees: ");
        //Todo: Use the scanner to collect the users input into a variable called outsideTemp
        float input = sc.nextFloat();
        //Todo: If outsideTemp is less than highTemp and greater than lowTemp print "Lets go outside"
        String output = ( (input < highTemp) && (input > lowTemp) ) ? "Let's go outside!" :"Let's stay inside!";
        System.out.println(output);
    }
}

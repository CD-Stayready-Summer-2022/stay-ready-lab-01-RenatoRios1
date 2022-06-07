package com.codedifferently.control;

import java.util.Scanner;

public class Control {
    //Todo: create a main method
    public static void main(String[] args) {
        //Todo: inside the main method create a new Scanner Object
        Scanner sc = new Scanner(System.in);
        //Todo: prompt the user a number
        System.out.println("Enter a Number now: ");
        //Todo: Use the scanner object to store the value entered by the user in a variable
        Integer input = sc.nextInt();
        //Todo: Create a for-loop to print only the ODD numbers from 1 to the number entered by the user.
        for(int i = 1; i <= input; i++){ //inclusive <=
            System.out.print((i%2 == 0)? "" : i + " ");
        }
        System.out.println();
        //Better time complexity
        for(int i = 1; i <= input; i+=2){ //inclusive <=
            System.out.print(i + " ");
        }
    }
}

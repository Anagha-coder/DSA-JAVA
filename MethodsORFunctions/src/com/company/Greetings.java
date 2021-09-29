package com.company;

import java.awt.*;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        wish();
    }



    static void wish(){
        Scanner input = new Scanner(System.in);
        String greet = input.next();
        System.out.println("Hello world!!");
    }

    // Return types:
    // After any function execution it'll have some value
    // The value is going to be actually what we've return in function
    // so to return nothing use void return type
    // Return basically means function will end
}

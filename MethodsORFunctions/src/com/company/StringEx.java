package com.company;

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        String classyr = input.next();
        String personalized = myGreet(name, classyr);
        System.out.println(personalized);
    }

    static String myGreet(String name, String classyr) {
        String msg = "Hello " + name +" " + classyr;
        return msg;
    }

    // use any data type that you wanna return
    static String greet(){
        String greeting = " How you doin'?";
        return greeting;
    }
}

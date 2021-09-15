package com.company;

import java.net.SocketOption;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please drop down your Roll nos");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll no is " + rollno);
//
//        int a = 10;
//        // a is identifier & 10 is a literal
//        // To put values in million use ' _ ' instead of ' , '
//        int b = 235_000_231;
//        System.out.println(b);

        // input.next() will take next word only
        // input.nextLine() will take next line
//        String name = input.next();
//        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}

package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//    3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner input= new Scanner(System.in);
        float P = input.nextFloat();
        float R = input.nextFloat();
        float T = input.nextFloat();

        double SI =( P * R * T )/100;
        System.out.println("The simple interest is: "+ SI);

    }
}

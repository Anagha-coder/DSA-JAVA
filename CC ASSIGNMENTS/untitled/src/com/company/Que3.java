package com.company;

import java.util.Scanner;

public class Que3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float P = input.nextFloat();
        float R = input.nextFloat();
        float T = input.nextFloat();
        double SI = P * R * T / 100 ;
        double result = SI;

        System.out.println("The Simple interest will be " + result);
    }
}

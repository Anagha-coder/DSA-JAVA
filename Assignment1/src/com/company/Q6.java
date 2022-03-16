package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
 //    6.Input currency in rupees and output in USD.
        System.out.println("Enter Indian Currency: ");
        Scanner input = new Scanner(System.in);
        float InCurrency = input.nextFloat();

        double USD= InCurrency / 76.3125;
        System.out.println("USD: " + USD);



    }
}

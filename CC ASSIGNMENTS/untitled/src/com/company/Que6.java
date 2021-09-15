// Input currency in rupees and output in USD.

package com.company;

import java.util.Scanner;

public class Que6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter in  Rupees:");
        float INCurr = input.nextFloat();

        float UScurr = INCurr /64;
        System.out.println("Amount in USD :" + UScurr);
    }
}

// Take 2 numbers as input and print the largest number.

package com.company;

import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1>num2){
            System.out.println(num1 +" is greater than " +num2);
        }
        else {
            System.out.println(num2 +" is greater than " + num1);
        }
    }
}

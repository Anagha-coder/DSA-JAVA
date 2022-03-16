package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        // 5.Take 2 numbers as input and print the largest number.
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b = input.nextInt();

        System.out.println(Math.max(a,b) + " is the largest number");
    }
}

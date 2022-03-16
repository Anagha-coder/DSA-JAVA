package com.company;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Enter a no: "+ a);

        if(a % 2 ==0){
            System.out.println("The number "+ a + " is even");
        }else{
            System.out.println("The number " + a + " is odd.");
        }

    }
}

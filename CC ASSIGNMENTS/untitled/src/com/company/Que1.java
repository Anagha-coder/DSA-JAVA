package com.company;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter a number:");


        if (num % 2 ==0){
            System.out.println("Even no");
            }
        else
            System.out.println("Odd no");
    }
}

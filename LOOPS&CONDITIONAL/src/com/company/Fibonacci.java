package com.company;

import java.util.Scanner;

public class Fibonacci {
    // Fibonacci :series continues by adding previous two numbers
    // Q: nth fibo number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a= 0;  // prev
        int b = 1; //current
        int count =2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println(b);
}
}



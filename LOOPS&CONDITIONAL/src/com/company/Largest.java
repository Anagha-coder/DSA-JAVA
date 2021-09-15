package com.company;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Q: Find the largest of the 3 numbers
        // Method 1
//        int max = a; // just assuming that a is max
//        if(b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println(max);

        // Method 2

        int max = Math.max(c ,Math.max(a,b));
        System.out.println(max);
    }
}

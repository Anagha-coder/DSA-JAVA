package com.company;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q: Return Armstrong number
        // Armstrong no : a number that is equal to the sum of cubes of its digits;
//        int n = input.nextInt();

        // System.out.println(isArmstrong(n));
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
        }
        static boolean isArmstrong(int n){
            int original = n;
            int sum = 0;
            while (n > 0){
                int rem = n % 10;
                n = n / 10;
                sum = sum + rem*rem*rem;
        }
            return sum == original;
    }
}

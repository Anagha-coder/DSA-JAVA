package com.company;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q: Input of two numbers & print the sum
        // Syntax:
        /*
        return_type name(){
            // body
            return statements;
         }
         */
        // sum(); can just call a function
        // can save that in variable by below method
        int ans = sum();
        System.out.println(ans);

        int res = sum2(5,8);
        System.out.println(res);
    }
    // pass the value of numbers when you are calling the method in main()
    static int sum2(int a, int b){
        System.out.println("OUTPUT OF SUM2");
        int TotalSum = a + b;
        return TotalSum;
    }


// can use void data type when nothing to return
    static int sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum is " + sum);
        return sum;
    }
}

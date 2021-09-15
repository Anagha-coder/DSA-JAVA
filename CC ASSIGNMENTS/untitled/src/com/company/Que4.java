// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.company;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

//        if(num2 > num1 ){
//            System.out.println("Perform division");
//            int div = num2 / num1;
//            System.out.println(div);
//        }
        if (num1 > 0 & num2 < 0){
            System.out.println("Perform addition");
            int add = num2 + num1;
            System.out.println(add);
        }
    }
}

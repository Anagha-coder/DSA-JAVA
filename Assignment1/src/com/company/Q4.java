package com.company;

public class Q4 {
    public static void main(String[] args) {
        // 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        int a = -5;
        int b = 7;
        if (b > a){
            System.out.println("Perform division");
            int div = b/a;
            System.out.println(div);
        } else if (a > 0 & b < 0){
            System.out.println("Perform addition");
            int add = a + b;
            System.out.println(add);
        }
    }
}

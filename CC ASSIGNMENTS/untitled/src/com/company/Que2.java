// Take name as input and print a greeting message for that name.

package com.company;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hey " + name + "Nice to meet you!");
    }
}

package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// It will ask for string input & convert it into char when any method is used
        char ch = input.next().trim().charAt(1);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}

package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        // .equals method
        // if two objects are pointing one value then it will give true
        // but what if not and their values are same so ' .equals 'method is used
        if (fruit.equals("mango")) {
            System.out.println("King of fruits");
        }
        if (fruit.equals("apple")) {
            System.out.println("A red fruit");
        }

        // There's repetition of code so instead use Switch statements
        // Switch Statements
        // Rules:
        // 1. Cases have to be of same type as expressions eg: string or something, must be a constant or literal
        // 2. duplicate case values are not allowed
        // 3. break is used to terminate the sequence
        // 4. if break is not used it'll continue to next case
        // 5. default will execute if none of the above does
        // 6. if default is not at the end put break after it
        // This syntax is done by 'Alt+ Enter it's "Enhanced switch"
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println(" A red fruit");
            case "orange" -> System.out.println("A round fruit");
            case "Grapes" -> System.out.println("Small green fruit");
            default -> System.out.println("Please enter a valid fruit");


        }

        int day = input.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
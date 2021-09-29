package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class NewInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array of primitives

        int[] arr = new int[5];
        arr[0]= 23;
        arr[1] = 45;
        arr[2] = 22;
        arr[3] = 4;
        arr[4] = 9;
        System.out.println(arr[1]);

//        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//  // normal foor loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

        //enhanced for loop " for each loop "
//        for (int j : arr) { // for every element  in array print the element
//            System.out.println(j + " "); // j represents element of the array
//        }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[2] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}

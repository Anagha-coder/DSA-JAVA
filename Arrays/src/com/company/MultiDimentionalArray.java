package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        // matrix type
        /*
           1 2 3
           4 5 6
           7 8 9

         */
        Scanner input = new Scanner(System.in);
        // 2D arrays are defined with [][]
        // number of rows needs to be specified , colms are not
        // int[][] arr = new int[3][];
        // individual size of array can vary as well
//        int[][] arr = {
//                {1, 2, 3}, // 0th index
//                {4, 5}, // 1st index
//                {6, 7, 8, 9} // 2nd index -> arr@D[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // output

//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//
//        }
        // output

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

    }
}

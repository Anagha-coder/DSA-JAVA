package com.company;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        // Mutability of arrays
        // as here nums & arr are pointing to same value so original value is also getting changed
        int[] nums = {3,5,4,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}

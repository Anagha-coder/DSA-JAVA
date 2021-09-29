package com.company;

import java.util.Arrays;

public class PassingEg {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,23,37,49,58};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[2] = 0; // if you make a change to object via this ref variable
    }

}

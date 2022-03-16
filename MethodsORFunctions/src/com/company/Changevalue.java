package com.company;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {10, 2 , 3 ,45 ,89};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
        nums[0] = 99; // if you make change to object via this ref variable, original object will change.
    }
}

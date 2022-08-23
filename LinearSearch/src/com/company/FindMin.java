package com.company;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12,18,19,-13,56,4};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        // return the minimum value of array
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }

}

package com.company;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1, 22, 35, 41 ,5};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,1,4));
    }
// imagine that array is not empty
    // to get max value
//    static int max(int[] arr) {
//        int maxVal = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] > maxVal){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

    // can define for a certain range
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}

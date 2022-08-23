package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {23,45,48,44,56,12,10};
        int target = 12;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // 3. Search thr taeget and return true or false

    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        // run a for loop

        for (int element : arr) {
            // check for element at every index if element == target
            if (element == target) {
                return true;
            }

        }

        // this line will execute if none of the return statements above executed
        // i.e tareget has not found
        return false;
    }

    // ________________________________________________________________________________
    // 2.  search the target and return the element

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){ // here ' .length' is a function as it's of array
            return -1;
        }

        // run a for loop

        for (int element : arr) {
            // check for element at every index if element == target
            if (element == target) {
                return element;
            }

        }

        // this line will execute if none of the return statements above executed
        // i.e tareget has not found
        return Integer.MAX_VALUE;
    }

//    _________________________________________________________________________

    // 1. search in the array: return the index if item found
    //    otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a for loop

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if element == target
            int element = arr[index];
            if (element == target){
                return index;
            }

        }

        // this line will execute if none of the return statements above executed
        // i.e tareget has not found
        return -1;
    }
}

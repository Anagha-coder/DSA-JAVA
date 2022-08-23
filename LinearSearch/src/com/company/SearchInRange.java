package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        // searching in a range
        int[] arr = {18, 12, 3, 15, 46,28};
        int target = 3;
        System.out.println(linearSearch(arr, target,1,4));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for (int index = start; index <= end ; index++) {
            // check for element at every index = target

            int element = arr[index];
            if(element == target){
                return index;
            }

        }

        // this line will execute if none of the above return statements works
        // hence target not found
        return -1;
    }
}

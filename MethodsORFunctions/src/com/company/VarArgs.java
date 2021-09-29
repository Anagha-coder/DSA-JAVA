package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      // methods taking various no of arguments
        // 0 or mor e than it
        fun(2,5,9,56,87,564,8,4,5);// can take any no of arguments

        multiple(5,10,"kunal","anagha"); //order matters
    }
    // var argument should always be last in the list
//    static void multiple(int a, String...v, int b) --> wrong format

    static void multiple(int a, int b, String...v){

    }



    // If no of input doesn't know use ' ...v' ; v = any variable name
    // This internally taking as array of integers
    static void fun( int ...v){
        System.out.println(Arrays.toString(v));
    }
}

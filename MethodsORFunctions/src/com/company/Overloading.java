package com.company;

import java.util.Arrays;

// This understanding & showing correct output is happening when the program is compiled
public class Overloading {
    public static void main(String[] args) {
    // Function Overloading : Two or more functions with same name but arguments passing should be diff

    //* function overriding happens at Runtime
        fun(5);
        fun("Kunal");
        fun(8,6);

        // demo(); // if passed without any arguments ' Ambiguity error'
    }
    static void fun(int a){
        System.out.println(a);
    }

    static int fun(int a, int b){
        return a + b;

    }
    static void fun(String name){

    }

    // Ambiguity

    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

}

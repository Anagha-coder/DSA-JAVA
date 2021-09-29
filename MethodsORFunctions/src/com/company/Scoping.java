package com.company;
// Rule 1 : Anything defined outside can use inside block but can't initialize inside & can change their values
// Rule 2 : Anything defined inside can't use outside
// but can initialize outside caz it doesn't know that something is initialized inside so

// adding data type is initializing
public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Block Scope
        {
            // you can't initialize already defined variable again in same function
            // int a = 78; // Error

            // but can change the value
            a = 100;  // reassign the origin ref variable to some other value
//            System.out.println(a);

            // values initialized in a block will remain in block
            int d = 50;
        }
        // System.out.println(d); // cannot use outside the block

        // Even a is accessed outside that block it'll show 100 caz it is still in the same function
        System.out.println(a);


        // Scoping in for loops
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        // System.out.println(i); // Error






    }
    // Scope
    // 1. function Scope - variables/ objects ony accessible inside it
    static void random(){
        int c = 30;
        System.out.println(c);
    }

}

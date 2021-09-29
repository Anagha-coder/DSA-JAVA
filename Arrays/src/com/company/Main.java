package com.company;

public class Main {

    public static void main(String[] args) {
	// Q: Store a roll no
        int a =19;

    // Q: Store a person's name
    String name= "Anagha";

    // Q: Store 5 roll no
        // Syntax
        // datatype[] variable_name = new datatype[size];
        // Rules:
        // 1. datatype = type of data stored in array
        // 2. samedata type can only stored
        int[] rollno1 = new int[5];
        //directly
        int[] rollno2 = {23,56,41,12,3};


        // workflow
        int[] ros; // declaration of array. ros is getting defined in the stack4
        ros = new int[5]; // initialization: Actually object is being created in the
        // internal working [0,0,0,0,0,] ->. just an empty array
//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
        // output is 'null'
        // null = You can assign it to only non primitives like string
        // null is by default value what ref variable is point to if no value is asssigned


    }
}

package com.company;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//    // swap numbers
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " "+ b);

        swap(a,b);
        System.out.println(a + " "+ b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam) {
        naam = " Anagha Desai";
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;


    }
}

package com.company;

public class Shadowing {
    // if initialized something outside the main scope, it'll have its own scope
    // Inorder to use everything in static wrote static
    // you can't use object dependent thing in object independent things
    static int x = 90; // This will be shadowed at line 12
    // scope will be everything inside class Shadowing i.e to the block
    public static void main(String[] args) {
        System.out.println(x + " value"); // 90

        // Scope will begin when the value is initialized
        int x = 40; // accessible only in scope // the class var at line 7 is shadowed by this
        System.out.println(x); // 40 // Reason: The var of higher level scope is hidden
        fun();

        int y; // initializing variable

        y = 40; // declaring variable
    }
    static void fun(){
        System.out.println(x);
    }
}

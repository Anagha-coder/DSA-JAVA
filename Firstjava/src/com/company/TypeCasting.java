package com.company;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        TypeCasting=  When one type of data is assigned to another type of variable ,
//        then type conversion will take place if desired conditions are met

        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

        // Output
        // a float if you give any int
        // Conditions
        // 1. The two types should be compatible with one another
        // eg: any string "Kunal" can't be a float but any int 64 can be float i.e 64.0

        // 2. Destination type should be greater than the source type
        // i.e in int you can only add int values
        // but in float you can add int + float values
        // so float > int

        // Typecasting : compressing bigger no in smaller type explicitly
        // as int to float is not happening automatically we've to do that
//        also called as narrowing conversion
        // as here we're explicitly doing 'float into int'

        int newnum = (int)(64.67f);
        System.out.println(newnum);

//==============================================================================
        // automatic type promotion in expressions
        // byte range = 256
        int a = 257;
        byte b = (byte)(a);

        System.out.println(b);
        // output will be 1 caz max size of byte is 256 so can't store 257
        // so output will be the remainder of 257 % 256 = 1


        byte p = 10;
        byte q = 56;
        byte r = 100;
        int d = (p * q) / r ;

        // so here as p*q is 560 which exceeds the limit of byte which is 256
        // so java is automatically converting it into int while executing line 46
        // so this is automatic type promotion


        System.out.println(d);

        // int number = 'A';
        System.out.println("नमस्कार"); // java follows UNICODE
        // it'll give ascii value of this

        // AUTOMATICALLY PROMOTIONAL RULES
        // 1. All the byte or short values are promoted to int
        // 2. If any operands is long the whole operation is promoted to long
        // same for float,double...
        System.out.println(3 * 11.6); //will give the bigger value i.e float


        byte B = 42;
        char c = 'a';
        short s = 1254;
        int i = 156532;
        float f = 213.32f;
        double D = 0.549844;
        double result = (f * B) + (i / c) -(D -s);
        // float + int - double = double ( max among 'em)
        System.out.println((f * B) + " " + (i/c) + " " + (D-s));
        System.out.println(result);


    }
}

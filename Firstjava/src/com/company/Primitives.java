package com.company;

public class Primitives {
    public static void main(String[] args) {
        // primitive = you can't break it even further into any other data type

        int rollno = 12; // 4 bytes
        char letter = 'r';
        float marks = 58.33f;
        double largeDecimalNumbers = 564846184.516; //8 bytes
        long largeIntegerValues = 485249569565896259L; // 8 bytes
        boolean check = false; // or true

        // wrapper class :  a class whose object wraps or contains primitive data types
        // Integer is a class & rno is object of that class
        // why do we make objects? so we can have multiple methods to use

        Integer rno = 64;
        rno.compareTo(65);


        // String is not primitive
        // ex any string " Anagha " --> so can break into each letter so not primitive
        String name = "Anagha";
    }
}

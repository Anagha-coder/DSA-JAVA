package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // syntax
        // slower than normal array
        // can't add primitives <int> like this -> use Wrapper class
        ArrayList<Integer> list = new ArrayList<>(5);
        // can add more items than it's initial array capacity
//        list.add(67);
//        list.add(89);
//        list.add(77);
//        list.add(57);
//        list.add(87);
//        list.add(17);
//
////        System.out.println(list.contains(7884));
//        System.out.println(list);
//        list.set(0, 99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here
            // list[index] syntax will not run here
        }
        System.out.println(list);


    }
}

package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers from 1 to 5
        // Use for loop when the range is defined

        //======= For loop ==========
        // Syntax:
        /*
        for(initialization ; condition; increment/decrement){
        // body
        }
         */
//        for( int i=1; i < 2; i++){
//            System.out.println("Hey Anagha Good Job!"+ i);
//        }
//
//        // Q: Print num from 1 to n
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int num = 0; num <= n; num++) {
//            System.out.println(num+ " hey");
//        }

        // =========== While loop ============
        // Use while loop when range is not defined
        // Syntax:
        /*
        initialization

        while(condition){
        // body
        print something
        increment / decrement

        }
         */
//        int count = 1;
//        while(count <= 5){
//            System.out.println(count);
//            count++;
//        }


        // ========= do while loop =============
        // It will execute at least once caz first is 'do'
        // after that it will check condition & work accordingly
        // Syntax:
        /*
        do{
           // body
        } while(condition);

         */
        int n= 1;
        do{
            System.out.println("Hey Anagha");
        } while(n !=1);

    }
}

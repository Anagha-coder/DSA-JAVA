package com.company;

import java.util.Scanner;

public class Q8 {
    static boolean isPalindrome(String str){
        int i=0 , j= str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        //   8.  To find out whether the given String is Palindrome or not.

        Scanner input= new Scanner(System.in);
        String str = input.nextLine();
        if(isPalindrome(str)){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }


    }

}

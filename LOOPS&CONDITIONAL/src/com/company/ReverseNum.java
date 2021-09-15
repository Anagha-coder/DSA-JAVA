package com.company;

public class ReverseNum {
    public static void main(String[] args) {
        // Q: Reverse the number
        int num = 3698;

        int ans = 0;

        while(num>0){
            int rem = num % 10;
            num = num/10;

            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}

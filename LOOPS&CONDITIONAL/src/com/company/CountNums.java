package com.company;

public class CountNums {
    public static void main(String[] args) {
        // Q: How many times 6 has occurred
        int n = 1366564;

        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if (rem == 6){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

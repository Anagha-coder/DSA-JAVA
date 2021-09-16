package com.company;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // nested switch
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String dept = input.next();
        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Anagha Desai");
            case 3 -> {
                System.out.println("Employee no 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}

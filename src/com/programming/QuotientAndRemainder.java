package com.programming;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        // Input for both the number and divisor is taken from the user
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to be calculated for quotient and remainder");
        int num = sc.nextInt();
        System.out.println("Enter the divisor ");
        int div = sc.nextInt();

        remainder(num,div);                                                            // Both the remainder and quotient methods are called for the computation
        quotient(num,div);
    }

    public static void remainder(int num,int div) {                                    //Method to find the remainder
        int rem = num % div;
        System.out.println( num + " divided by " + div + " remainder is "+ rem);
    }

    public static void quotient(int num,int div) {                                     //Method to find the quotient
        int quo = num / div;
        System.out.println( num + " divided by " + div + " quotient is "+ quo);

    }
}

package com.ankur.DSA.util;

import java.util.Scanner;

public class HelperMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        double bill;

        if (units <= 50) {
            bill = units * 0.5;
        } else if (units <= 150) {
            bill = (50 * 0.5) + ((units - 50) * 0.75);
        } else if (units <= 250) {
            bill = (50 * 0.5) + (100 * 0.75) + ((units - 150) * 1.2);
        } else {
            bill = (50 * 0.5) + (100 * 0.75) + (100 * 1.2) + ((units - 250) * 1.5);
        }

        // Add 20% surcharge
        bill = bill * 1.2;

        // Print rounded bill
        System.out.println((int)bill);
    }
}

package com.ankur.DSA.util;

import java.util.Scanner;

public class Loops {
    /**
     * Print all odd numbers with minimum steps possible up-to N
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= input; i += 2){ //Always put operator before equal sign
            System.out.println(i);
        }
    }

}

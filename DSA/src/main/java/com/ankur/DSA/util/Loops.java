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
            if(i == 17) continue; //It will skip the printing of 17
            System.out.println(i);
        }
    }

}

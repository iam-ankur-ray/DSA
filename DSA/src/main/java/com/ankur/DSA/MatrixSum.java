package com.ankur.DSA;

import java.math.BigInteger;
import java.util.Scanner;

public class MatrixSum {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int a[][] = new int[rows][columns];



    public static void main(String[] args) {
        System.out.println(factorial(BigInteger.valueOf(50)));

    }

    private static BigInteger factorial(BigInteger num){
        if (num.equals(BigInteger.ZERO) || num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
}

package com.ankur.DSA.ArraysQuestions;

import java.util.Scanner;

public class OddEvenProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tests = sc.nextInt();

        while (Tests > 0) {
            int size = sc.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            int evenSize = 0;
            int oddSize = 0;
            for (int value : array) {
                if (value % 2 == 0) {
                    evenSize++;
                } else {
                    oddSize++;
                }
            }

            int[] oddArray = new int[oddSize];
            int[] evenArray = new int[evenSize];

            int oddIndex = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] % 2 != 0) {
                    oddArray[oddIndex] = array[i];
                    oddIndex++;
                }
            }

            int evenIdex = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] % 2 == 0) {
                    evenArray[evenIdex] = array[i];
                    evenIdex++;
                }
            }

            for (int value : oddArray) {
                System.out.print(value + " ");
            }
            System.out.println();

            for (int values : evenArray) {
                System.out.print(values + " ");
            }
            System.out.println();

            Tests--;
        }
    }
}

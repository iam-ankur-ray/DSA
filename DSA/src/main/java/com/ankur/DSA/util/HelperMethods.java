package com.ankur.DSA.util;

import java.util.Scanner;

public class HelperMethods {

    public static int[] generateIntegerArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[][] generateMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows of matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns of matrix : ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the element you want to add : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        return matrix;
    }

    public static void printIntegerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}
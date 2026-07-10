package com.ankur.javaQuestions;

import com.ankur.DSA.ArraysQuestions.BasicArray;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ArraysQuestions {
    /**
     * Return boolean rowValue true if array is sorted.
     *
     * @param arr integer array
     * @return boolean rowValue
     */
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Print matrix by taking input from the user
     */
    public static void printMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print row size : ");
        int row = sc.nextInt();
        System.out.print("Print column size : ");
        int col = sc.nextInt();

        int[][] array = new int[row][col];
        System.out.print("Print " + row * col + " elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your 2-D array is this : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }

    /**
     * Print matrix column by column
     */
    public static void printColumnsOfMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Print matrix in wave traversal
     */
    public static void printWaveTraversalOfMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int j = matrix[0].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * print the array of sum of rows from matrix
     */
    public static void printSumOfRows(int[][] matrix){
        int[] answer = new int[matrix.length];

        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[0].length; j++){
                sum += matrix[i][j];
            }
            answer[i] = sum;
        }

        for(int rowValue : answer){
            System.out.print(rowValue + " ");
        }
    }

    /**
     * return the transpose of matrix
     * row becomes the column
     */
    public static int[][] getTransposeOfMatrix(int[][] matrix){
        int[][] answer = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                answer[i][j] = matrix[j][i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10,11,12}};
        int[][] answer = getTransposeOfMatrix(array);
        for(int[] rowValue: answer){
            BasicArray.printArray(rowValue);
        }
    }

}

package com.ankur.DSA.matrix;

import com.ankur.DSA.util.HelperMethods;

public class DiagonalQuestions {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2},{3,4}};
        printAllAntiDiagonal(array2);
    }

    /**
     * Print the anti-diagonal (from right to left) from a matrix
     */
    public static void printAntiDiagonal(int[][] matrix){
        int[] answer = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            answer[i] = matrix[i][matrix.length - 1 - i];
        }
        HelperMethods.printIntegerArray(answer);
    }

    /**
     * Print all anti-diagonal elements for an array
     */
    public static void printAllAntiDiagonal(int[][] matrix){
        int size = matrix.length;

        int i = 0;
        for(int j = 0; j < size; j++){
            int a = i, b = j;
            int index = 0;
            int[] ans = new int[size];
            while(b >= 0 && a < size){
                ans[index] = matrix[a][b];
                a++;
                b--;
                index++;
            }
            for(int value: ans){
                System.out.print(value + " ");
            }
            System.out.println();
        }

        int j = size - 1;
        for(int row = 1; row < size; row++){
            int a = row, b = j;
            int index = 0;
            int[] ans = new int[size];
            while(a < size && b >=0){
                ans[index] = matrix[a][b];
                a++;
                b--;
                index++;
            }

            for(int value : ans){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

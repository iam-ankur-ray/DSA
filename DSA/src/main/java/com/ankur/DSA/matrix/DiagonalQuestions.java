package com.ankur.DSA.matrix;

import com.ankur.DSA.util.HelperMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalQuestions {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{1,2},{3,4}};
        HelperMethods.printMatrix(getAllAntiDiagonal(array2));
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
    public static int[][] getAllAntiDiagonal(int[][] A){
        int size = A.length;
        int[][] finalAnswer = new int[size * 2 - 1][size];
        int i = 0, mainRow = 0;
        for(int j = 0; j < size; j++){
            int a = i, b = j, index=0;
            while(b >= 0 && a < size){
                finalAnswer[mainRow][index] = A[a][b];
                a++;
                b--;
                index++;
            }
            mainRow++;
        }

        int j = size - 1;
        for(int row = 1; row < size; row++){
            int a = row, b = j,mainCol  = 0;
            while(a < size && b >=0){
                finalAnswer[mainRow][mainCol] = A[a][b];
                a++;
                b--;
                mainCol++;
            }
            mainRow++;
        }

        return finalAnswer;
    }
}

package com.ankur.DSA.matrix;

import com.ankur.DSA.util.HelperMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalQuestions {

    public static void main(String[] args) {
        int[][] array = {	{47,-59,20,33,20,-47,-87,-59,85},
                {8,-67,48,-10,-23,-68,-28,62,-94},
                {-50,77,-39,-57,15,71,44,13,-53},
                {-30,43,-92,-94,42,37,95,7,19},
                {-1,92,-85,20,-53,-16,31,-95,4},
                {-62,49,0,53,-93,-61,-49,86,97},
                {62,-26,-1,-38,59,-93,-93,12,-90},
                {78,85,90,89,-65,5,48,40,-86},
                {-79,-68,-89,90,-40,47,68,-25,92}
        };
        int[][] array2 = {{1,2},{3,4}};
        printAntiDiagonal(array);
    }

    /**
     * Print the anti-diagonal (from right to left) from a matrix
     */
    public static void printAntiDiagonal(int[][] matrix){
        int[] answer = new int[matrix.length];
        int add = 0;
        for(int i = 0; i < matrix.length; i++){
            answer[i] = matrix[i][matrix.length - 1 - i];
            add += answer[i];
        }
        System.out.println();
        System.out.println(add);

        int a = 0, b = matrix.length -1;
        int sum = 0;
        while(a < matrix.length){
            sum += matrix[a][b];
            a++;
            b--;
        }
        System.out.println(sum);

        HelperMethods.printIntegerArray(answer);
        int sum1 = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(j == matrix.length - 1 - i){
                    sum1 += matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.println(sum1);
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

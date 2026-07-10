package com.ankur.DSA.ArraysQuestions;

import java.util.ArrayList;

import static com.ankur.DSA.util.HelperMethods.generateMatrix;
import static com.ankur.DSA.util.HelperMethods.printMatrix;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] A = generateMatrix();
        int[][] B = generateMatrix();
        int[][] C = multiplyMatrices(A,B);
        printMatrix(C);
    }

    public static int[][] multiplyMatrices(int[][]A, int[][]B){
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < B[0].length; j++){
                int sum = 0;
                for(int k = 0; k < A[0].length; k++){
                    sum += A[i][k] * B[k][j];
                }
                temp.add(sum);
            }

            answer.add(temp);
        }
        int[][] out = new int[answer.size()][answer.get(0).size()];
        for(int i = 0; i < answer.size(); i++){
            for(int j = 0; j <answer.get(0).size(); j++){
                out[i][j] = answer.get(i).get(j);
            }
        }

        return out;
    }
}

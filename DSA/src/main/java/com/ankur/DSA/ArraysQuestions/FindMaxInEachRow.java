package com.ankur.DSA.ArraysQuestions;

import java.util.Arrays;

public class FindMaxInEachRow {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}};
        System.out.println(Arrays.toString(findLargestElementInRow(matrix)));
    }
    public static int[] findLargestElementInRow(int[][] A) {
        int[] answer = new int[A.length];

        for(int i = 0; i < A.length; i++){
            int largest = A[i][0];
            for(int j = 0; j < A[0].length; j++){

                if(A[i][j]>largest){
                    largest = A[i][j];
                    answer[i] = largest;
                }
            }

        }

        return answer;
    }


}

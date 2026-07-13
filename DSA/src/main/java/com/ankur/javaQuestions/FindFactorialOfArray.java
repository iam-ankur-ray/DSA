package com.ankur.javaQuestions;

import java.util.ArrayList;
import java.util.List;

import static com.ankur.DSA.util.HelperMethods.generateIntegerArray;
import static com.ankur.DSA.util.HelperMethods.printMatrix;

public class FindFactorialOfArray {
    public static void main(String[] args) {
        int[] A = generateIntegerArray();
        int[] B = generateIntegerArray();
        getMatrixOfFactorial(A,B);
    }

    /**
     * Find if array element in A is divisible by array elements in B
     * Return the matrix of arrays for those divisible elements from A mapping to divisor B.
     */
    public static void getMatrixOfFactorial(int[] A, int[] B){
        List<List<Integer>> answer = new ArrayList<>();

        for(int b : B){
            List<Integer> rows = new ArrayList<>();
            for(int a : A){
                if(a % b == 0){
                    rows.add(a);
                }
            }
            answer.add(rows);
        }

        int[][] out = new int[answer.size()][];
        for(int i = 0; i < answer.size();i++){
            List<Integer> row = answer.get(i);
            int[] arr = new int[row.size()];


            for(int j = 0; j < row.size(); j++){
                arr[j] = row.get(j);
            }
           // out[i] = row.stream().mapToInt(Integer::intValue).toArray(); simpler version instead of writing line 37 to 42.

            out[i] = arr;
        }

        printMatrix(out);
    }
}

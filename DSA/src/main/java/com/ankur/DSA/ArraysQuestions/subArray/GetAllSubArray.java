package com.ankur.DSA.ArraysQuestions.subArray;

import com.ankur.DSA.util.HelperMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class GetAllSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                ArrayList<Integer> arrays = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    arrays.add(arr[k]);
                }
                answer.add(arrays);
            }
        }

        System.out.println(Arrays.toString(answer.toArray()));

        int[][] finalAnswer = new int[answer.size()][];
        for(int i = 0; i < answer.size(); i++){
           finalAnswer[i] = new int[answer.get(i).size()];
            for(int j = 0; j < answer.get(i).size(); j++){
                finalAnswer[i][j] = answer.get(i).get(j);
            }
        }

        System.out.println("-".repeat(50));

        HelperMethods.printMatrix(finalAnswer);
    }
}

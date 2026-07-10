package com.ankur.DSA.ArraysQuestions;

public class InversionArray {


    public static void main(String[] args) {
        int[] array = {3, 1, 0, 2};
       int[] answer = solve(array);
       for(int rowValue : answer){
           System.out.print(rowValue + " ");
       }
    }

    public static int[] solve ( int[] A) {
        int size = A.length;
        int[] answer = new int[size];

        int rowValue = 0;
        for (int i = 0; i < size; i++) {
            rowValue = A[i];
            answer[rowValue] = i;
        }
        return answer;
    }
}


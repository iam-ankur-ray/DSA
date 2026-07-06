package com.ankur.DSA.ArraysQuestions;

public class InversionArray {


    public static void main(String[] args) {
        int[] array = {3, 1, 0, 2};
       int[] answer = solve(array);
       for(int value : answer){
           System.out.print(value + " ");
       }
    }

    public static int[] solve ( int[] A) {
        int size = A.length;
        int[] answer = new int[size];

        int value = 0;
        for (int i = 0; i < size; i++) {
            value = A[i];
            answer[value] = i;
        }
        return answer;
    }
}


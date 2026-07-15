package com.ankur.InterviewLevel;

import com.ankur.DSA.ArraysQuestions.BasicArray;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4,7};
        System.out.println(getMissingNumberAp(array));

    }

    public static int getMissingNumber(int[] array){ //Another way
        boolean[] answer = new boolean[array.length + 2];

        for(int i = 0; i < array.length; i++){
            int element = array[i];
            answer[element] = true;
        }

        for(int i = 1; i < answer.length; i++){
            if(answer[i]==false){
                return i;
            }
        }
        return -1;
    }

    public static int getMissingNumberAp(int[] array){
        int sum = ((array.length + 1) * (array.length + 2)) / 2;

        int actualSum = BasicArray.getSumOfArray(array);
        return sum - actualSum;
    }
}

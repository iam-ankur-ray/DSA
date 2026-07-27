package com.ankur.DSA.prefix;

import com.ankur.DSA.util.HelperMethods;

public class CountOfEvenElements {
    public static void main(String[] args) {
        int[] arr = HelperMethods.generateIntegerArray();
        int[][] queries = HelperMethods.generateMatrix(); // queries should have only two columns like [0,2] or [3,4]

        int[] prefix = new int[arr.length];

        prefix[0] = (arr[0] % 2 == 0) ? 1 : 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                prefix[i] = prefix[i-1] + 1;
            } else {
                prefix[i] = prefix[i-1];
            }
        }

        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int left = queries[i][0];
            int right = queries[i][1];

            if(left == 0){
                answer[i] = prefix[right];
            } else {
                answer[i] = prefix[right] - prefix[left - 1];
            }
        }

        HelperMethods.printIntegerArray(answer);
    }
}

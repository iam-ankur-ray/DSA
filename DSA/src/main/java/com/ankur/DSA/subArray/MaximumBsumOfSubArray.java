package com.ankur.DSA.subArray;

import com.ankur.DSA.util.HelperMethods;

import java.util.ArrayList;

public class MaximumBsumOfSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubarray(5,9,HelperMethods.generateIntegerArray()));
    }

    public static int maxSubarray(int A, int B, int[] C) {
        int[] prefix = new int[A];
        prefix[0] = C[0];

        for(int i = 1; i < A; i++){
            prefix[i] = prefix[i-1] + C[i];
        }


        int finalAnswer = 0;
        for(int i = 0; i < A; i++){
            for(int j = i; j < A; j++){
                int ans = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];

                if(ans <= B && ans > finalAnswer){
                    finalAnswer = ans;
                }
            }
        }

        return finalAnswer;

    }
}

package com.ankur.DSA.sorting;

import java.util.Arrays;


public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {8,16,80,55,32,8,38,40,65,18,15,45,50,38,54,52,23,74,81,42,28,16,66,35,91,36,44,9,85,58,59,49,75,20,87,60,17,11,39,62,20,17,46,26,81,92};
        System.out.println(kthsmallest(arr,9));
    }

    /**
     * Find the k^th the smallest unique element from the array.
     * @param A array
     * @param B k^th element
     * @return element at kth index
     */
    public static int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int index = 1;
        for(int i = 1; i < A.length; i++){
            if(A[i]!=A[i-1]) {
                index++;
            }

            if(index == B){
                return A[i];
            }
        }

        return -1;
    }
}

package com.ankur.DSA.prefix;

public class findEquilibrium {
    public static void main(String[] args) {
        int[] arr = {2, 3, -1, 8, 4};
        System.out.println(getEquilibriumIndex(arr));
    }

    public static int getEquilibriumIndex(int[] A){
        int size = A.length;

        int totalSum = 0;
        for (int j : A) {
            totalSum += j;
        }

        int leftSum = 0;

        for(int i = 0; i < size; i++){
            int rightSum = totalSum - leftSum - A[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum += A[i];
        }

        return -1;
    }
}

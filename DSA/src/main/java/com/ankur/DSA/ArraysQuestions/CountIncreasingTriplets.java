package com.ankur.DSA.ArraysQuestions;

public class CountIncreasingTriplets {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3,6};
        System.out.println(countIncreasingTriplet(array));
    }

    public static int countIncreasingTriplet(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            int leftCount = 0;
            int rightCount = 0;
            int mid = arr[i];

            for(int j = 0; j < i; j++){
                if(mid > arr[j]){
                    leftCount++;
                }
            }

            for(int k = i + 1; k < arr.length; k++){
                if(mid < arr[k]){
                    rightCount++;
                }
            }

            count += leftCount * rightCount;
        }

        return count;
    }
}

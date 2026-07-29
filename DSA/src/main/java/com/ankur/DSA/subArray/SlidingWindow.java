package com.ankur.DSA.subArray;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {-3,4,-2,5,3,-2,8,2,-1,4};
        System.out.println(usingSlidingWindow(array,5));
    }

    public static int bruteForceToGetSumOfSubArrayWithSizeK(int[] arr, int k){
        int i = 0, j = k -1;
        int maxSum = Integer.MIN_VALUE;
        while(j < arr.length){
            int sum = 0;
            for(int a = i; a <= j;a++){
                sum += arr[a];
            }
            maxSum = Math.max(maxSum, sum);
            i++; j++;
        }
        return maxSum;
    }

    public static int usingSlidingWindow(int[] arr, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        int ans = sum;

        int i = 1, j = k;

        while(j < arr.length){
            sum = sum - arr[i-1] + arr[j];
            ans = Math.max(ans, sum);
            i++;j++;
        }

        return ans;
    }
}

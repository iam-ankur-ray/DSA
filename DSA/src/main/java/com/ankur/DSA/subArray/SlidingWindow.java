package com.ankur.DSA.subArray;

import java.util.ArrayList;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] array = {-3, 4, -2, 5, 3, -2, 8, 2, -1, 4};
        System.out.println(usingSlidingWindow(array, 5));
    }

    public static int bruteForceToGetSumOfSubArrayWithSizeK(int[] arr, int k) {
        int i = 0, j = k - 1;
        int maxSum = Integer.MIN_VALUE;
        while (j < arr.length) {
            int sum = 0;
            for (int a = i; a <= j; a++) {
                sum += arr[a];
            }
            maxSum = Math.max(maxSum, sum);
            i++;
            j++;
        }
        return maxSum;
    }

    public static int usingSlidingWindow(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;

        int i = 1, j = k;

        while (j < arr.length) {
            sum = sum - arr[i - 1] + arr[j];
            ans = Math.max(ans, sum);
            i++;
            j++;
        }

        return ans;
    }

    public static int getIndexOfLeastAverage(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int minSum = sum;
        int index = 0;

        int i = 1, j = B;
        while (j < A.length) {
            sum = sum - A[i - 1] + A[j];
            if (minSum > sum) {
                minSum = sum;
                index = i;
            }
            i++;
            j++;
        }

        return index;
    }

    public static int getMinSwaps(ArrayList<Integer> A, int B) { // Here in the same window we will find minimum elements which is bad for our subarray and not less than B.
        int k = 0;
        for (int values : A) {
            if (values <= B) {
                k++;
            }
        }
        int bad = 0;
        for (int i = 0; i < k; i++) {
            if (A.get(i) > B) {
                bad++;
            }
        }

        int minBad = bad;
        int i = 0, j = k;
        while (j < A.size()) {
            if (A.get(i) > B) {
                bad--;
            }
            if (A.get(j) > B) {
                bad++;
            }
            minBad = Math.min(minBad, bad);
            i++;
            j++;
        }

        return minBad;
    }

}

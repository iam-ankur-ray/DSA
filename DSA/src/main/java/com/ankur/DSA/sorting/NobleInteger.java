package com.ankur.DSA.sorting;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        int[] arr = {-1,-5,3,5,-10,4};
        int[] p = {3, 2, 1, 3};
       // System.out.println(countNobleElements(arr));
        System.out.println(IsGreaterElementCountSame(p));
    }

    /**
     * Noble elements are those elements who are equal to the count of elements lesser the element itself
     * @param arr array
     * @return count of all noble elements
     */
    public static int countNobleElements(int[] arr){
        Arrays.sort(arr);
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == i){
                answer++;
            }
        }

        return answer;
    }

    /**
     * Given an integer array A,
     * determine whether there exists an integer p in the array such that the number of integers greater than p in the array is exactly equal to p.
     *
     * If such an integer exists, return 1; otherwise, return -1.
     */

    public static int IsGreaterElementCountSame(int [] arr){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int greaterCount = n - (i + 1);

            if(i < n -1 && arr[i]==arr[i+1]){
                continue;
            }

            if(arr[i]==greaterCount){
                return 1;
            }
        }

        return 0;
    }




}

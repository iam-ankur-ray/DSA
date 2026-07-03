package com.ankur.DSA.ArraysQuestions;

public class BasicArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int number = (i + 1) * (i + 1);
            array[i] = number;
        }

        String[] strArray = {"flower","flow","flight"};
        int [] arr = {1,1,8,5,1,8,9};
        int [] arr2 = {2,2,3,4,2,3,4};
        int[][] arr3 = {arr,arr2};
       // System.out.println(strArray[0].charAt(1));


       int[] ans = findFrequency(arr, arr.length);
       printArray(arr);
       printArray(ans);
        matrix(arr3);
    }

    /**
     * Function to print the value of all elements within array
     * @param arr integers of array
     */
    public static void printArray(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     * Get the sum of an array
     * @param arr integers of array
     * @return sum of all elements
     */
    public static int getSumOfArray(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }


    /**
     * Find the maximum value from the element.
     * @param arr integers of array
     * @return maximum value available in array
     */
    public static int findMax(int[] arr){
        int max = arr[0];

        for(int j: arr){
            if(j > max){
                max = j;
            }
        }
        return max;
    }

    /**
     * Find the minimum value from the element.
     * @param arr integers of array
     * @return minimum value available in array
     */
    public static int findMin(int[] arr){
        int min = arr[0];

        for(int j: arr){
            if(j < min){
                min = j;
            }
        }
        return min;
    }

    /**
     * Find frequency of particular element.
     * @param arr array of integers
     * @param size of array
     * @param B element to find
     * @return frequency of B
     */
    public static int frequency(int[] arr, int size, int B){
        int count = 0;
        for(int i = 0; i < size; i++){
            if(B == arr[i]){
                count++;
            }
        }
        return count;
    }

    /**
     * Find frequency of all elements;
     */
    public static int[] findFrequency(int[] arr, int n){
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            ans[i] = frequency(arr,n,arr[i]);
        }
        return ans;
    }

    // 2-D arrays
    int row = 4;
    int column = 3;
    int[][] math = new int[row][column];

    public static void matrix(int[][] arr){
        for(int i = 0; i < arr[0].length; i++){
            System.out.println(arr[0][i]);
        }
    }

}

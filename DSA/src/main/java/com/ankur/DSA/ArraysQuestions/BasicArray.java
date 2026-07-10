package com.ankur.DSA.ArraysQuestions;

import java.util.ArrayList;
import java.util.Objects;

public class BasicArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int number = (i + 1) * (i + 1);
            array[i] = number;
        }

        String[] strArray = {"flower","flow","flight"};
        int[] hello = {1,2,3,4,4,5,6};
        int [] arr = {1,1,8,5,1,8,9};
        int [] arr2 = {2,2,3,4,2,3,4};
        int[][] arr3 = {arr,arr2};
       // System.out.println(strArray[0].charAt(1));


//       int[] ans = findFrequency(arr, arr.length);
//       printArray(arr);
//       printArray(ans);
//        matrix(arr3);
//        boolean isSorted = isSortedArray(hello);
//        System.out.println(isSorted);
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(2);
        array1.add(4);
        array1.add(2); array1.add(3);
        array1.add(3); array1.add(2); array1.add(5);

        System.out.println(array1);



    }

    /**
     * Function to print the rowValue of all elements within array
     * @param arr integers of array
     */
    public static void printArray(int[] arr){
        for(int rowValue : arr){
            System.out.print(rowValue + " ");
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
     * Find the maximum rowValue from the element.
     * @param arr integers of array
     * @return maximum rowValue available in array
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
     * Find the minimum rowValue from the element.
     * @param arr integers of array
     * @return minimum rowValue available in array
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

    /**
     * Print the first row of 2D array
     * @param arr of matrix
     */
    public static void matrix(int[][] arr){
        for(int i = 0; i < arr[0].length; i++){
            System.out.println(arr[0][i]);
        }
    }

    /**
     * Check if array is sorted
     */

    public static boolean isSortedArray(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        ArrayList<Integer> answer = new ArrayList<>(A.size());

        for(int i = 0; i < A.size(); i++){
            int count = 0;
            for (Integer integer : A) {
                if (integer.equals(A.get(i))) {
                    count++;
                }
            }
            answer.add(count);
        }

        return answer;
    }

}

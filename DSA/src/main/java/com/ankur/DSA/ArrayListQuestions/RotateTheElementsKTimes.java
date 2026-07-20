package com.ankur.DSA.ArrayListQuestions;

import com.ankur.DSA.util.HelperMethods;

import java.util.Scanner;

public class RotateTheElementsKTimes {
    public static void main(String[] args) {
        int[] array = HelperMethods.generateIntegerArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the times you want to rotate the array : ");
        int k = sc.nextInt();
        System.out.println("_".repeat(40));
        System.out.println("Your final answer after all rotation is this : ");
        HelperMethods.printIntegerArray(rotateTheArray(array,k));
    }

    /**
     * Rotating the array to right for k number of times.
     * @param arr integer array
     * @param k is number of rotation
     * @return our final array after all rotations.
     */
    public static int[] rotateTheArray(int[] arr, int k){
        k = k % arr.length;

        while (k > 0){
            int temp = arr[arr.length - 1];

            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i - 1];
            }

            arr[0] = temp;

            k--;
        }

        return arr;
    }
}

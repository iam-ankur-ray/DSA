package com.ankur.DSA450.array;

public class RotateByOne {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5};
        int[] ans = rotate(input);
        for(int value : ans){
            System.out.print(value + " ");
        }
    }

    public static int[] rotate(int[] arr){
        int temp = arr[arr.length-1];

        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
        return arr;
    }
}

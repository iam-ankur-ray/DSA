package com.ankur.DSA;

public class SumOfTwoLargestNumber {
    public static void main(String[] args) {
        int[] array = {7,7,8,0,10,9};
        System.out.println(getSumOfLargestTwoDigits(array));
    }

    public static int getSumOfLargestTwoDigits(int[] array){
        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        int sum = 0;

        if(array.length == 2){
            return array[0] + array[1];
        } else {

            for(int i = 1; i < array.length; i++){
                if(array[i] > largest){
                    secondLargest = largest;
                    largest = array[i];
                } else if (array[i] == largest){
                    secondLargest = largest;
                } else if(secondLargest < array[i] && array[i] < largest){
                    secondLargest = array[i];
                }

                sum = largest + secondLargest;
            }
        }

        return sum;
    }
}

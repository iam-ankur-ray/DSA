package com.ankur.InterviewLevel;

public class FindSecondLargetElement {
    public static void main(String[] args) {
        int[] array = {Integer.MIN_VALUE,Integer.MIN_VALUE};
        System.out.println(getSecondLargestElement(array));;
    }

    public static int getSecondLargestElement(int[] array){
        if(array.length == 1){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = array.length -1; i >= 0; i--){
            if(array[i] > largest){
                if(secondLargest < largest){
                    secondLargest = largest;
                }
                largest = array[i];
            } else if(array[i] < largest && array[i] > secondLargest){
                secondLargest = array[i];
            }
        }


        if(secondLargest == Integer.MIN_VALUE && largest > Integer.MIN_VALUE){
            return secondLargest;
        } else if(secondLargest == Integer.MIN_VALUE) {
            return -1;
        } else {
            return secondLargest;
        }

    }
}

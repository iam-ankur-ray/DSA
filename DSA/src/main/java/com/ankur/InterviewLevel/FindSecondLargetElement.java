package com.ankur.InterviewLevel;

public class FindSecondLargetElement {
    public static void main(String[] args) {
        int[] array = {Integer.MIN_VALUE,Integer.MIN_VALUE};
        System.out.println(getSecondLargestElement(array));;
    }

    public static int getSecondLargestElement(int[] array){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                if(secondLargest < largest){
                    secondLargest = largest;
                }
                largest = array[i];
            } else if(array[i] > secondLargest && array[i] < largest){
                secondLargest = array[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        } else {
            return secondLargest;
        }

    }
}

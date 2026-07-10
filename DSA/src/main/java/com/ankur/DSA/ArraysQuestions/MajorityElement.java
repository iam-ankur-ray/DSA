package com.ankur.DSA.ArraysQuestions;

public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {2,6,6,2,5,6,6,6,2,5,6,2,6};
        System.out.println(getTheMajorityElementFromArray(array));
    }

    /**
     * Return the majority element from an array
     * Moore’s Voting Algorithm
     * @param array list
     * @return majority element i.e., if frequency is more than length of the array
     */
    private static  int getTheMajorityElementFromArray(int[] array){
        int n = array.length;
        int candidate = array[0];
        int count = 1;

        for(int i = 1; i < n; i++){
            if(array[i] == candidate){
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                candidate = array[i];
                count = 1;
            }
        }

        count = 0;
        for(int rowValues: array){
            if(rowValues == candidate){
                count++;
            }
        }

        if(count > (n / 2)){
            return candidate;
        } else {
            return -1;
        }
    }

}

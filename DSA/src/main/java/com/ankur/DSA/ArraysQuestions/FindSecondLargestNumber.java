package com.ankur.DSA.ArraysQuestions;

import java.util.Scanner;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] simpleArray = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i < size; i++){
            simpleArray[i] = sc.nextInt();
        }

        if(size < 2){
            System.out.println(-1);
        }

        boolean hasSameElement = true;
        int secondLargest = Integer.MIN_VALUE;
        int max = simpleArray[0];

        for(int i = 0; i < size; i++){
            if(simpleArray[0]!=simpleArray[i]){
                hasSameElement = false;
            }

            if(simpleArray[i] > max){
                secondLargest = max;
                max = simpleArray[i];
            }

            if(simpleArray[i] > secondLargest && simpleArray[i] < max){
                secondLargest = simpleArray[i];
            }

        }

        if(hasSameElement){
            System.out.println(-1);
        } else {
            System.out.println(secondLargest);
        }
    }


}

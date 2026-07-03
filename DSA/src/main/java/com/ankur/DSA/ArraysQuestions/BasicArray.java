package com.ankur.DSA.ArraysQuestions;

public class BasicArray {
    public static void main(String[] args) {
        int [] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = (i+1) * (i +1);
        }

        for(int value: array){
            System.out.print(value + " ");
        }


    }
}

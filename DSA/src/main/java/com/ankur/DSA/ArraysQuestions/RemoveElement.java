package com.ankur.DSA.ArraysQuestions;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        int[] answer = new int[size - 1];
        int removeElementIndex = sc.nextInt();


        for(int i = removeElementIndex - 1; i < size - 1; i++){
            array[i] = array[i+1];
        }

        for(int i = 0; i < size - 1; i++){
            answer[i] = array[i];
        }

        for(int rowValues : answer){
            System.out.print(rowValues + " ");
        }
    }
}


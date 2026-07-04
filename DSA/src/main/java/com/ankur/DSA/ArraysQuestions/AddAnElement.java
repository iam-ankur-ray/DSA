package com.ankur.DSA.ArraysQuestions;

import java.util.Scanner;

public class AddAnElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        int index = sc.nextInt();
        int element = sc.nextInt();

        int[] answer = new int[size + 1];

        for(int i = 0; i < index -1; i++){
            answer[i] = array[i];
        }

        answer[index - 1] = element;

        for(int i = index; i <= size; i++){
            answer[i] = array[i-1];
        }

        for(int values : answer){
            System.out.print(values + " ");
        }

    }
}

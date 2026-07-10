package com.ankur.DSA.ArrayListQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements you want to add : ");
//        int size = sc.nextInt();
//
//        while(size > 0){
//            System.out.print("Enter the element you wan to add : ");
//            list.add(sc.nextInt());
//            size--;
//        }
//        ArrayList<ArrayList<Integer>> matrix = getStairCasePattern(3);
//        printMatrix(matrix);

//        System.out.println(list);
        //System.out.println(getMatrix(list));

//
//        // Operations on array list starting with add
//        list.add(5);
//
//        //Get
//        System.out.println(list.getFirst());
//        list.size();
//
//        //update an element
//        list.set(0, 10);
//        list.removeFirst();
//
//        System.out.println(list);
//
//        ArrayList list1 = new ArrayList(); //Without specifying any data type it can add anything.
//        list1.add(1);
//        list1.add("Ankur");
//        list1.add(97.5);
//        System.out.println(list1);

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0){
            int size = sc.nextInt();
            int[] array = new int[size];
            for(int i = 0; i < size; i++){
                array[i] = sc.nextInt();
            }

            int findrowValue = sc.nextInt();

            boolean rowValueFound = false;
            for(int i = 0; i < size; i++){
                if(array[i] == findrowValue){
                    rowValueFound = true;
                    break;
                }
            }

            if(rowValueFound){
                System.out.println(1);
            } else {
                System.out.println(0);
            }



            T--;
        }
    }

    public static ArrayList<Integer> getSpecificElement(ArrayList<Integer> list){
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 35 == 0) {
                answer.add(integer);
            }
        }
        return answer;
    }

    public static ArrayList<Integer> addMultipleInArray(int A, int B){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 1;
        while(B > 0){
            list.add(A * i);
            B--;
            i++;
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> getMatrix(ArrayList<Integer> list){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
      // Different rows can contain different columns.
        matrix.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 3; i < 15; i+=2){
            list2.add(i);
        }

        matrix.add(list2);

        return matrix;
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        for(ArrayList<Integer> rows : matrix){
            for(Integer columns : rows){
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> getStairCasePattern(int N){
        ArrayList<ArrayList<Integer>> stairs = new ArrayList<>();
        for(int i = 1; i <=N; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                temp.add(j);
            }
            stairs.add(temp);
        }
        return stairs;
    }
}

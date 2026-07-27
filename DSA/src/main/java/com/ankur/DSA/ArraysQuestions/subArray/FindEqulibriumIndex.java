package com.ankur.DSA.ArraysQuestions.subArray;

public class FindEqulibriumIndex {
    public static void main(String[] args) {
        int[] input = {-7, 1, 5, 2, -4, 3, 0};
        int[] check = {1,2,5,2,1};

        int answer = getEquilibriumIndex(check);
        System.out.println(answer);

//        int size = input.length;
//        while(size > 0){
//            int left = 0;
//            for(int i = 0; i < size -2; i++){
//                left += input[i];
//            }
//
//            int right = 0;
//
//            for(int i = input.length -1; i >= size -1; i--){
//                right += input[i];
//            }
//
//            if(right==left){
//                //System.out.println(size - 2);
//            }
//
//            size--;
//        }

        //System.out.println(-1);
    }

    public static int getEquilibriumIndex(int[] arr){
        int size = arr.length;

        while(size > 0){
            int left = 0;
            for(int i = 0; i < size -2; i++){
                left += arr[i];
            }

            int right = 0;
            for(int i = arr.length - 1; i >= size -1; i--){
                right += arr[i];
            }

            if(left == right){
                return size - 2;
            }

            size--;
        }

        return -1;
    }
}

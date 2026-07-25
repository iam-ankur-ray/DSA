package com.ankur.DSA.ArraysQuestions;

public class PrefixArray {

    public static void main(String[] args) {
        int [] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] queries = {{4,8}, {3,7},{1,3},{7,7},{0,3}};

        int[] cumulative = new int[arr.length]; // Prefix array
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum =  sum + arr[j];
                cumulative[i] = sum;
            }
        }
        // Alternate to find the prefix array

        int[] prefixArray = new int[arr.length];
        prefixArray[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixArray[i] = prefixArray[i -1] + arr[i];
        }

        BasicArray.printArray(cumulative);
        System.out.println();
        BasicArray.printArray(prefixArray);

        int answer = 0;
        for (int i = 0; i < queries.length; i++){
            int L = queries[i][0];
            int R = queries[i][1];

            if(L == 0){
                answer = prefixArray[R];
            } else {
                answer = cumulative[R] - cumulative[L];
            }

            System.out.print(answer + " ");
        }
    }
}

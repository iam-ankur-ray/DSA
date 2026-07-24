package com.ankur.DSA.ArraysQuestions;

public class PrefixArray {

    public static void main(String[] args) {
        int [] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] queries = {{4,8}, {3,7},{1,3},{7,7}};

        int[] cumulative = new int[arr.length]; // Prefix array
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum =  sum + arr[j];
                cumulative[i] = sum;
            }
        }

        BasicArray.printArray(cumulative);

        int answer = 0;
        for (int[] query : queries) {
            for (int j = 0; j < queries[0].length - 1; j++) {
                int firstIndex = query[j];
                int secondIndex = query[j + 1];
                answer = cumulative[secondIndex - 1] - cumulative[firstIndex - 1];
                System.out.print(answer + " ");
            }
        }
    }
}

package com.ankur.DSA.StringQuestions;

import java.util.Arrays;

public class AGproblem {
    public static void main(String[] args) {
        String A = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        System.out.println(isPrime(29));
        int[] B = {14,2,8,5,3};
        int[] p = {0,1,1,2,3};

    }

    /**
     * You have given a string A having Uppercase English letters.
     *
     * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
     */
    public static int getSumOfAGPairs(String A){
        int first = 0;
        int sum = 0;

        for(int i = A.length()-1; i >= 0; i--){
            if(A.charAt(i)=='G'){
                first++;
            }

            if(A.charAt(i) == 'A'){
                sum += first;
            }
        }

        return sum;
    }

    public static boolean isPrime(int N){
        int factors = 0;
        for(int i = 1; i <= N; i++){
            if(N % i ==0){
                factors++;
            }
        }

        if(factors==2){
            return true;
        }

        return false;
    }
}

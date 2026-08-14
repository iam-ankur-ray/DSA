package com.ankur.DSA.StringQuestions;

public class AGproblem {
    public static void main(String[] args) {
        String A = "GUGPUAGAFQBMPYAGGAAOALAELGGGAOGLGEGZ";
        System.out.println(getSumOfAGPairs(A));
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
}

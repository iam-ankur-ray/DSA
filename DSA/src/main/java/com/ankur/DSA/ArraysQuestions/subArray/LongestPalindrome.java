package com.ankur.DSA.ArraysQuestions.subArray;

public class LongestPalindrome {
    public static void main(String[] args) {
        String a = "bmadamaa";
        System.out.println(longestPalindrome(a));
    }
    public static String longestPalindrome(String A) {
        int size = A.length();
        int start = 0;
        int end = 0;
        int longest = 1;

        //if n is odd
       for(int i = 0; i < size; i++){
           int oddSize = expand(A,i,i);
           longest = Math.max(longest,oddSize);
           if(longest == oddSize){
               start = i - longest/2;
               end = i + longest/2 + 1;
           }
       }

        for(int i = 0; i < size-1; i++){
            int evenSize = expand(A,i,i+1);
            longest = Math.max(longest,evenSize);
            if(longest == evenSize){
                start = i - longest/2;
                end = i + longest/2 + 1;
            }
        }

       return A.substring(start,end);
    }

    public static int expand(String A, int c1, int c2){
        while(c1 >= 0 && c2 < A.length() && A.charAt(c1)==A.charAt(c2)){
            c1--; c2++;
        }
        return c2 - c1 - 1;
    }
}


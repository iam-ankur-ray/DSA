package com.ankur.DSA.ArraysQuestions.subArray;

import java.util.Scanner;

public class LongestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String a = sc.next();
        System.out.println();
        System.out.println(longestPalindrome(a));
    }
    public static String longestPalindrome(String A) {
        int size = A.length();
        int start = 0;
        int end = 1;
        int longest = 1;

        //if n is odd
       for(int i = 0; i < size; i++){
           int oddSize = expand(A,i,i);
           if(longest < oddSize){
               start = i - oddSize/2;
               end = i + oddSize/2 + 1;
           }
           longest = Math.max(longest,oddSize);
       }
        //even
        for(int i = 0; i < size-1; i++){
            int evenSize = expand(A,i,i+1);
            if(longest < evenSize){
                start = i - evenSize/2 + 1; //for size 4 and palindrome size 4, mid(i) will be 1, start = 1 - 4/2 -1 = 0, end = 1 + 2 + 1 = 4(condition fulfilled)
                end = i + evenSize/2 + 1;
            }
            longest = Math.max(longest,evenSize);
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


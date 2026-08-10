package com.ankur.DSA.StringQuestions;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        String h = "I love java";
        System.out.println(reverseWord(h));
    }

    private static String reverseWord(String s){
        String[] words = s.split("\\s");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString();
    }
}

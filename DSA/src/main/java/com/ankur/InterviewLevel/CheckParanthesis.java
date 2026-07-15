package com.ankur.InterviewLevel;

public class CheckParanthesis {
    public static void main(String[] args) {
        String paranthesis = "((()))()";
        System.out.println(isValidParanthesis(paranthesis));
    }

    public static boolean isValidParanthesis(String value){
        int countOpen = 0;
        int countClosed = 0;

        for(int i = 0; i < value.length();i++){
            if(value.charAt(i)=='('){
                countOpen++;
            } else {
                countClosed++;
            }

            if(countClosed > countOpen){  // Whenever closed count is greater than open it will be invalid syntax. i.e., (()))())
                return false;
            }
        }
        if(countOpen == countClosed){
            return true;
        } else {
            return false;
        }
    }
}

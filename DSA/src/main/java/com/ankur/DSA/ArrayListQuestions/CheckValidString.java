package com.ankur.DSA.ArrayListQuestions;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.isLowerCase;

public class CheckValidString {
    public static void main(String[] args) {
        System.out.println(isValidString("Goooogle"));
    }

    public static boolean isValidString(String str){
        if(str.length()==1){
            return true;
        }

        char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        boolean expectedUpper = isUpperCase(firstChar) && isUpperCase(secondChar);
        boolean expectedLower = isUpperCase(firstChar) && isLowerCase(secondChar);
        boolean firstLower = isLowerCase(firstChar);

        for(int i = 1; i < str.length(); i++){
            char current = str.charAt(i);

            if(firstLower && isUpperCase(current)){
                return false;
            }

            if(expectedUpper && isLowerCase(current)){
                return false;
            }

            if(expectedLower && isUpperCase(current)){
                return false;
            }

        }

        return true;
    }

}

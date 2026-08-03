package com.ankur.DSA.ArrayListQuestions;

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

        boolean expectedUpper = Character.isUpperCase(firstChar) && Character.isUpperCase(secondChar);
        boolean expectedLower = Character.isUpperCase(firstChar) && Character.isLowerCase(secondChar);
        boolean firstLower = Character.isLowerCase(firstChar);

        for(int i = 1; i < str.length(); i++){
            char current = str.charAt(i);

            if(firstLower && Character.isUpperCase(current)){
                return false;
            }

            if(expectedUpper && Character.isLowerCase(current)){
                return false;
            }

            if(expectedLower && Character.isUpperCase(current)){
                return false;
            }

        }

        return true;
    }

}

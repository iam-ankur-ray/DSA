package com.ankur.DSA;

public class StringQuestions {

    public static void getCharactersFromString(String value){
        for(int i = 0; i < value.length(); i++){
            System.out.println((int)value.charAt(i));
        }
    }

    public static void main(String[] args) {
        getCharactersFromString("India");
    }
}

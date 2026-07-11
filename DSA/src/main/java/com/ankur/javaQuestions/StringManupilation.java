package com.ankur.javaQuestions;

public class StringManupilation {

    public static void main(String[] args) {
        System.out.println(getCharWithIndexingOneForLowerCaseString("static"));
        System.out.println(getUpperCase("ankur"));
        if("".isEmpty()){
            System.out.println("Blank");
        }

    }

    public static String getUpperCase(String A) { //Only for single word lower case string without any special character
        char[] answer = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            int upper = A.charAt(i) - 32;
            answer[i] = (char) upper;
        }
        return new String(answer);
    }

    public static String getCharWithIndexingOneForLowerCaseString(String A) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            answer.append(A.charAt(i));
            int value = A.charAt(i) - 'a' + 1;
            answer.append(value);
        }
        return answer.toString();
    }

//    public static int checkPamQuestion(String A){
//        if(A.isEmpty()){
//            System.out.println("Blank");
//        }
//    }

}

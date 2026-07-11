package com.ankur.javaQuestions;

public class CheckPM {
    public static void main(String[] args) {
        int answer = checkPma("mpampammapmm");
        System.out.println(answer);
    }

    public static int checkPma(String A) {
        if (A.length() % 2 != 0) {
            return 0;
        }

        int countA = 0;
        int countM = 0;
        int countP = 0;


        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a') {
                countA++;
            } else if (A.charAt(i) == 'm') {
                countM++;
            } else if (A.charAt(i) == 'p') {
                countP++;
            }
        }

        if(countM == countA + countP) {
            return 1;
        } else {
            return 0;
        }
    }
}

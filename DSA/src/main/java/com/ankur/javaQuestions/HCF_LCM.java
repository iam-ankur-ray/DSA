package com.ankur.javaQuestions;

public class HCF_LCM {
    public static void main(String[] args) {
        System.out.println(getHCF(33,48));
    }

    /**
     * Find the HCF
     */
    private static int getHCF(int a, int b){
        int c = Math.min(a,b);
        int hcf = 1;

        for(int i = 2; i <= c; i++){
            if(a % i ==0 && b % i == 0){
                hcf = i;
            }
        }
        return hcf;
    }

    /**
     * Find LCM
     */
    private static int getLCM(int a, int b){
        int LCM = Math.max(a, b);
        for(int i = LCM; i <= a * b; i++){
            if(i % a ==0 && i % b ==0){
                LCM = i;
                break;
            }
        }
        return LCM;
    }
}

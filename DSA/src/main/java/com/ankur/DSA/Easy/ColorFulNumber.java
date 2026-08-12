package com.ankur.DSA.Easy;


import java.util.HashSet;
import java.util.Set;

public class ColorFulNumber {
    public static void main(String[] args) {
        int num = 3425;
        boolean isColorful = isColorful(num);
        System.out.println(isColorful);
    }

    public static boolean isColorful(int num){
       String strNum = Integer.toString(num);

        Set<Integer> numberSet = new HashSet<>();

        for(int i = 0; i < strNum.length(); i++){
            int muliple = 1;
            for(int j = i; j < strNum.length(); j++){
                int number = strNum.charAt(j) - '0';
                muliple *= number;
                if(numberSet.contains(muliple)){
                    return false;
                }

                numberSet.add(muliple);
            }
        }

        return true;
    }

}

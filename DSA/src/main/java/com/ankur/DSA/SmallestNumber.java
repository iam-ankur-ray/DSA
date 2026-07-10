package com.ankur.DSA;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(getSmallestNumber(number));
    }

    /**
     * Method to return the concatenation of smallest numbers which can be multiple of any integer.
     * @param number any integer rowValue
     * @return concatenated numerical rowValue whose product is equivalent to input of the integer rowValue. i.e., input = 100, output = 445 (as 4*4*5 = 100)
     */
    private static int getSmallestNumber(int number) {
        StringBuilder answer = new StringBuilder();
        for(int divsibleNumbers = 9; divsibleNumbers > 1; divsibleNumbers--) {
            while(number % divsibleNumbers == 0){
                number = number / divsibleNumbers;
                answer.insert(0, divsibleNumbers);
            }
        }

        if(number != 1){
            return -1;
        }
           return Integer.parseInt(answer.toString());
    }
}

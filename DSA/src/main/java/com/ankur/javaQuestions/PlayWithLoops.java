package com.ankur.javaQuestions;

import java.util.Scanner;


public class PlayWithLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input > 0){
            int number = sc.nextInt();
            System.out.println(isPerfectNumber(number));
            input--;
        }


    }


    public static void multipleOfFour(int rowValue){
        for(int i = 4; i <= rowValue; i+=4){
            System.out.print(i + " ");
        }
    }

    /**
     * Get perfect square till N
     */
    public static void getPerfectSquare(int rowValue){
        for(int i = 1; i <= rowValue; i++){
            if(i * i > rowValue) break;
            System.out.println(i * i);
        }
    }

    /**
     * Get the reverser of an integer
     */
    public static int getReverse(int rowValue){
        int reverse = 0;
        while(rowValue > 0){
            int remainder = rowValue % 10;
            reverse = reverse * 10 + remainder;
            rowValue /= 10;
        }
        return reverse;
    }

    /**
     * Get the sum of digits for numerous inputs
     */
    public static void sumOfDigits(int input){
        for(int i = 0; i < input; i++){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int count =0;
            for(; number > 0; number /= 10){
                count++;
            }
            System.out.println(count);
        }
    }

    private static int findNumberOfFactors(int input) {
        int factors = 0;
        for(int i = 1; i<= input; i++){
            if(input % i == 0){
                factors++;
            }
        }
        return factors;
    }

    private static void getPrimeNumbers(int N){
        if(findNumberOfFactors(N)==2){
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }

    private static boolean isPerfectNumber(int input){
        int sum = 0;
        for(int i =1; i < input; i++){
            if(input % i == 0){
                sum += i;
            }
        }
        if(sum == input) return true;
        else return false;
    }
}


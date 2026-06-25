package com.ankur.javaQuestions;

import java.lang.*;
import java.util.*;

public class Palindrome {

        public static void main(String[] args) {
            System.out.println(getPower(5,5));
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int temp = input;

            int potentialPolindrome = 0;
            while(input > 0){
                int remainder = input % 10;
                potentialPolindrome = potentialPolindrome * 10 + remainder;
                input = input / 10;
            }

            if(temp == potentialPolindrome){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        public static int getPower(int a, int b){
            if(a == 1 || b == 1){
                return 1;
            }
            int answer = a;

            for(int i = 2; i <=b; i++){
                answer = answer * b;
            }
            return answer;
        }
}

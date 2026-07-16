package com.ankur.InterviewLevel;

import java.util.Scanner;
import java.util.Set;

public class FindVowelAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests > 0){
            String input = sc.next();
            Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');

            int vowelCount = 0;
            int consonantCount = 0;
            for(int i = 0; i < input.length(); i++){
                if(vowels.contains(input.charAt(i))){
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            System.out.print(vowelCount + " " + consonantCount);


            tests--;
        }
    }
}

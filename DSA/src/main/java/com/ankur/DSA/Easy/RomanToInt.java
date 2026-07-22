package com.ankur.DSA.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        System.out.println(romanToInteger(roman));
    }

    public static HashMap<Character, Integer> romanToIntMap() {
        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        return romanToIntMap;
    }

    public static int romanToInteger(String romanValue) {

        HashMap<Character, Integer> map = romanToIntMap();
        int size = romanValue.length();

        int answer = 0;
        for (int i = 0; i < size - 1; i++) {

            char currentRomanCharacter = romanValue.charAt(i);
            char nextRomanCharacter = romanValue.charAt(i + 1);
            int currentValue = map.get(currentRomanCharacter);
            int nextValue = map.get(nextRomanCharacter);

            if (currentValue >= nextValue) {
                answer += currentValue;
            } else {
                answer -= currentValue;
            }
        }

        char lastCharacter = romanValue.charAt(size - 1);

        answer += map.get(lastCharacter);

        return answer;
    }
}

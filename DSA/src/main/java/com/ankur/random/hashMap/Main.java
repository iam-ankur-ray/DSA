package com.ankur.random.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,2,1,3,5,1,5,3,4,4};
        printFrequency(arr);
    }

    public static void printFrequency(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for(int value: arr){
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        System.out.println(frequency);
        // Alternate way to print neatly
        for(Map.Entry<Integer,Integer> entry : frequency.entrySet()){
            System.out.println(entry.getKey() + " Occurs " + entry.getValue() + " times.");
        }
    }
}

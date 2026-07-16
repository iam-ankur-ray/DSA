package com.ankur.InterviewLevel;

import java.util.HashMap;
import java.util.TreeMap;

public class HighestFrequency {
    public static void main(String[] args) {
        int[] array = {1,3,3,2,3,3,4,2};
        System.out.println(getMostFrequentElement(array));
    }

    public static int getMostFrequentElement(int[] array){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            frequencyMap.put(i, frequencyMap.getOrDefault(i,0)+1); // Same method to replace if and else condition.
        }

        int maxCount =0;
        int maxValue = 0;
        for(Integer keys : frequencyMap.keySet()){
            if(frequencyMap.get(keys)>maxCount){
                maxCount = frequencyMap.get(keys);
                maxValue = keys;
            }
        }
        return maxValue;
    }
}

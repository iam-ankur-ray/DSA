package com.ankur.StringsAndHashing;

import java.util.HashMap;

public class PopulationQuestion {
    public static int populationWithLessThanK(HashMap<String, Integer> H, int K){
        int countries = 0;
        for(String keys : H.keySet()){
            if(H.get(keys) < K){
                countries++;
            }
        }

        return countries;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> countries = new HashMap<>();
        countries.put("India",12);
        countries.put("Pakistan",9);
        countries.put("China",8);
        countries.put("Honkong",7);
        int K = 10;
        System.out.println(populationWithLessThanK(countries,K));
    }
}

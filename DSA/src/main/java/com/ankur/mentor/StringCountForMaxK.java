package com.ankur.mentor;

public class StringCountForMaxK {
    public static void main(String[] args) {
        String s = "ABABCCCAAAABBCCCBBAA";
        System.out.println(getShortestCount(s,4));
    }

    public static int getShortestCount(String s, int k){
        int answer = 0;
        int i = 0, j = k;

        while(j <= s.length()){
           int fc = frequencyCount(s.substring(i,j));
            answer += k - fc;

            i += k;
            j += k;
        }

        return answer;
    }

    public static int frequencyCount(String s){
        int[] frequency = new int[26];
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i) - 'a']++;
        }

        int maxFrequency = 0;
        for(int freq : frequency){
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        return maxFrequency;
    }
}

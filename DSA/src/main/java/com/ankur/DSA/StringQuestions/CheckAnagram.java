package com.ankur.DSA.StringQuestions;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("secure", "rescue"));
    }

    /**
     * Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
     */
    public static boolean isAnagram(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int[] alphabets = new int[26];
        for (int i = 0; i < A.length(); i++) {
            alphabets[A.charAt(i) - 'a']++;
            alphabets[B.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (alphabets[i] != 0) {
                return false;
            }
        }

        return true;
    }
}

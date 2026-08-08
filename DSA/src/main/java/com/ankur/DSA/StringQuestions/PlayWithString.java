package com.ankur.DSA.StringQuestions;

public class PlayWithString {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String input = sc.next();
       // System.out.println(stringManipulation(input));
        System.out.println(isPalindrome("2Ab1ba2"));
    }

    /**
     * Concatenate the string with itself.
     * Delete all the uppercase letters.
     * Replace each vowel with '#'.
     */
    public static String stringManipulation(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(deleteUpper(str));
        String doubleString = sb.append(sb).toString();
        return replaceVowel(doubleString);
    }

    public static String deleteUpper(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') continue;
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String replaceVowel(String str){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u'){
                sb.append('#');
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char c1 = toLowerAscii(s.charAt(left));
            char c2 = toLowerAscii(s.charAt(right));
            if (c1 != c2) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static char toLowerAscii(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }
}

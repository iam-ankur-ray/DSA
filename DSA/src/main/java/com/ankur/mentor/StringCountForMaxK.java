package com.ankur.mentor;

public class StringCountForMaxK {
    public static void main(String[] args) {
        String s = "AAABBB";
        System.out.println(getShortestCount(s,3));
    }

    public static int getShortestCount(String s, int k){
        int answer = 0;
        int i = 0, j = k;
        while(j < s.length()){
            int count = 0;
            for(int ch = i; ch < j; ch++){ 
                for(int nextCh = i + 1; nextCh < j; nextCh++){
                    int nextCount = 0;
                    if(s.charAt(ch) == s.charAt(nextCh)){
                        nextCount++;
                    }
                    count = Math.max(count, nextCount) - 1;
                }
            }
            answer += k - count;

            i += k;
            j += k;
        }

        return answer;
    }
}

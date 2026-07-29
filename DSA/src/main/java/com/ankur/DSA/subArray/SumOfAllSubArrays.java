package com.ankur.DSA.subArray;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {-4,1,3,2};
        System.out.println(usingContribution(arr));
    }

    public static int bruteForce(int [] arr){
        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    ans += arr[k];
                }
            }
        }

        return ans;
    }

    public static int usePrefixSum(int[] arr){
        int ans = 0;

        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length;j++){
                int sum = 0;
                if(i==0){
                    sum += prefix[j];
                } else {
                    sum = prefix[j] - prefix[i-1];
                }

                ans += sum;
            }
        }

        return ans;
    }

    public static int usingCurrentSumCarryForward(int[] arr){
        int answer = 0;

        for(int i = 0; i < arr.length; i++){
            int currentSum = 0;
            for(int j = i; j < arr.length; j++){
                currentSum += arr[j];
                answer += currentSum;
            }
        }

        return answer;
    }

    public static int usingContribution(int[] arr){
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            ans += (i + 1) * (arr.length - i) * arr[i];
        }
        return ans;
    }

    // For size k of any subarray total number of those arrays will be size - k + 1;

}

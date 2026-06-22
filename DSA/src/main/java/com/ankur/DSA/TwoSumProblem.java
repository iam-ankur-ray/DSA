package com.ankur.DSA;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {
    static int[] arr = {3,2,4,9};
    static  int target = 2;

    public static void main(String[] args) {
       int[] answer = twoDiffernce(arr,target);
       System.out.println(Arrays.toString(answer));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];
        HashMap<Integer,Integer> integers = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int secondNumber = target - nums[i];
            if (integers.containsKey(secondNumber)) {
                answer[0] = integers.get(secondNumber);
                answer[1] = i;
                break;
            }
            integers.put(nums[i], i);
        }

        return answer;
    }

    /**
     * Practising similar question
     * Given: array and int k where k is difference of two numbers present in array
     * example arr = {6,5,9,2}, k = 7, pair is 9 and 2 whose index is 2 and 3
     */

    public static int[] twoDiffernce(int[] array, int target){

        int [] answer = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int plus = array[i] + target;
            int minus = array[i] - target;

            if(map.containsKey(plus)){
                answer[0] = map.get(plus);
                answer[1] = i;
                return answer;
            }
            if(map.containsKey(minus)){
                answer[0] = map.get(minus);
                answer[1] = i;
                return answer;
            }
            map.put(array[i], i);
        }
        return answer;
    }


















}

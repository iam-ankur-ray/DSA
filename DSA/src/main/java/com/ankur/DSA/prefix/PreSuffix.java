package com.ankur.DSA.prefix;

import com.ankur.DSA.util.HelperMethods;

public class PreSuffix {
    public static void main(String[] args) {
        int[] arr = {-969,-948,350,150,-59,724,966,430,107,-809,-993,337,457,-713,753,-617,-55,-91,-791,758,-779,-412,-578,-54,506,30,-587,168,-100,-409,-238,655,410,-641,624,-463,548,-517,595,-959,602,-650,-709,-164,374,20,-404,-979,348,199,668,-516,-719,-266,-947,999,-582,938,-100,788,-873,-533,728,-107,-352,-517,807,-579,-690,-383,-187,514,-691,616,-65,451,-400,249,-481,556,-202,-697,-776,8,844,-391,-11,-298,195,-515,93,-657,-477,587};
        int[] array = {1,2,3,4,5};
        int answer = getMaximumSum(array, 2);
        System.out.println("Maximum sum of removed element is : " + answer);
    }

    private static int getMaximumSum(int[] arr, int a) {
        int size = arr.length;
        int[] prefix = new int[size];

        prefix[0] = arr[0];
        for(int i = 1; i < size; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        int[] suffix = new int[size];
        suffix[size - 1] = arr[size - 1];
        for(int i = size - 2; i >= 0; i--){
            suffix[i] = suffix[i+1] + arr[i];
        }

        System.out.println("Prefix of the array is this: ");
        HelperMethods.printIntegerArray(prefix);
        System.out.println();
        System.out.println("Suffix of the array is this: ");
        HelperMethods.printIntegerArray(suffix);
        System.out.println();

        int answer = Math.max(prefix[a-1], suffix[size - a]); //First checking all the left array sum or right array sum

        for(int i = 1; i < a; i++){
            int sum = prefix[i - 1] + suffix[size - (a - i)]; // Now removing one element from left while adding one element to the right
            answer = Math.max(answer,sum);
        }

        return answer;
    }
}

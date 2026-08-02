package com.ankur.DSA.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CostToEmptyArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        System.out.println(minimumCostToEmptyArray(arr));
    }

    /**
     * Calculate the cost to remove each element is the sum of current remaining elements
     * @param array integer array
     * @return minimum cost to empty it.
     */
    public static int minimumCostToEmptyArray(final List<Integer> array){
        System.out.println("Original Array");
        System.out.println(array);
        Collections.sort(array);
        System.out.println("After sorting the array");
        System.out.println(array);
//        ArrayList<Integer> prefix = new ArrayList<>();  Brute force
//        prefix.addFirst(array.getFirst());
//        for(int i = 1; i < array.size(); i++){
//            prefix.add(i, prefix.get(i-1)+array.get(i));
//        }
//
//        System.out.println("Our prefix array");
//        System.out.println(prefix);

        int cost = 0;
        for(int i = 0; i < array.size(); i++){
            cost += array.get(i) * (array.size() - i);  //optimised approach as the cost of 1st element will come n times and n^the element just one time.
        }
        System.out.print("Minimum cost to empty the array is : ");
        return cost;
    }
}

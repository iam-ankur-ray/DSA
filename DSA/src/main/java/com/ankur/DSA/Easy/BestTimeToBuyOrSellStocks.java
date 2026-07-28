package com.ankur.DSA.Easy;

import com.ankur.DSA.util.HelperMethods;

import java.util.ArrayList;

public class BestTimeToBuyOrSellStocks {
    public static void main(String[] args) {
        int[] stockPrices = HelperMethods.generateIntegerArray();
        int profit = stockProfit(stockPrices);
        System.out.println(profit);
    }

    /*
    Broot force solution.
     */
    public static int maximumProfit(int[] price){

        int maxProfit = 0;

        for(int i = 0; i < price.length; i++){
            int max = price[i];

            for(int j = i +1; j < price.length; j++){
                if(price[j] > max){
                    max = price[j];
                }
            }

            int profit = max - price[i];

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    /**
     * Carry forward the maximum from right hand side.
     */
    public static int stockProfit(int[] arr){
        int maxProfit = 0;
        int max = arr[arr.length - 1];

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
            }

            int profit = max - arr[i];

            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}

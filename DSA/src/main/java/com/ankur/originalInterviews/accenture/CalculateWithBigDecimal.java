package com.ankur.originalInterviews.accenture;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateWithBigDecimal {
    public static void main(String[] args) {
        String price = "87.4567";
        String quantity = "3";
        String scale = "4";
        String roundingMode = "HALF_UP";
        BigDecimal answer = getTheTotalPrice(price, quantity,scale, roundingMode );
        System.out.println(answer);
    }

    public static BigDecimal getTheTotalPrice(String price, String quantity, String scale, String roundingMode){
        BigDecimal BdPrice = new BigDecimal(price);
        BigDecimal BdQuantity = new BigDecimal(quantity);
        BigDecimal answer = BdPrice.multiply(BdQuantity);
        return answer.setScale(Integer.parseInt(scale), RoundingMode.valueOf(roundingMode));
    }
}
